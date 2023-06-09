<div align="center">
    <img src="Img/dia3.png" alt="BannerDia3" width="700px" height="263px">
    <h1> Dia 3 </h1>
    <p>[Validações e Boas Práticas de APIs](#Validações e Boas Práticas de APIs)</p>
    <p>[Testes Funcionais e Tipos de Erros](#Testes Funcionais e Tipos de Erros)</p>
</div>

## Validações e Boas Práticas para Testar APIs de APIs
Vídeo apresentando um exemplo de validação de API na plataforma Postman. Alguns exemplos são:
- Validação da Solicitação;
- Validação do Retorno da soliticação;
- Validação da Estrutura de Resposta;
- Validação de retorno de Status Code.

1. **Entender o Projeto**: Facilita a escolha de tecnologias para a criação e auxilia a criação do fluxo de teste a partir da integração do sistema
2. **Documentação**: Endpoints, os parâmetros de entrada e respostas à serem obtidas.
3. **Validação**:
    - Tipos de Teste (Funcionais - requisitos, Não Funcionais - performance e usabilidade, Estruturais - arquitetura da API)
    - Status, header e body da API;
4. **Segurança**: tokens de acesso e autenticações.

## Testes Funcionais em API Rest
**Regras de Negócio** são essenciais em uma API, porém o Swagger não guarda essas regras. Os testes funcionais tem o objetivo de validar se a função do software, ou seja, **dados de entrada, processamento e dados dee saída, fram aplicados corretamente.

Testes de software devem ser abordados de maneira SISTEMÁTICA, ou seja, uso de técnicas formais para identificar o que testar. Um exemplo de técnica é  a **de Partição**, uma vez que ela ajuda na criação de possíveis entradas para uma função de aplicação.

> Exemplo: <BR>
**RN: Apenas administradores podem registrar novas viagems.**
>- EMPÍRICO
>   - Entrada: Credenciais (Administrador, Usuário)
>- SISTEMÁTICO (e o que mais?)
>   - Entrada: Credenciais (Administrador = registrar, Usuário = erro, Inválida = erro, Expirada = erro)
        
## Tipos de Erros
**Gravidade:** Grau de dano que um bug pode causar;<br>
**Prioridade:** Avaliação da importância de corrigir um bug;<br>
**Risco:** Qualquer evento com impactos no projeto, são identificados e classificados conforme a probabilidade e tamanho de impacto.

- Causados por documentação;
- Causado por ambiente;
- Causado por massa de dados.
