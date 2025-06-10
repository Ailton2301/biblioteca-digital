<<<<<<< HEAD
📚 Biblioteca Digital: Sistema Integrado de Gestão de Livros
📝 Descrição
Este projeto tem como objetivo desenvolver um sistema de gerenciamento para uma biblioteca municipal.
O sistema permite o cadastro, consulta, atualização e exclusão de livros, promovendo a modernização da gestão do acervo bibliográfico.

O sistema é dividido em três camadas principais:

Back-end com Spring Boot (Java)

Front-end integrável com API REST

Banco de dados relacional (MySQL)

⚙️ Funcionalidades
✅ Cadastro de novos livros (Create)

🔍 Consulta de livros (Read)

✏️ Atualização de dados de livros (Update)

🗑️ Remoção de livros do acervo (Delete)

🛠️ Tecnologias Utilizadas
Back-end
Java 17

Spring Boot

Spring Web

Spring Data JPA

MySQL Driver

Front-end
HTML5, CSS3, JavaScript

Axios para chamadas à API

Banco de Dados
MySQL 8.x

🧱 Estrutura de Pastas
matlab
Copiar
Editar
biblioteca-digital/
├── backend/
│   ├── controller/
│   ├── model/
│   ├── repository/
│   ├── service/
│   └── application.properties
├── frontend/
│   ├── index.html
│   ├── script.js
│   └── styles.css
└── README.md
🧪 Como Executar o Projeto
1. Clone o repositório:
bash
Copiar
Editar
git clone https://github.com/Ailton2301/biblioteca-digital
cd biblioteca-digital
2. Configure o banco de dados MySQL:
Crie um banco de dados chamado biblioteca

Execute o script SQL, se fornecido, ou deixe o Spring JPA criar as tabelas automaticamente

3. Ajuste as configurações no application.properties:
properties
Copiar
Editar
spring.datasource.url=jdbc:mysql://localhost:3306/biblioteca
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
4. Execute o back-end:
bash
Copiar
Editar
./mvnw spring-boot:run
5. Execute o front-end:
Abra o arquivo index.html no navegador

A interface permite interação com o back-end por meio da API REST

✍️ Autor
Ailton
Estudante de Análise e Desenvolvimento de Sistemas

=======
# biblioteca-digital
>>>>>>> f2eba4b0fa8f533c840788e23f1fb48fdc19cf6e
