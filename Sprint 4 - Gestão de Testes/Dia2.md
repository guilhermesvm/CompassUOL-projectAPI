<div align="center">
    <img src="Img/dia2.png" alt="BannerDia2" width="700px" height="263px">
    <h1> Dia 2 </h1>
    <p>[DoR e DoD](#DoR e DoD)</p>
    <p>[User Stories](#User Stories)</p>
    <p>[Acceptance Criteria](#Acceptance Criteria)</p>
</div>


# 📋 DoR e DoD

## DoR - Definition of Ready (pronto para começar)
Antes que um item do Backlog entre para a Sprint, o Time Dev, junto com o PO, deve garantir que ele esteja atendendo aos critérios de “Ready”, em termos de estarem suficientemente bem descritos e compreendidos por todo time de desenvolvimento, para que eles tenham condições suficiente para planejá-lo em uma Sprint e estabelecer um compromisso em relação à sua implementação.

## DoD - Defitiion of Done (projeto completo)
definido pelos membros do time Scrum e o PO, aplicável a todas as Histórias de Usuário, com o intuito de que todos os membros do time tenham um entendimento compartilhado do que significa “Done” para garantir a transparência. Ou seja, uma lista de verificação de atividades necessárias para que um incremento de software seja considerado como completo.

# User Stories
Uma User Story descreve uma funcionalidade que tem valor para o usuário de forma simples e clara. Ela deve responder às seguintes perguntas:

- Quem é o ator? Ou seja, quem utilizará a funcionalidade?<br>
- Qual a ação que o ator executará?<br>
- Qual o objetivo da ação?<br>

**Exemplo: Como um cliente da operadora de saúde eu quero procurar um médico pelo nome para obter o endereço do seu consultório.**

**Ator:** cliente da operadora de saúde.<br>
**Ação:** procurar um médico pelo nome.<br>
**Objetivo:** obter o endereço do consultório.<br>

## Quais as características de uma boa User Story?
Seguir o acrônimo INVEST para lembrar facilmente as seis características de uma boa User Story:
1. **Independente:** A independência entre as User Stories facilita a priorização e a estimativa.
2. **Negociável:** Pode ser renegociada para responder as mudanças.
3. **Valiosa:** Deve trazer valor ao negócio do usuário.
4. **Estimável:** Deve ser possível determinar o tempo necessário para entregá-la.
5. **Pequena:** Deve caber em um sprint.
6. **Testável:** O sucesso no teste é que vai garantir que a User Story foi desenvolvida corretamente.

## O que é um Épico?

Um Épico é uma User Story muito grande que levaria mais de um sprint para ser desenvolvida. Um Épico deve ser quebrado em User Stories menores que possam ser desenvolvidas em um sprint.

**Exemplo: Como cliente do banco desejo consultar e movimentar meus produtos.**

User Stories derivadas:

- Como cliente do banco desejo consultar o extrato da minha conta corrente para verificar meu saldo e os lançamentos realizados.<br>
- Como cliente do banco desejo consultar a fatura do meu cartão de crédito para saber quanto terei que pagar.<br>
- Como cliente do banco desejo realizar o pagamento de um boleto para quitar uma conta.<br>
- Como cliente do banco desejo agendar uma transferência de dinheiro mensalmente da minha conta corrente para a poupança, para garantir o cumprimento da minha meta de economia no mês.<br>


# Acceptance Criteria
É uma lista de critérios que precisam ser atendidos para que a User Story atenda os requisitos do usuário e seja aceita pelo PO. Os critérios de aceitação contém informações adicionais que não foram inseridas nas users stories para não poluir o corpo principal do texto. Bons critérios de aceitação:

- São escritos com menor nível de detalhamento
- São independente de implementação
- Definem o que fazer e não como fazer

**Exemplo: Como um operador de marcação de consulta eu quero visualizar a agenda de consultas dos médicos para saber quais horários estão disponíveis para novas marcações.**

AC:
- Eu quero ter opções de visualização da agenda por dia, semana e mês.
- Eu quero visualizar a agenda de consultas do mês atual e do mês posterior.
- Cada consulta agendada deve mostrar o nome e o convênio do paciente