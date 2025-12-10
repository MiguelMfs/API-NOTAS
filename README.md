# API-NOTAS

## 📝 Descrição
API-NOTAS é uma API REST desenvolvida em **Java** utilizando **Spring Boot** para gerenciamento de notas escolares ou acadêmicas.  
Permite operações de **CRUD** de forma simples, utilizando endpoints HTTP.

---

## 👥 Alunos
- Miguel Santos - Matrícula: 202310207760
- Diego Chagas - Matrícula: 202420800097

---

## 🛠️ Tecnologias e Linguagens Utilizadas
- **Java** — Linguagem principal de implementação.
- **Spring Boot** — Framework para desenvolvimento de APIs REST.
- **Maven** — Gerenciador de dependências e build do projeto.
- **JMeter** - Teste de carga

---

## 📽️ Link do vídeo de apresentação:
- https://youtu.be/9wQ0Cv9YYK0?feature=shared

---

## 📁 Estrutura de Pastas

```text
api-notas/
├── src/
│   ├── main/
│   │   ├── java/com/f1/         # Pacote principal com classes da API
│   │   │   ├── Main.java        # Classe principal para inicialização da aplicação
│   │   │   ├── controllers/     # Endpoints da API
│   │   │   │   └── NotaController.java
│   │   │   ├── models/          # Modelos de dados
│   │   │   │   └── Nota.java
│   │   │   ├── services/        # Lógica de negócios
│   │   │   │   └── NotaService.java
│   │   │   └── repositories/    # Repositórios de dados
│   │   │       └── NotaRepository.java
│   │   └── resources/
│   │       └── application.properties  # Configurações da aplicação
├── pom.xml                    # Configuração do Maven
└── README.md                  # Documentação do projeto

