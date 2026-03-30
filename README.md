# 🔲 QR Code Generator API

Uma API REST desenvolvida com **Java + Spring Boot** capaz de gerar **QR Codes** de forma simples, rápida e eficiente.

O projeto foi criado com base em um **tutorial do YouTube**, mas foi adaptado e personalizado para reforçar conceitos importantes do desenvolvimento backend, como organização de código, separação de responsabilidades e uso de bibliotecas externas.

A aplicação recebe um texto ou URL e retorna o caminho de uma imagem QR Code gerada automaticamente, pronta para ser utilizada em sistemas, sites ou integrações.

Este projeto representa um passo importante na evolução dos meus estudos em desenvolvimento backend, consolidando conhecimentos fundamentais e preparando a base para aplicações mais completas no futuro.

---

# 🚀 Tecnologias utilizadas

- ☕ Java 17+
- 🌱 Spring Boot
- 🔲 ZXing (biblioteca utilizada para geração de QR Code)
- 📦 Maven
- 🔗 REST API
- 🧱 Arquitetura em camadas

---

# 💡 Sobre o projeto

O objetivo principal deste projeto foi colocar em prática conceitos essenciais do desenvolvimento backend, focando na criação de uma API funcional e bem estruturada.

Durante o desenvolvimento, foram trabalhados pontos importantes como:

- criação de endpoints REST
- separação de responsabilidades entre controller e service
- utilização de DTOs para comunicação entre camadas
- geração de arquivos de imagem dinamicamente
- tratamento de exceções
- organização do código de forma limpa e escalável
- preparação da aplicação para integração futura com serviços de armazenamento em nuvem

Mesmo sendo um projeto simples, ele demonstra a base necessária para evoluir para aplicações mais robustas e completas.

---

# 📡 Como funciona

A API recebe uma requisição contendo um texto ou link.

Esse conteúdo é processado pelo backend que gera uma imagem de QR Code utilizando a biblioteca ZXing.

A imagem é salva localmente e o caminho do arquivo é retornado como resposta da API.

O QR Code pode representar qualquer tipo de informação, como:

- links de sites
- textos personalizados
- contatos
- emails
- números de telefone
- qualquer string

---

# 🔧 Exemplo de requisição

POST:
http://localhost:8080/qrcode

Body:
{
"text": "https://google.com"
}

Resposta:
{
"path": "qrcodes/550e8400-e29b-41d4-a716-446655440000.png"
}


---

# 🧠 Conceitos praticados

Este projeto permitiu praticar:

- desenvolvimento de APIs REST com Spring Boot
- boas práticas de organização de código
- uso de DTOs
- separação de responsabilidades
- integração com bibliotecas externas
- geração dinâmica de arquivos
- tratamento de erros
- estrutura preparada para expansão futura

---

# 🎯 Objetivo de aprendizado

Este projeto faz parte da minha jornada de evolução como desenvolvedor backend.

O foco foi praticar a criação de APIs e melhorar a compreensão sobre:

- estrutura de projetos Spring Boot
- fluxo de requisição e resposta
- organização de código de forma profissional
- adaptação de conteúdos técnicos
- aplicação prática da teoria

Cada novo projeto contribui para aprofundar conhecimentos e evoluir na área de desenvolvimento de software.

---

Sempre buscando evoluir, aprender mais e construir projetos cada vez melhores.
