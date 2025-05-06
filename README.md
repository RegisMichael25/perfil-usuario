# API de Perfil de Usuário

## 📝 Descrição
API REST para gerenciamento de perfis de usuários desenvolvida com Spring Boot. Este projeto visa praticar a implementação de JPA e a criação/manipulação de APIs RESTful.

## 🚀 Funcionalidades
- Consultar um perfil de usuário específico
- Listar todos os perfis de usuários
- Adicionar novo perfil de usuário
- Atualizar informações de perfil existente
- Deletar perfil de usuário

## 🛠️ Tecnologias Utilizadas
- Java 17
- Spring Boot 3.4.5
- Spring Data JPA
- Spring Web
- MySQL (Produção)
- H2 Database (Testes)
- Maven

## 📋 Pré-requisitos
- JDK 17+
- Maven 3.6+
- MySQL (para ambiente de produção)

## ⚙️ Configuração

### Clonando o repositório
```bash
git clone https://github.com/seu-usuario/perfil.git
cd perfil
```

### Configurando o banco de dados
Para o ambiente de desenvolvimento, a aplicação utiliza o banco de dados H2 em memória.

Para o ambiente de produção, configure as credenciais do MySQL no arquivo `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/perfil_db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## 🏃‍♂️ Executando o projeto
```bash
mvn spring-boot:run
```

A aplicação estará disponível em `http://localhost:8080`

## 📚 API Endpoints

### Perfil de Usuário

#### Obter perfil por nome de usuário
```
GET /api/perfil/{username}
```
Resposta:
```json
{
  "id": 1,
  "username": "usuario1",
  "nome": "Nome Completo",
  "email": "email@exemplo.com",
  "bio": "Descrição do perfil",
  "dataCriacao": "2025-05-06T10:30:00"
}
```

#### Listar todos os perfis
```
GET /api/perfil
```
Resposta:
```json
[
  {
    "id": 1,
    "username": "usuario1",
    "nome": "Nome Completo",
    "email": "email@exemplo.com",
    "bio": "Descrição do perfil",
    "dataCriacao": "2025-05-06T10:30:00"
  },
  {
    "id": 2,
    "username": "usuario2",
    "nome": "Outro Nome",
    "email": "outro@exemplo.com",
    "bio": "Outra descrição",
    "dataCriacao": "2025-05-06T11:45:00"
  }
]
```

#### Criar novo perfil
```
POST /api/perfil
```
Corpo da requisição:
```json
{
  "username": "novousuario",
  "nome": "Nome do Novo Usuário",
  "email": "novo@exemplo.com",
  "bio": "Descrição do novo perfil"
}
```

#### Atualizar perfil
```
PUT /api/perfil/{id}
```
Corpo da requisição:
```json
{
  "nome": "Nome Atualizado",
  "email": "atualizado@exemplo.com",
  "bio": "Descrição atualizada"
}
```

#### Deletar perfil
```
DELETE /api/perfil/{id}
```

## 🌐 Interface Web
O projeto também inclui uma interface web simples para visualização e pesquisa de perfis de usuários.

Para acessar a interface, navegue até:
```
http://localhost:8080/
```

A interface permite:
- Pesquisar um perfil pelo nome de usuário
- Visualizar informações detalhadas de um perfil
- Navegar entre todos os perfis cadastrados

## 📁 Estrutura do Projeto
```
src/
├── main/
│   ├── java/
│   │   └── br/
│   │       └── com/
│   │           └── projeto/
│   │               └── perfil/
│   │                   ├── PerfilApplication.java
│   │                   ├── controller/
│   │                   │   └── PerfilController.java
│   │                   ├── model/
│   │                   │   └── Perfil.java
│   │                   ├── repository/
│   │                   │   └── PerfilRepository.java
│   │                   └── service/
│   │                       └── PerfilService.java
│   └── resources/
│       ├── application.properties
│       ├── static/
│       │   ├── css/
│       │   ├── js/
│       │   └── index.html
│       └── templates/
└── test/
    └── java/
        └── br/
            └── com/
                └── projeto/
                    └── perfil/
                        ├── PerfilApplicationTests.java
                        ├── controller/
                        ├── service/
                        └── repository/
```

## 🧪 Testes
Para executar os testes:
```bash
mvn test
```

O projeto utiliza o banco de dados H2 em memória para os testes, garantindo que o ambiente de produção não seja afetado.

## 👨‍💻 Desenvolvimento
Este projeto foi criado com o objetivo de praticar o desenvolvimento de APIs RESTful usando Spring Boot e JPA. Sinta-se à vontade para contribuir ou adaptar conforme necessário.

## 📄 Licença
Este projeto está sob a licença [sua licença]. Consulte o arquivo LICENSE para mais detalhes.
