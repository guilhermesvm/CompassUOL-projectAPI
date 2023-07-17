<div align="center">
    <img src="Img/dia4.png" alt="BannerDia2" width="700px" height="263px">
    <h1> Dia 4</h1>
    <p>[Análise de Riscos em Testes](#Análise de Riscos em Testes)</p>
    <p>[Ciclo de Testes](#Ciclo de Testes)</p>
</div>


# Análise de Riscos em Teste de Software com PRISMA
- O que testar primeiro: o que é mais importante e complexo; 
- Identificar e **escrever** possíveis problemas (riscos) que podem acontecer para discutir com o Dev Team e PO;
- Definir níves de riscos: os que podem acontecer mais rápido, os mais problemáticos, os que mais trazem grandes prejuízos;
- Utilizar estratégias/técnicas de testes focadas em evitam problemas se tornem um potencial;
- Não há zero defeitos, logo, é importante testar o que é mais importante para encontrar problemas que podem afetar o negócio;

**Exemplos de Risco:**
- Para um software do setor financeiro, o software ser vulnerável na área de credenciais;
- Botões e componentes novos customizados de uma interface não funcionarem como esperado;
- Regras de Negócio da API Rest não conseguem ser calculadas corretamente;
- Servidores deixem de funcionar quando tiver 1000+ usuários conectados (técnico)
- Exponha um valor inteiro do produto ao invés de valores dividios, para o valor parecer menor;

## Como saber se algo pode ir para produção?
**Exemplo de técnica: Good Enough** - James Bach
- Possui benefícios? (Se sim, então ✔️, se não ❌ )
- Possui problemas CRÍTICOS? (7 bugs e 3 bugs críticos ❌ -> 07 bugs e 0 críticos ✔️)
- Os benefícios de entregar o software do jeito que está AGORA, é maior do que entregar DEPOIS com TUDO corrigido?
- Entregar depois é pior do que entregar agora?

**Exemplo de técnica: PRISMA**
- Identificar riscos técnicos (probabilidade) e de negócios (impacto) com nível alto; 
- Listá-los e priorizá-los;
- Alinhá-los entre o pessoal de Tech, Negócios e Testes;
- Definir as estratégias para a mitigação desses.
1. Planejamento
2. KickOff
3. Preparação Individual 
4. Pontuação
5. Estimativa em consenso
6. Escolha da abordagem de testes

<div align="center">
    <img src="https://ferramentasdaqualidade.org/wp-content/uploads/2019/06/figura-2-exemplo-de-uma-matriz-de-riscos-com-5-niveis-de-probabilidade-e-impacto.png" alt="BannerDia2" width="600px">
</div>



# Ciclo de Testes

## Fases do Ciclo de Testes
 
|Fases                         |                                                                      |
|------------------------------|----------------------------------------------------------------------|
|Fase I: Análise e Validação   |Requisitos claros, sejam testáveis e estratégias para teste           |
|Fase II: Planejamento         |Ordem de execução, entregas do desenvolvimento e dependência de testes|
|Fase III: Modelagem           |Passos de execução, automatizar ou não, e ordem de execução           |
|Fase IV: Definição de Ambiente|Hardware e software, requisitos, e responsáveis                       |
|Fase V: Execução              |Documentação, casos de Teste e preparação do ambiente                 |
|Fase VI: Reporte              |Enviar resultados, problemas encontrados e o que não foi executado    |


## O NOVO Ciclo de Teste
Sistema antigo: WATERFALL <br>
Análise -> Design -> Implementação (Desenvolvimento) -> Teste -> Manutenção. <br>

Sistema novo: **Metodologia Ágil** <br>
Ciclo é divido em sprints onde pequenas partes do projeto são pensadas, desenvolvidas, testadas pequenas partes do projeto. O profissional QA está presente em todas as etapas, e o time inteiro está integrado.

<div align="center">
    <img src="https://www.gomarketingschool.com.br/wp-content/uploads/2020/03/agile.png" alt="BannerDia2" width="400px">
</div>


## A Importância Gestão do Ciclo de Testes (STLC)
Antedecer problemas (prejuízos) em produção, dessa forma preenchenchendo lacunas do projeto.

# Capacitação em Qualidade

## 1. Modelos do Ciclo
- Waterfall, V, Scrum e Kanban.

## 2. Níveis de Teste
São caracterizados por: objetivos específicos, objeto de teste, defeitos e falhas.

 - [x] **Teste de Componente (Unidade)**
    - Teste unitário de responsabilidade do desenvolvedor;
    - Encontrar defeitos nos componentes e evitar que se espalhem para níveis mais altos do projeto;
    
 - [x] **Teste de Integração**
    - Testa a comunicação entre componentes e sistemas (componentes que interagem com componentes);
    - Podem ser: banco de dados, APIs, microsserviços, interfaces, etc.

 - [x] **Teste de Sistemas**
    - Todos os comportamentos e capacidades de um produtos(End2End);

- [x] **Teste de Aceite**
    - Informações para o cliente avaliar a situação de implantação e uso do produto;
    - O teste é realizado pelo cliente ou seus representantes;

## 3. Tipos de Teste

|Tipos                  |                                                                                                                  |
|-----------------------|------------------------------------------------------------------------------------------------------------------|
|**Teste Funcional**    |Avalia as funções que um sistema deve executar.                                                                   |
|**Teste Não-Funcional**|OAvaliar o comportamento, usabilidade, performance, estabilidade, resistência à cargas de acesso e latência.      |
|**Caixa Preta**        |Baseado nos requisitos do software, e as ações que esse deve desempenhar (níveis: integração, sistema e aceitação)|
|**Caixa Branca**       |Refere-se á estrutura interna da aplicação, tem acesso ao código fonte e feito por devs (nível: unitário)         |
|**Reteste**            |Teste de confirmação, com objetivo de verificar se um bug foi corrigido                                           |   

## 4. Teste de Regressão
- Está relacionado com as mudanças do sistema;
- Garante que partes não alteradas continuem funcionando;
- A sua automatização é recomendada;
- Atualizações periódicas são necessárias;


