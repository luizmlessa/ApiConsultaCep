# Calcula Frete - API

Este projeto é uma api que recebe um cep como consulta por POST, salva esse cep, usa ele para fazer uma consulta na api ViaCep e trata o retorno a fim e mostrar só os campos tratados e adiciona uma lógica para tratar os dados que vem a fim de mostrar os campos com outros nomes e inserir o campo frete no retorno.

Este projeto foi desenvolvido com SpringBoot, foi escolhido devido à fácil integração com outras bibliotecas, e fácil formatação no modelo RestAPI, de modo a permitir a entrada e saída de dados de uma forma simples.

# Rodando o projeto 

Como padrão o projeto roda na porta:

http://localhost:8080

Para enviar a requisição POST o endpoint é:

http://localhost:8081/v1/consulta-endereco

Endereço da documentação do swagger

http://localhost:8080/swagger-ui/index.html#/endereco-controller/retornaCep
