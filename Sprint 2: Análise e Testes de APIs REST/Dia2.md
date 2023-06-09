<div align="center">
    <img src="Img/dia2.png" alt="BannerDia2" width="700px" height="263px">
    <h1> Dia 2 </h1>
    <p>[Swagger](#Swagger)</p>
    <p>[Análise de Requisitos de Software com Histórias de Usuários](#Análise de Requisitos de Software com Histórias de Usuários)</p>
</div>

# Análise de Requisitos de Software com Histórias de Usuários (Curso Udemy)
História de Usuário:
- Independentes: não precisa de outra história para complementar;
- Mensuráveis: saber os detalhes dentro da história (com o Example Mapping por exemplo);
- Testáveis: definir critérios de aceitação e exemplos que validem esses critérios. 

**Regras dos Três Amigos**: <br>
Para identificar as regras do negócio é necessário existir a visão do cliente (PO), desenvolvedor e testador.

## Example Mapping: 
Cartões com diferentes cores, as quais possuem diferentes significados, que desmembram uma História de Usuário.
- **Story**: história a ser trabalhada com uma breve descrição;
- **Rule**: critério ou regra de aceitação;
- **Exemple** (context, action, expected result): exemplo concreto ligado a cada regra de negócio que será implementada com uma descrição;
- **Question**: questionamentos associados aos demais itens.
<div align="center">
    <img src="https://openpracticelibrary.github.io/opl-media/images/example-mapping-2-.png" width="350px">
</div>

# Testes Estáticos (Swagger)
Swagger é uma aplicação visual  com a finalidade de documentar, ajudar na criação, consumo e geramento de códigos para uma API Rest. <br>
Um exemplo realizado foi a busca de dados relacionados à partir de um CEP na API [ViaCEP](https://viacep.com.br/ws/99300000/json/):

```
{
  "cep": "99300-000",
  "logradouro": "",
  "complemento": "",
  "bairro": "",
  "localidade": "Soledade",
  "uf": "RS",
  "ibge": "4320800",
  "gia": "",
  "ddd": "54",
  "siafi": "8919"
}
```

## Ferramentas
- [Swagger.io](https://editor.swagger.io/)