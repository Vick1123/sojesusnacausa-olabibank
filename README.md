Documentação e Instruções de Uso da Aplicação Bancária
Olá! Bem-vindo à documentação da nossa aplicação bancária desenvolvida em Java com Spring Boot e PostgreSQL. Neste guia, vou te mostrar como configurar, executar e utilizar as funcionalidades principais do sistema. Vamos lá!
Configuração Inicial
Pré-requisitos
Antes de começarmos, verifique se você possui o seguinte instalado no seu ambiente de desenvolvimento:
•	Java JDK 8+ instalado e configurado.
•	PostgreSQL instalado e um banco de dados criado para a aplicação.
Configuração do Banco de Dados
1.	Crie um Banco de Dados:
o	Abra o PostgreSQL e crie um novo banco de dados para a nossa aplicação bancária.
2.	Configure o acesso ao Banco de Dados:
o	Edite o arquivo application.properties (ou application.yml) do Spring Boot para configurar o acesso ao banco de dados. Substitua nome_do_banco, seu_usuario e sua_senha pelos seus dados de conexão:
properties
Copy code
spring.datasource.url=jdbc:postgresql://localhost:5432/nome_do_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update
Execução da Aplicação
1.	Clone o Repositório:
o	Abra o terminal e clone o repositório do projeto:
bash
Copy code
git clone https://github.com/seubanco/sua-aplicacao-bancaria.git
cd sua-aplicacao-bancaria
2.	Importe o Projeto na IDE:
o	Importe o projeto na sua IDE preferida (por exemplo, IntelliJ IDEA, Eclipse).
3.	Execute a Aplicação:
o	Aguarde a importação das dependências pelo Maven (ou Gradle, se estiver usando).
o	Execute a aplicação Spring Boot.
Exemplo de comando via terminal usando Maven:
arduino
Copy code
mvn spring-boot:run
4.	Acesso à Aplicação:
o	Após a inicialização, a aplicação estará disponível em http://localhost:8080 (ou outra porta configurada).
Funcionalidades da Aplicação
A nossa aplicação bancária oferece diversas funcionalidades para gerenciamento de contas, clientes e transações. Abaixo estão as principais funcionalidades:
Cadastro de Clientes
•	Endpoint: POST /clientes
•	Exemplo de Requisição:
json
Copy code
{
  "nome": "Nome do Cliente",
  "cpf": "123.456.789-00",
  "email": "cliente@email.com",
  "endereco": "Endereço do Cliente",
  "rendaSalarial": 5000.00,
  "senha": "senha_do_cliente"
}
Autenticação de Clientes
•	Endpoint: POST /clientes/login
•	Exemplo de Requisição:
json
Copy code
{
  "cpf": "123.456.789-00",
  "senha": "senha_do_cliente"
}
Gerenciamento de Contas
Conta Corrente
•	Criação de Conta: POST /contas-corrente
•	Consulta de Saldo: GET /contas-corrente/{id}
•	Realização de Saque: POST /contas-corrente/{id}/saque
Conta Pagamento
•	Criação de Conta: POST /contas-pagamento
•	Consulta de Saldo: GET /contas-pagamento/{id}
•	Realização de Transferência: POST /contas-pagamento/{id}/transferencia
Atualização de Perfil do Cliente
•	Endpoint: PUT /clientes/{id}
•	Exemplo de Requisição:
json
Copy code
{
  "endereco": "Novo endereço do cliente",
  "rendaSalarial": 6000.00,
  "telefone": "(00) 12345-6789",
  "email": "novo_email@email.com"
}
Testes no Postman
1.	Coleções no Postman:
o	Importe as coleções de requisições no Postman para facilitar os testes.
o	Organize as requisições por funcionalidade (clientes, contas corrente, contas pagamento, etc.).
2.	Ambientes no Postman:
o	Configure diferentes ambientes no Postman para facilitar o teste em diferentes configurações de desenvolvimento, teste e produção.



