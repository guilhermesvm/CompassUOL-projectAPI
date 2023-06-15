<div align="center">
    <h1> Curso Testes de API Rest - Julio de Lima </h1>
    <p>Repositório dedicado para anotações do curso "Testes de API Rest", com o objetivo de conhecer os fundamentos e solidificar a base para facilitar o entendimento da Sprint 2, e o que vai ser trabalhado posteriomente. </p>
</div>

## Introdução a APIs Rest (Aula 2)
API – Interface de programação de aplicações, seu objetivo é expor um serviço para o mundo, sem que as pessoas que vão consumir esse serviço, precisem conhecer a estrutura. 

Software B ---- conecta --- API Rest : O Software B já sabe quais são os envios de requisições.

API Rest características:
- Troca de arquivos são pelo formato JSON;
- Troca de requisições e resposta é expressada pelos métodos GET, POST, DELETE , OPTION ,PUT, etc;
- Status code para utilizar na troca de informações que é feita geralmente por protocolo HTTP; 

## O que está por trás da API Rest? - Backend (Aula 3)
- **Repository**: Camada responsável por trafegar as informações da regra de negócio e o banco de dados;
- **Service**: Camada que armazena as Regras de Negócio (RN);
- **Controller**: Usa a implementação da API, buscando informações através dos serviços, é o intermediador entre quem chama (software ou aplicação de manuseio da API) e serviços de repositórios, entregando a resposta no formato JSON. <br>

> **Pessoa/Interface < - > Controller <-> Service <-> Repository <-> Banco de Dados**

##  O que são Requests e Responses? (Aula 4)
É uma conversa entre dois softwares. Um terceiro envia uma requisição para a API, ela consome as informações e devolve um um dado de resposta. No vídeo foi utilizado o "curl -X 'MÉTODO" no terminal cmd.

## Como usar Headers, Swagger e Verbos em APIs Rest (Aula 6)
No header está contido algumas informações da requisição  que deverão ser enviadas, por exemplo: Content type (formato: JSON, XML) e a Authorization (token).

## Autenticação e Autorização em APIs Rest (Aula 7)
**Autenticação:** a aplicação conhece o usuário e ele usuário e ele está autenticado. (usuario)
**Autorização:** usuário está autenticado, porém precisa ser autorizado para fazer alterações. (admin)

## Parâmetros: Envio de Dados (Aula 8)
Query (?parametro=valor)

## Estratégias de Testes (Aula 12)
Mapa Mental utilizando o [Xmind](https://xmind.app/)