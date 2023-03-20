package calcula.frete.api.controller;


import calcula.frete.api.model.Endereco;
import calcula.frete.api.model.EnderecoResultDTO;
import calcula.frete.api.utils.ValidaCep;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

//Classe controller que recebe a requisicão POST e faz a correção e a devoluçao dos dados
@RestController
@RequestMapping("v1")
public class EnderecoController {

    // Compara e sobrescreve os campos da classe Endereço, dados esses que vem do retorno da requisição a api Via Cep
    private EnderecoResultDTO convertEndereco(Endereco endereco) {
        EnderecoResultDTO enderecoResultDTO = new EnderecoResultDTO();
        enderecoResultDTO.setCep(endereco.getCep());
        enderecoResultDTO.setRua(endereco.getLogradouro());
        enderecoResultDTO.setComplemento(endereco.getComplemento());
        enderecoResultDTO.setBairro(endereco.getBairro());
        enderecoResultDTO.setCidade(endereco.getLocalidade());
        enderecoResultDTO.setEstado(endereco.getUf());
        enderecoResultDTO.setFrete(endereco.getFrete());
        return enderecoResultDTO;
    }
    //Faz a requisição pelo cep por post, leva esse cep como parametro para a api viacep e retorna os campos da consulta por um json
    @PostMapping("/consulta-endereco")
    public EnderecoResultDTO retornaCep(@RequestBody Endereco cep) {
        ValidaCep.confereCep(cep.getCep());
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Endereco> response = restTemplate.getForEntity(String.format("https://viacep.com.br/ws/" + cep.getCep() + "/json"), Endereco.class);
        if (response != null && response.getBody() != null) {
            return convertEndereco(response.getBody());
        } else {
            return new EnderecoResultDTO();
        }

    }
}


