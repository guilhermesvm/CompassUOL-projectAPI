<div align="center">
    <img src="Img/dia1.png" alt="BannerDia1" width="700px" height="263px">
    <h1> Dia 1 | 05/06/23 </h1>
    <p>[Onboard Geral](#Onboard Geral)</p>
    <p>[Issues & User Stories](#Issues & User Stories)</p>
    <p>[API, REST e RESTful](#HTTP)</p>
    <p>[HTTP](#HTTP)</p>
</div>

# Apresentação e Orientações Gerais
No primeiro momento da Sprint o Scrum Master explicou como funcionará a Sprint 2, conteúdos que serão passados e esperados na apresentação da Challenge e orientações gerais.

# Issues & User Stories
Vídeo introduzindo ao Issue Board do GitLab, uma ferramente importante para ajudar na organização do team na hora de criar histórias e suas tasks a partir de Issues, as quais seriam delegação de tarefas à fazer por meio de labels (tags explicativas). Também foi explicado como relacionar cada issue com sua história relacionada.

# API (Application Programming Interface)
O browser precisa de dados/informações, assim a API recebe um pedido para fazer algum processamento para o servidor retornar informações. Com o pedido realizado, o banco de dados prepara os dados de acordo com o pedido, e no fim, a API pega as informações e devolve ao browser.

- Responsável por estabelecer comunicação entre diferentes serviços e tecnologias.
- Intermediador para troca de informações.

| Vantagens de usar APIs |          |                         |                 |                    | 
|------------------------|----------|-------------------------|-----------------|--------------------|
|Redução de Custo        | Segurança| Melhoria na Comunicação | Volume de Dados | Controle de Acesso |

## REST e RESTful
O REST delimita algumas obrigações nessas transferências de dados. Será feita a transferência de dados, geralmente usando o protocolo HTTP, um site, para visualizar mais fácil. <br>
RESTful é API que segue a aplicação dos padrões REST.


## 6 NECESSIDADES (constraints) para ser RESTful
1. **Client-server**: Separação do cliente e do armazenamento de dados (servidor), dessa forma, poderemos ter uma portabilidade do nosso sistema, usando o React para WEB e React Native para o smartphone, por exemplo.

2. **Stateless**: Cada requisição que o cliente faz para o servidor, deverá conter todas as informações necessárias para o servidor entender e responder (RESPONSE) a requisição (REQUEST). Exemplo: A sessão do usuário deverá ser enviada em todas as requisições, para saber se aquele usuário está autenticado e apto a usar os serviços, e o servidor não pode lembrar que o cliente foi autenticado na requisição anterior. Nos nossos cursos, temos por padrão usar tokens para as comunicações.

3. **Cacheable**: As respostas para uma requisição, deverão ser explicitas ao dizer se aquela resquição, pode ou não ser cacheada pelo cliente.

4. **Layered System**: O cliente acessa a um endpoint, sem precisar saber da complexidade, de quais passos estão sendo necessários para o servidor responder a requisição, ou quais outras camadas o servidor estará lidando, para que a requisição seja respondida.

5. **Uniform Interface**: Manter uma uniformidade, uma constância, um padrão na construção da interface. Nossa API precisa ser coerente para quem vai consumi-lá. Precisa fazer sentido para o cliente e não ser confusa. Logo, coisas como: o uso correto dos verbos HTTP; endpoints coerentes (todos os endpoints no plural, por exemplo); usar somente uma linguagem de comunicação (json) e não várias ao mesmo tempo; sempre enviar respostas aos clientes; são exemplos de aplicação de uma interface uniforme.

6. **Code on demand (opcional)**: Dá a possibilidade da nossa aplicação pegar códigos, como o javascript, por exemplo, e executar no cliente.

# Conceitos HTTP & JSON

## HTTP(s)
HTTP ou Hyper Text Transfer Protocol é um protocolo usado para obter recursos, como sites usuais e intermediam a comunicação com APIs.

|Verbos |   Funcionalidade                                                                                     |
|-------|------------------------------------------------------------------------------------------------------|
|GET    |Requisita um determinado recurso específico. Retornam apenas dados.                                   |
|POST   |Usado para submeter dados a um determinado recurso, altera estados de um recurso presente no servidor.|
|DELETE |Apaga determinado recurso.                                                                            |
|PUT    |Substitui todas as atuais representações do recurso de destino pela carga de dados da requisição.     |
|HEAD   |Similar ao método GET, entretanto não requer o corpo da resposta.                                     |
|CONNECT|Estabelece um túnel de conexão para um servidor com base em um recurso.                               |
|OPTIONS|Utilizado para definir as opções para comunicação com um determinado recurso.                         |
|TRACE  |Realiza um teste de loopback para verificar se uma mensagem consegue chegar a um determinado destino. |
|PATCH  |Aplica modificações parciais em um determinado recurso.                                               |


## FAMÍLIAS STATUS CODES
Os códigos de status das respostas HTTP indicam se uma requisição HTTP foi corretamente concluída. As respostas são agrupadas em cinco classes:
- Respostas de Informação (100-199)
- Respostas de Sucesso (200-299)
- Redirecionamentos (300-399)
- Erros do Cliente (400-499)
- Erros do Servidor (500-599)









