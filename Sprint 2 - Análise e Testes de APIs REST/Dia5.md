<div align="center">
    <img src="Img/dia5.png" alt="BannerDia5" width="700px" height="263px">
    <h1> Dia 5 </h1>
    <p>[Cobertura de Testes de API Rest](#Cobertura de Testes de API Rest)</p>
    <p>[Testes Candidatos à Automação](#Testes Candidatos à Automação) </p>
</div>

# Cobertura de Testes de API Rest
A média de cobertura deve ser feita a partir de uma uma porcentagem da quantidade de requisitos criados pela quantidade de testes propostos. (10 requisitos, 5 testes = 50% de cobertura).  

## Formas de Medir
1. **Path Coverage:** A análise é realizada pela URIs presente na API (se for a mesma URI para métodos diferentes, considera-se apenas um) e quantidade de endpoints já implementados. Exemplo: Se existem 10 caminhos e foram realizados 5 testes, a cobertura é de 50%.

2. **Operation Coverage:** Confere a cobertura de testes de todos os métodos existentes na API REST. Exemplo: Se existem 19 caminhos totais e foram realizados 16 testes, a cobertura é de 84%.

3. **Parameter Coverage:** É analisado os parâmetros existentes em cada método da API (GET,POST,PUT,etc). Exemplo: Se a API tenha um total de 5 parâmetros, e na automação da API os 5 parâmetros foram cobertos, logo a cobertuda é de 100%

4. **Parameter Value Coverage**: É analisado parâmetros booleano e enum nas operações (se existirem). Exemplo: Quantidade total de valores diferentes enviados / quantidade total de valores que podem assumir.

5. **Content-Type Coverage (input e output)**: Analise o content-type que está sendo exibido em cada endpoint, ou seja, se for demonstrado nas opções do content-type de envio application/json e um application/xml, então duas opções do parâmetros de envio devem ser cobertas. Exemplo: 
Quantidade total de content-type em cada operação cobertos pela suíte de testes / Quantidade total de content-type em todas as operações da API.
6. **Operation Flow**: é realizado a análise das sequências de operações.
7. **Response Properties Body Coverage**: é realizado a análise dos parêmetros no body da resposta.
8. **Status Code Coverage**: é realizado a análise dos status codes em cada endpoint

# Testes Candidatos à Automação
Devemos escolher quais tipos de testes que devem ser automatizados a partir da comunicação honesta com o cliente, com o fim de entender qual suas necessidades, fluxos importantes à serem automatizados e prioridades. Importante também identificar riscos e relacioná-los com o nível de gravidade.

- Tarefas repetitivas realizadas em cada Sprint: automação evita gasto descenessário de esforço e verba.

## Aplicação
É necessário elaborar de uma lista de testes (cenários) candidatos a automação no formato de **fluxo completo** (1o ao último cenário) em formato de mapa mental (árvore de funcionalidades prioritárias) no Issues Board do [Gitlab](https://gitlab.com/) ou [Jira](https://www.atlassian.com/br/software/jira). Para cada cenário pode haver diferentes tipos de fluxos.
