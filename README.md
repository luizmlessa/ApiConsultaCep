# Calcula Frete - API

Este projeto foi desenvolvido com SpringBoot, foi escolhido devido à fácil integração com outras bibliotecas, e fácil formatação no modelo RestAPI, de modo a permitir a entrada e saída de dados de uma forma simples. Foi também implementada uma base de dados para armazenar informação de endereços, de modo a reduzir a quantidade de informação carregada na memória, utilizando apenas os dados que seriam necessários.

# Rodando o projeto 

Como padrão o projeto roda na porta:

http://localhost:8080

Para enviar a requisição POST o endpoint é:

http://localhost:8081/v1/consulta-endereco

Endereço da documentação do swagger

http://localhost:8080/swagger-ui/index.html#/endereco-controller/retornaCep