# Projeto Web Services com Spring Boot e JPA / Hibernate

## Funcionalidade Principal

Este projeto consiste na criação de um sistema web de gerenciamento de pedidos e produtos, utilizando Spring Boot, JPA/Hibernate, e um banco de dados em memória H2. As funcionalidades principais incluem a criação, leitura, atualização e exclusão (CRUD) de entidades como usuários, pedidos, categorias e produtos. O projeto também inclui o tratamento de exceções e a persistência de dados em um banco de dados relacional.
 
## Referências

Este projeto foi realizado de acordo com a apresentação no curso de [Java OO - Nélio Alves](https://www.udemy.com/course/java-curso-completo/?couponCode=SEPTSTACK24B)

## Estrutura do Projeto

### 1. **Entidades (Entities)**

- **`User`**
  - Atributos: `id`, `name`, `email`, `phone`, `password`
  - Função: Representa um usuário do sistema.

- **`Order`**
  - Atributos: `id`, `moment`, `orderStatus`, `user`
  - Função: Representa um pedido realizado por um usuário.

- **`Category`**
  - Atributos: `id`, `name`
  - Função: Representa uma categoria de produtos.

- **`Product`**
  - Atributos: `id`, `name`, `description`, `price`, `imgUrl`
  - Função: Representa um produto disponível para compra.

- **`OrderItem`**
  - Atributos: `id`, `quantity`, `price`, `subTotal`
  - Função: Representa um item de um pedido, com quantidade e preço do produto.

- **`OrderItemPK`**
  - Atributos: `order`, `product`
  - Função: Chave composta para a entidade `OrderItem`.

- **`Payment`**
  - Atributos: `id`, `moment`, `order`
  - Função: Representa um pagamento associado a um pedido.

### 2. **Repositórios (Repositories)**

- **`UserRepository`**
  - Extende: `JpaRepository<User, Long>`
  - Função: Responsável por operações de CRUD da entidade `User`.

- **`OrderRepository`**
  - Extende: `JpaRepository<Order, Long>`
  - Função: Responsável por operações de CRUD da entidade `Order`.

- **`CategoryRepository`**
  - Extende: `JpaRepository<Category, Long>`
  - Função: Responsável por operações de CRUD da entidade `Category`.

- **`ProductRepository`**
  - Extende: `JpaRepository<Product, Long>`
  - Função: Responsável por operações de CRUD da entidade `Product`.

- **`OrderItemRepository`**
  - Extende: `JpaRepository<OrderItem, Long>`
  - Função: Responsável por operações de CRUD da entidade `OrderItem`.

### 3. **Serviços (Services)**

- **`UserService`**
  - Função: Implementa a lógica de negócio para as operações relacionadas a `User`, como inserção, atualização, e exclusão de usuários, além de buscar usuários por ID.

- **`OrderService`**
  - Função: Implementa a lógica de negócio para as operações relacionadas a `Order`.

- **`CategoryService`**
  - Função: Implementa a lógica de negócio para as operações relacionadas a `Category`.

- **`ProductService`**
  - Função: Implementa a lógica de negócio para as operações relacionadas a `Product`.

### 4. **Recursos (Resources / Controllers)**

- **`UserResource`**
  - Função: Controla as requisições HTTP relacionadas a `User`, como criar, ler, atualizar e deletar usuários.

- **`OrderResource`**
  - Função: Controla as requisições HTTP relacionadas a `Order`.

- **`CategoryResource`**
  - Função: Controla as requisições HTTP relacionadas a `Category`.

- **`ProductResource`**
  - Função: Controla as requisições HTTP relacionadas a `Product`.

### 5. **Tratamento de Exceções (Exceptions Handling)**

- **`ResourceNotFoundException`**
  - Função: Exceção personalizada para quando um recurso não é encontrado.

- **`DatabaseException`**
  - Função: Exceção personalizada para erros de integridade referencial no banco de dados.

- **`StandardError`**
  - Função: Estrutura padrão para respostas de erro.

- **`ResourceExceptionHandler`**
  - Função: Controla as exceções lançadas nos serviços e converte para respostas HTTP apropriadas.

### 6. **Configuração e Seed de Banco de Dados**

- **`TestConfig`**
  - Função: Configura o perfil de teste, popula o banco de dados com dados iniciais para testes.

## Dependências e Configurações

- **Dependências Maven**:
  - `spring-boot-starter-web`
  - `spring-boot-starter-data-jpa`
  - `h2`

- **Configurações**:
  - `application.properties` e `application-test.properties` para definir o banco de dados H2 e o comportamento do JPA.

## Testes e Desenvolvimento

- Testes de CRUD e tratamento de exceções para `User`, utilizando os serviços e recursos implementados.
- A aplicação pode ser testada usando o H2 Console ou através de requisições HTTP (via Postman ou cURL).

