package com.arthurdev.qrcode.generator.service;

import com.arthurdev.qrcode.generator.dto.QrCodeGenerateResponse;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import org.springframework.stereotype.Service;

import java.io.File;
import java.nio.file.Path;
import java.util.UUID;

@Service
public class QrCodeGeneratorService {

    public QrCodeGenerateResponse generateQrCode(String text) {

        try {

            int width = 200;
            int height = 200;

            QRCodeWriter qrCodeWriter = new QRCodeWriter();

            BitMatrix bitMatrix = qrCodeWriter.encode(
                    text,
                    BarcodeFormat.QR_CODE,
                    width,
                    height
            );

            // nome único para o arquivo
            String fileName = UUID.randomUUID().toString() + ".png";

            // pasta onde será salvo
            String directory = "qrcodes";

            File folder = new File(directory);

            // cria a pasta se não existir
            if (!folder.exists()) {
                folder.mkdirs();
            }

            Path path = new File(directory + "/" + fileName).toPath();

            MatrixToImageWriter.writeToPath(
                    bitMatrix,
                    "PNG",
                    path
            );

            return new QrCodeGenerateResponse(path.toString());

        } catch (Exception e) {

            throw new RuntimeException("Erro ao gerar QR Code", e);

        }
    }
}