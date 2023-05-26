<div align="center">
    ![banner](link)
    <h1> Dia 5 </h1>
    <p>Ciclo do Software e Pirâmide de Testes</p>
</div>

## Ciclo de Vida 
Cada software possui um ciclo de desenvolvimento e de teste, e esses andam juntos, desde o planejamento, análise, implementação e a execução final.

<div align="center">
    <img src="https://dkrn4sk0rn31v.cloudfront.net/2018/01/08121228/modelo-cascata.png" width="400px">
</div>

## Pirâmide de Testes
<div align="center">
    <img src="https://miro.medium.com/v2/resize:fit:1046/1*NQ7s8qic4dz2-zGcTpFxfA.png" width="400px">
</div>


**VALOR UNITÁRIO**: 
- [x] Verifica o funcionamento da menor unidade de código testável da aplicação, não necessariamente precisando do código completo.
- [x] Tendem a ser extremamente pequenos e de rápida criação e execução, permitindo que caso um dos testes falhe, seja possível saber com precisão o local da falha.
- [x] Para que isso seja possível, é necessária a criação de alguns objetos “falsos” que imitam o comportamento do objeto real.

**VALOR INTEGRAL**: 
- [x] Avalia a funcionalide de um conjunto de unidades integradas interagindo entre si.
- [x] Encontra defeitos e falhas enter várias interfaces do software.
- [x] Possuem uma execução mais lenta e demandam um ambiente mais complexo para a execução.
- [x] Casos comuns de uso: comunicação com o banco de dados, comunicação de interfaces, APIs, micro-serviços.

**TESTE END TO END (E2E)**: 
- [x] Simula o ambiente real, replicando o comportamento do usuário durante o uso da aplicação final.
- [x] Tem como objetivo validar se esse comportamento condiz com o que seria esperado para tal funcionalidade (navegação, clique, preenchimentos..).
- [x] Possuem um nível de complexidade e tempo para execução ainda mais elevado, sendo recomendado o menor uso em relação aos demais, cobrindo apenas casos críticos e estratégicos.
