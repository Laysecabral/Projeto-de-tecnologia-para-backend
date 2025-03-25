O primeira entrega do projeto aluno online construído na disciplina tecnologia para back-end

* Este documento descreve a configuração e a implementação da entidade Aluno em um projeto Spring Boot,
iniciado com Spring Initializr. O projeto inclui as dependências Spring Web, Spring Data JPA, PostgreSQL
Driver e Lombok. O projeto é uma aplicação para o gerenciamento de alunos com funcionalidades CRUD.

* A construção da arquitetura do projeto foi organizada em pacotes, seguido pela modelagem de uma classe java 
para a entidade aluno fazendo o gerenciamento do sistema com as devidas anotações e definição de atributos. 

* Em seguida foi criado o AlunoRepository (interface para oferece acesso a entidade Aluno e definir o método CRUD, 
AlunoService (para gerencia a lógica de negócio para a entidade Aluno e se comunicar com o repositório, 
AlunoController (controlador de endpoint). 

* O banco de dados foi criado usando o DBeaver, onde dentro do banco foi criada a tabela aluno.

* Para testar a aplicação foi utilizada a ferramenta Insomnia para enviar requisições POST ao endpoint de criação. 
Assim, pudemos verificar se os alunos estavam sendo corretamente salvos no banco de dados.



![Insomnia](https://github.com/user-attachments/assets/e5dbfc13-2ad7-4e8f-8614-040574fe375e)


![DBeaver](https://github.com/user-attachments/assets/6977a7b8-e961-431f-847d-1d5134eab61e)
