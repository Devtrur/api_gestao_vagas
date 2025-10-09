# Gestão de Vagas

![Java](https://img.shields.io/badge/Java-17-blue?logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-Backend-green?logo=springboot)
![PostgreSQL](https://img.shields.io/badge/Database-PostgreSQL-blue?logo=postgresql)
![Docker](https://img.shields.io/badge/Container-Docker-blue?logo=docker)
![AWS](https://img.shields.io/badge/Cloud-AWS-orange?logo=amazonaws)
![Render](https://img.shields.io/badge/Deploy-Render-purple?logo=render)
![CI/CD](https://img.shields.io/badge/CI/CD-GitHub%20Actions-blue?logo=githubactions)

## Sobre o Projeto

**Gestão de Vagas** é uma aplicação backend desenvolvida com **Spring Boot** e **Java 17**, criada com o objetivo de **gerenciar o fluxo de vagas de emprego** entre **empresas** e **candidatos**.

O sistema implementa autenticação via **JWT**, persistência com **PostgreSQL** (e **H2** em ambiente local para testes), além de estar **containerizado com Docker** e **implantado na nuvem (Render + AWS EC2)** com pipeline de **CI/CD automatizado** via **GitHub Actions**.

## Tecnologias Utilizadas

| Categoria | Tecnologias |

| **Linguagem** | Java 17 |
| **Framework** | Spring Boot (Web, Security, JPA) |
| **Banco de Dados** | PostgreSQL (produção) / H2 (desenvolvimento) |
| **Segurança** | JWT (JSON Web Token) |
| **Build Tool** | Maven |
| **Containerização** | Docker |
| **CI/CD** | GitHub Actions |
| **Infraestrutura** | AWS EC2 |
| **Deploy** | Render |
| **Versionamento** | Git & GitHub |

---

## Funcionalidades Principais

- Cadastro e autenticação de **candidatos** e **empresas**
- Criação e gerenciamento de **vagas de emprego**
- Associação de **candidatos às vagas**
- Autenticação e autorização com **JWT Token**
- API RESTful seguindo boas práticas de design
- Integração com **PostgreSQL** via **Spring Data JPA**

## Arquitetura do Projeto

A aplicação segue a arquitetura **MVC** e está estruturada em camadas bem definidas:

```
gestao_vagas/
 ├── modules/
 │   ├── candidate/
 │   ├── company/
 │   ├── job/
 │   └── shared/
 ├── providers/        . Autenticação e segurança JWT
 ├── config/           . Configurações globais (Security, Database)
 ├── exceptions/       . Tratamento de exceções
 └── resources/        . application.yml e outros recursos
```

## Como Rodar Localmente

### Pré-requisitos

- Java 17+
- Maven 3.8+
- Docker (opcional, mas recomendado)
- PostgreSQL (ou use H2 em memória)

### Rodando sem Docker

```bash
# Clonar o repositório
git clone https://github.com/devtrur/api_gestao_vagas.git
cd api_gestao_vagas

# Rodar o projeto
mvn spring-boot:run
```

A aplicação será iniciada em:
**http://localhost:8080**

### Rodando com Docker

```bash
# Build da imagem
docker build -t gestao_vagas .

# Rodar o container
docker run -p 8080:8080 gestao_vagas
```

---

## Deploy e CI/CD

O deploy é automatizado via **GitHub Actions**, que realiza:

1. Build e testes do projeto
2. Criação da imagem Docker
3. Push da imagem para AWS (EC2)
4. Deploy automatizado no **Render**

> O pipeline garante integração contínua (CI) e entrega contínua (CD), mantendo o app sempre atualizado em produção.

## Endpoints Principais (Exemplo)

| Método | Endpoint | Descrição |

| `POST` | `/auth/login` | Autenticação JWT |
| `POST` | `/candidate` | Cadastro de candidato |
| `POST` | `/company` | Cadastro de empresa |
| `POST` | `/job` | Criação de vaga |
| `GET` | `/job` | Listagem de vagas disponíveis |
| `POST` | `/candidate/{id}/apply` | Candidatar-se a uma vaga |

> A API pode ser explorada facilmente com ferramentas como **Insomnia** ou **Postman**.

## Autor

**Guilherme Arthur**

- Estudante de Ciência da Computação | Desenvolvedor em formação
- Interesse em **Back-end, Cloud e Inteligência Artificial**
- Contato: [LinkedIn](https://www.linkedin.com/in/guilherme-arthur-a805532ab/) • [GitHub](https://github.com/Devtrur)

## Aprendizados

Durante o desenvolvimento deste projeto, foram explorados e aplicados diversos conceitos:

- Criação de APIs RESTful com Spring Boot
- Autenticação e autorização com JWT
- Deploy em ambientes cloud (Render + AWS EC2)
- Automação de build e deploy (CI/CD com GitHub Actions)
- Integração de banco de dados relacional (PostgreSQL)
- Uso de containers com Docker

> Mesmo sendo um projeto de estudo, foi conduzido com práticas próximas a um ambiente de produção, abrangendo todo o ciclo **desenvolvimento → deploy → entrega**.

## Status do Projeto

**Finalizado como projeto de estudo**  
Base sólida para evolução futura com testes automatizados, logs estruturados e observabilidade.
