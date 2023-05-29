<div align="center">
    ![banner](link)
    <h1> Dia 5 </h1>
    <p>[Atividades de Teste](#Atividades de Teste)
    <p>[Pirâmide de Testes](#Pirâmide de Testes)</p>
</div>

## Atividades de Teste
Cada software possui um ciclo de desenvolvimento e de teste, e esses andam juntos, desde o planejamento, análise, implementação e a execução final.
1. **PLANEJAMENTO** - Criação do propósito, etapas, espeecificações, nível de detalhamento e cronograma do teste.
2. **ANÁLISE** -  Define as condições para que aconteça.
3. **MODELAGEM** - Descreve as especificações, recursos e operações necessárias que estarão presentes nos requisitos do sistema proposto.
4. **IMPLEMENTAÇÃOE** - Quando a codificação do teste foi pronta, a fase de teste de software termina e nenhum bug ou erro é deixado no sistema, o processo final de implantação é iniciado.
5. **EXECUÇÃO/MANUTENÇÃO**- Garantie que o sistema continue a funcionar e que as necessidades continuem a ser atendidas de acordo com a especificação mencionada na primeira fase.

<div align="center">
    <img src="https://dkrn4sk0rn31v.cloudfront.net/2018/01/08121228/modelo-cascata.png" width="550px">
</div>

## Pirâmide de Testes
<div align="center">
    <img src="https://lab.vortx.com.br/content/images/2021/08/piramide-testes.jpg" width="400px">
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
