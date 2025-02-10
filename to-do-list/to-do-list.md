# Documento de Requisitos Funcionais (DRF)

1. Visao Geral

Este documento descreve os requisitos funcionai s e nao-funcionais para o desenvolvimento de uma API RESTFUL de
gerenciamento de tarefas (To-Do-List). A API sera utilizada por um aplicativo web e mobile, permitindo que usuarios
criem, gerenciem e organizem suas tarefas diarias.

___

2. Objetivo

O objetivo principal desta API e fornecer uma soluçao robusta e segura para o gerenciamento de tarefas, com 
funcionaliades de CRUD e autenticaçao de usuarios. A API deve ser escalavel, facil manutençao e seguir boas praticas 
de desenvolvimento.

3. Escopo

3.1. Funcionalidades Inclusas

* Cadastro e autenticação e usuários
* Gerenciamento de tarefas.
* Validação de dados e tratamentos de erros.
* Documentação da API

3.2. Funcionalidades Opcionais

* Notificações por e-mail ou push.
* Compartilhamento de tarefas entre usuários.
* Integração com calendários externos (Google Calendar, Outlook, etc).

___
4. Requisitos Funcionais

4.1. Módulo de Autenticação

| **ID** | **Descrição** | **Critérios de Aceitação** | **Prioridade** |
|--------|-----------------------------------------------------------------------|-------------------------------------------------------------------------------------------------|------------|
| RF01 | Cadastrar um novo usuário. | - O usuário deve fornecer nome, e-mail e senha. <br> - O e-mail deve ser único e válido. | Alta |
| RF02 | Autenticar um usuário. | - O usuário deve fornecer e-mail e senha. <br> - A API deve retornar um token JWT válido. | Alta |
| RF03 | Obter informações do usuário logado. | - O endpoint deve retornar os dados do usuário autenticado. <br> - Requer token JWT válido. | Média |

___

4.2.  Módulo de Tarefas

| **ID** | **Descrição** | **Critérios de Aceitação** | **Prioridade** |
|--------|-----------------------------------------------------------------------|-------------------------------------------------------------------------------------------------|------------|
| RF04 | Criar uma nova tarefa | - o usuário deve fornecer título, descrição e data de vencimento. <br> - Requer token JWT válido. | Alta |
| RF05 | Listar todas as tarefas do usuário logado. | - O endpoint deve retornar uma lista de tarefas. <br> - Requer token JWT válido. | Alta |
| RF06 | Obter detalhes de uma tarefa específica. | - O endpoint deve retornar os detalhes da tarefa. <br> - Requer token JWT válido. | Média |
| RF07 | Atualizar uma tarefa existenete. | - O usuário pode atualizar título, descrição, data de vencimento e status. <br> - Requer token JWT válido. | Alta |
| RF08 | Excluir uma tarefa. | - A tarefa deve ser removida do banco de dados. | <br> - Requer token JWT válido. | Alta |

___

4.3. Módulo de tratamento de Erros

| **ID** | **Descrição** | **Critérios de Aceitação** | **Prioridade** |
|--------|-----------------------------------------------------------------------|-------------------------------------------------------------------------------------------------|------------|
| RF09 | Validar dados de entrada. | - Campo obrigatórios deve ser validados. <br> - E-mails deve seguir formato válido. | Alta |
| RF10 | Retornar mensagens de erro clars. | - Erros como "Usuário não encontrado deve ser retornado com status HTTP adequado. | Média |

___

5. Requisitos Não Funcionais
  
| **ID** | **Descrição** | **Critérios de Aceitação** | **Prioridade** |
|--------|-----------------------------------------------------------------------|-------------------------------------------------------------------------------------------------|------------|
| RNF01 | A API deve ser desenvolvida em Java utilizando Spring Boot. | - O código deve seguir as boas práticas do Spring Boot. | Alta |
| RNF02 | A API deve seguir os princípios RESTful. | - Os endpoints devem seuir convenções REST (e.g., métodos HTTP corretos, uso de status HTTP). | Alta |
| RNF03 |A API deve utilizar banco de dados relacional. | O banco de dados deve estar normalizado e seguir boas práticas de modelagem. | Alta |
| RNF04 | A API deve ser segura, utilizando HTTPS e JWT para autenticação. | - Todas as requisições devem ser feitas via HTTPS. <br> - O token JWT deve ter expiração configurável. | Alta |
| RNF05 | A API deve ser documentada utilizando Swagge/OpenAPI. | - A documentaçãi deve estar acessível via **/swagger-ui.html**. | Média |
| RNF06 | A API deve ter testes unitários e de integração. | - Cobertura de testes deve ser superior a 80%. | Alta |

___

6. Dependências

* **Banco de Dados**: PostgreSQL
* **Ferramentas de Desenvolvimento**: InteliJ, Git, JetClient.
* **Bibliotecas**: Spring Boot, Spring Security, JWT, Lombock, Sqwagger, Validation.

___

7. Priorização

| Prioridade | Requisitos | 
|------------|-----------------------------------------------------------------------|
| Alta | RF01, RF02, RF04, RF05, RF07, RF08, RNF01, RNF02, RNF03, RNF04, RNF06 |
| Média | RF03, RF06, RF09, RF10, RNF05 |

___

8. Consideraçoes Finais

Este documento deve ser revisado e aprovado pela equipe de desenvolvimento antes do início da implementação. Qualquer mudança nos requisitos deve ser comunicada e documentada formalmente.

# Documento de Arquitetura de Software (DAS)



