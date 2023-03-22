# Projeto: Web services com Spring Boot e JPA / Hibernate
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/danielmjob/workshop-springboot3-jpa/blob/main/LICENSE)


# Sobre o projeto

Web services com Spring Boot e JPA / Hibernate é uma aplicação back-end criada durante o curso de Java na plataforma Udemy   pela equipe [DevSuperior](https://devsuperior.com "Site da DevSuperior").

É uma aplicação back-end que integrando java com banco de dados de teste (H2), onde pode ser consultados os produtos, pedidos de cada usuário, status do pedido além de poder cadastrar, ver, atualizar e deletar usuários (CRUD).

## Modelos

![Domain model](https://github.com/danielmjob/workshop-springboot3-jpa/blob/main/assets/Domain%20Model.jpg)

![Domain Instance](https://github.com/danielmjob/workshop-springboot3-jpa/blob/main/assets/Domain%20Instance.jpg)

# Tecnologias utilizadas

![Tecnologias](https://github.com/danielmjob/workshop-springboot3-jpa/blob/main/assets/Tecnologias.jpg)

- Java
- Spring Boot
- JPA / Hibernate
- Maven

# Comandos no Postman

## Recupera os usuários(GET)
```
http://localhost:8080/users
```

## Recupera os produtos(GET)
```
http://localhost:8080/products
```

## Recupera os pedidos(GET)
```
http://localhost:8080/orders
```

## Inserindo usuários (POST)
```
http://localhost:8080/users
```
### Body
```
{
 "name": "Daniel Marques",
 "email": "daniel@gmail.com",
 "phone": "977557755"
} 
```
[![Inserir Usuário](https://github.com/danielmjob/workshop-springboot3-jpa/blob/main/assets/Inserindo%20usuario.jpg)


## Atualizando usuário (PUT)

###### atualizará o usuário com o Id 1
```
http://localhost:8080/users/1
```
### Body
```
{
 "name": "Bob Brown",
 "email": "bob@gmail.com",
 "phone": "977557755"
} 
```

## Deletando usuário (DELETE  )
###### Deletará o usuário com o Id 1 (caso ele não tenha nenhum pedido atrelado a ele, respeitando a integridade do Banco de Dados)
```
http://localhost:8080/users/1
```
# Acessando Banco de Dados de teste H2

## No navegador
```
http://localhost:8080/h2-console
```

Login: sa
Senha:


![H2](https://github.com/danielmjob/workshop-springboot3-jpa/blob/main/assets/H2.jpg)

<br>
<br>

# Autor

Daniel Marques dos Santos

https://www.linkedin.com/in/danielmarquesjob
