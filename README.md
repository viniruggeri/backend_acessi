# backend_acessi

Backend do projeto Acessi desenvolvido em Java e Quarkus para expor os endpoints necessários para o CRUD da plataforma.

## Descrição

Este repositório contém o backend do projeto Acessi, criado para gerenciar os dados e operações da plataforma. Ele utiliza o framework Quarkus, que oferece alta performance e suporte otimizado para aplicações cloud-native. O projeto também inclui um Dockerfile para facilitar o containerização.

## Tecnologias Utilizadas

- **Java** (99.7%) — Linguagem principal para desenvolvimento.
- **Quarkus** — Framework Java para microserviços e aplicações cloud-native.
- **Docker** (0.3%) — Utilizado para criar imagens e distribuir o backend de forma eficiente.

## Funcionalidades

- CRUD de dados da plataforma Acessi
- Endpoints RESTful otimizados
- Suporte para deploy em containers Docker

## Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/viniruggeri/backend_acessi.git
   ```

2. Acesse o diretório do projeto:
   ```bash
   cd backend_acessi
   ```

3. Compile e execute o projeto localmente:
   ```bash
   ./mvnw quarkus:dev
   ```
   ou, se estiver usando Maven instalado:
   ```bash
   mvn quarkus:dev
   ```

4. Para executar via Docker:
   - Construa a imagem Docker:
     ```bash
     docker build -t backend_acessi .
     ```
   - Execute o container:
     ```bash
     docker run -p 8080:8080 backend_acessi
     ```

5. Acesse os endpoints pela URL padrão:
   ```
   http://localhost:8080/
   ```

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests com melhorias, correções ou sugestões.

## Licença

Este projeto foi desenvolvido para o funcionamento da plataforma Acessi. 

---

> Projeto desenvolvido por [viniruggeri](https://github.com/viniruggeri)
