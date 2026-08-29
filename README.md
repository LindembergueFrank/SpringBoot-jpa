# Web Services com Spring Boot e JPA/Hibernate

Projeto de estudo dedicado aos fundamentos de uma API REST com **Java, Spring Boot, JPA/Hibernate e banco relacional**.

> **Contexto:** este repositório foi desenvolvido como parte do curso *Java COMPLETO — Programação Orientada a Objetos + Projetos*, de Nélio Alves. Ele é mantido publicamente como registro de aprendizado e não é apresentado como projeto autoral de produção.

## O que o projeto demonstra

- modelagem de entidades JPA e relacionamentos;
- arquitetura tradicional em camadas (`resource/controller`, `service`, `repository` e `entity`);
- operações CRUD;
- associações entre usuários, pedidos, produtos, categorias, itens e pagamentos;
- tratamento de exceções de recurso e banco;
- configuração de perfil de teste e carga inicial de dados;
- construção de uma API REST com Spring Boot.

## Domínio

O modelo representa um fluxo simplificado de e-commerce:

- `User` — usuário do sistema;
- `Order` — pedido associado a um usuário;
- `Category` — categoria de produtos;
- `Product` — produto;
- `OrderItem` — item de pedido com chave composta;
- `Payment` — pagamento associado ao pedido.

Os diagramas disponíveis em `DER/` documentam as relações principais do domínio.

## Estrutura

```text
src/main/java/
├── entities/
├── repositories/
├── resources/
├── services/
└── config/
```

A nomenclatura real dos pacotes pode variar conforme a etapa do curso preservada no histórico.

## Executando

Pré-requisitos:

- JDK compatível com a versão definida no `pom.xml`;
- Maven ou Maven Wrapper.

Execute os testes/build com:

```bash
./mvnw test
```

Inicie a aplicação com:

```bash
./mvnw spring-boot:run
```

Consulte os arquivos `application.properties` do projeto para os perfis e configurações disponíveis.

## Higiene do repositório

Arquivos gerados de build e metadados específicos de IDE não são versionados. O `.gitignore` cobre `target/`, Eclipse/STS, IntelliJ, VS Code e arquivos locais de ambiente.

## Referência

- Nélio Alves — *Java COMPLETO: Programação Orientada a Objetos + Projetos*.

## Papel no portfólio

Este repositório registra uma etapa importante da formação em Spring/JPA. Projetos autorais mais recentes devem ser usados como evidência principal de engenharia, arquitetura, segurança, testes e decisões de produção.

## Autor

**Lindembergue Frank**
