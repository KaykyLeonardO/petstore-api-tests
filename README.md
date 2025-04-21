# 🐾 PetStore API Tests

Este repositório contém testes automatizados desenvolvidos para validar os principais endpoints da API pública [Swagger PetStore](https://petstore.swagger.io/), utilizando **Java 11+**, **Rest Assured 4.5.1**, **JUnit 4.13.2** e **Maven 3.9.6**.

---

## 📋 Objetivo

Demonstrar habilidades práticas em automação de testes de API, garantindo que os endpoints estejam respondendo conforme o esperado, simulando diferentes cenários de uso.

---

## 🛠 Tecnologias Utilizadas

- ✅ Java 11+
- ✅ [Rest Assured 4.5.1](https://github.com/rest-assured/rest-assured)
- ✅ [JUnit 4.13.2](https://junit.org/junit4/)
- ✅ [Apache Maven 3.9.6](https://maven.apache.org/)

---

## 📁 Estrutura do Projeto

```plaintext
petstore-api-tests/
├── src/
│   └── test/
│       └── java/
│           └── com/
│               └── petstore/
│                   └── PetStoreTests.java
├── target/                     # Ignorar, será gerado pelo Maven
├── README.md                   # Arquivo de descrição do projeto
├── DOCUMENTO_DE_TESTES.md      # Relatório dos testes realizados
└── pom.xml                     # Arquivo de configuração do Maven

---

## 🚀 Como Rodar os Testes

### Requisitos:

- Java 11 ou superior
- Maven 3.9.6 ou superior

### Passo a Passo:

1. Clone o repositório:
   ```bash
   git clone https://github.com/KaykyLeonardO/petstore-api-tests.git
