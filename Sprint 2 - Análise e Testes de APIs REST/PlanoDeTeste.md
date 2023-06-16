<div align="center">
    <h1> Plano de Teste </h1>
</div>

## 1. Nome do Projeto - ServeTest
- Verificando a área "/Usuários", presente na documentação Swagger da API [ServerRest](https://serverest.dev/#/).

## 2. Resumo
O objetivo do teste é garantir que área "/Usuários seja testada, para que o projeto consiga seguir o fluxo de compras de maneira funcional, com o fim de atingir seu objetivo final, ou seja, cadastrar/logar/vender um produto. Foi baseado na [User Stories]: Usuários, localizada no [SharePoint](https://compasso.sharepoint.com/sites/qa/pb/java/SitePages/Sprint-2.aspx).


## 3. Pessoas Envolvidas
- Guilherme Machado;
- Público-alvo: Compradores e Vendedores da E-Commerce artificial ServeRest.

## 4. Cenário de Teste
"Sendo um vendedor de uma loja, gostaria de poder me cadastrar no Marketplace do ServeRest para poder realizar as vendas dos meus produtos".


## 5. Condições
- Todos os usuários deverão possuir um cadastro contendo os seguintes campos: NOME, E-MAIL, PASSWORD e ADMINISTRADOR;
- Não deverá ser possível fazer ações com usuários inexistentes;
- Não deve ser possível criar um usuário com e-mail já utilizado;
- Um novo usuário deverá ser criado caso não seja encontrado ID existente informado no PUT;
- Não deve ser possível cadastrar usuário com e-mail já utilizado;
- Não deverá ser possível cadastrar usuários com e-mails Gmail e HOTmail;
- E-mails devem seguir um padrão válido de e-mail para o cadastro;
- As senhas devem possuír no mínimo 5 caracteres e no máximo 10 caracteres;


### 6. Casos de Testes
- CT_001: Verificar se o token de usuário gerado é válido.
- CT_002: Buscar usuários;
- CT_003: Buscar por ID um usuário existente;
- CT_004: Buscar por ID um usuário inexistente;
- CT_005: Criar um usuário preenchendo TODOS os campos (nome, email, senha e administrador);
- CT_006: Criar um usuário deixando ALGUNS dos campos em branco;
- CT_007: Criar um usuário deixando TODOS os campos em branco;
- CT_008: Criar um usuário com email já cadastrado;
- CT_009: Criar um usuário com e-mail inválido (Hotmail);
- CT_010: Criar um usuário com e-mail inválido (Gmail);
- CT_011: Criar um usuário com senha inválida. (senha < 5 caracteres);
- CT_012: Criar um usuário com senha inválida. (senha > 10 caracteres);
- CT_013: Criar um usuário com senha inválida. (senha em branco);
- CT_014: Criar um usuário com nome inválido. (caracteres especiais);
- CT_015: Excluir por ID um usuário existente;
- CT_016: Excluir por ID um usuário inexistente;
- CT_017: Alterar algum dado do usuário com o ID dele.
- CT_018: Alterar algum dado de um usuário com ID inexistente.

  	
### 7. Testes Candidatos à Automação
- CT_001; 
- CT_002;
- CT_005;
- CT_008;
- CT_009;
- CT_010;
- CT_011-13;
- CT_014:

## 8. Ferramentas
- Softwares:
	- Postman;
	- Xmind;
	- Swagger;
	- Node.js (utilziado para criar o ambiente localhost para teste);
	- GitLab.

- Hardware:
	- Computador pessoal.

## 9. Cronograma

| Tipo de teste      | data de início  | data de término  |
| ------------------ | --------------- | ---------------- |
| Planejamento       | 05/06/2023      | 09/06/2023       |
| Execução           | 12/06/2023      | 15/06/2023       |
| Avaliação          | 16/06/2023      | 16/06/2023       |

## 10. Agradecimentos
Agradecimentos aos colegas que ajudaram **diretamente**, a partir de troca de ideais,  para a resolução do challenge da Sprint 2, sendo eles: **Bruno de Carvalho, Eduarda Quintana, Henrique Bertolin e Mathaus Kruger.**

