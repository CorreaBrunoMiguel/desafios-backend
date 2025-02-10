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
|--------|------------------------------------------------------|---------------------------------------------------------------|------------|
| RF01 | Cadastrar um novo usuário. | - O usuário deve fornecer nome, e-mail e senha. <br> - O e-mail deve ser único e válido. | Alta |
| RF02 | Autenticar um usuário. | - O usuário deve fornecer e-mail e senha. <br> - A API deve retornar um token JWT válido. | Alta |
| RF03 | Obter informações do usuário logado. | - O endpoint deve retornar os dados do usuário autenticado. <br> - Requer token JWT válido. |

6. Requisitos Nao Funcionais
7. Dependencias
8. Priorizaçao
9. Consideraçoes Finais



