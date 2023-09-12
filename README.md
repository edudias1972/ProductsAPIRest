# ProductsAPIRest

Products API RestFul 

Esse projeto é um CRUD de produtos 

1 ) Configurando o Spring Intializr :
Utilizando o SPRING : 

https://start.spring.io/ 

Products API RestFul

Técnologias Utilizadas 

Projeto Spring Boot 3  /  Java 17 LTS Oracle 

Spring Web MVC

Spring Data 

Spring Validation 

Spring Hateoas 

Banco de dados POSTGRESQL 


2) Instale e configure o POSTGRESQL defições application.properties

# Configurando O postgreSQL 

# Conectando o banco de dados na porta Url  localhost:5432 /products-api:
spring.datasource.url= jdbc:postgresql://localhost:5432/products-api

# Definindo datasource credenciais Autenticação:
spring.datasource.username=postgres
spring.datasource.password=postgres

# Mapeamento Atualizar os dados no BD tabelas e colunas :
spring.jpa.hibernate.dll-auto=update

# Não crie logs hibernate  :
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Products API RestFul

Esta é a documentação da API RestFul para gerenciamento de produtos. A API oferece operações CRUD (Create, Read, Update, Delete) para a entidade "products". 
Abaixo, você encontrará informações sobre como usar cada uma dessas operações.

3) Criando um Produto (POST)

Para criar um novo produto, faça uma requisição POST para a rota /products com os dados do produto no corpo da requisição. Os campos obrigatórios são name, price e description.

Exemplo de requisição:

bash

POST http://localhost:8080/products

{
  "name": "Martelo",
  "price": 19.99
}

4) Listando Produtos (GET)

Para listar todos os produtos, faça uma requisição GET para a rota /products.

Exemplo de requisição:

bash

GET http://localhost:8080/products

5) Obtendo Detalhes de um Produto (GET)

Para obter detalhes de um produto específico, faça uma requisição GET para a rota /products/{id}, onde {id} é o identificador único do produto.

Exemplo de requisição:

bash

GET http://localhost:8080/products/211/0898989898-97ab-cnsddfbsnbsfnsnf09

6) Atualizando um Produto (PUT)

Para atualizar os dados de um produto, faça uma requisição PUT para a rota /products/{id}, onde {id} é o identificador único do produto que você deseja atualizar. No corpo da requisição, forneça os campos que deseja atualizar.

Exemplo de requisição:

bash

PUT http://localhost:8080/products/211/0898989898-97ab-cnsddfbsnbsfnsnf09

{
  "price": 24.99,
  "description": "Este é um produto atualizado."
}

7) Excluindo um Produto (DELETE)

Para excluir um produto, faça uma requisição DELETE para a rota /products/{id}, onde {id} é o identificador único do produto que você deseja excluir.

Exemplo de requisição:

bash

DELETE http://localhost:8080/products/211/0898989898-97ab-cnsddfbsnbsfnsnf09

Lembre-se de substituir http://localhost:8080 pela URL real da sua API. Certifique-se de incluir as informações necessárias no corpo da requisição, conforme descrito nos exemplos acima, para garantir o funcionamento correto das operações CRUD da API Products.

