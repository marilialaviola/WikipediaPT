$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Post.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Funcionalidade: Consulta"
    },
    {
      "line": 2,
      "value": "# Cenario: Consultar Ovo de Pascoa"
    },
    {
      "line": 3,
      "value": "# Dado que acesso a Wikipedia em Portugues"
    },
    {
      "line": 4,
      "value": "# Quando pesquiso por \"Ovo de Páscoa\""
    },
    {
      "line": 5,
      "value": "# Entao exibe a expressao \"Ovo de Páscoa\" no titulo da guia"
    }
  ],
  "line": 7,
  "name": "Consulta",
  "description": "",
  "id": "consulta",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7045851156,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Consultar Ovo de Pascoa",
  "description": "",
  "id": "consulta;consultar-ovo-de-pascoa",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "que acesso a Wikipedia em Portugues",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "pesquiso por \"Ovo de Páscoa\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "exibe a expressao \"Ovo de Páscoa\" no titulo da guia",
  "keyword": "Then "
});
formatter.match({
  "location": "Post.queAcessoAWikipediaEmPortugues()"
});
formatter.result({
  "duration": 9598088899,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ovo de Páscoa",
      "offset": 14
    }
  ],
  "location": "Post.pesquisoPor(String)"
});
formatter.result({
  "duration": 5869847943,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ovo de Páscoa",
      "offset": 19
    }
  ],
  "location": "Post.exibeAExpressaoNoTituloDaGuia(String)"
});
formatter.result({
  "duration": 2687605043,
  "status": "passed"
});
formatter.after({
  "duration": 9470652874,
  "status": "passed"
});
});