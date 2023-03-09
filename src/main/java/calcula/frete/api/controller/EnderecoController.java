package calcula.frete.api.controller;


import calcula.frete.api.model.Endereco;
import calcula.frete.api.model.EnderecoResultDTO;
import calcula.frete.api.model.RequestCep;
import calcula.frete.api.utils.CepUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

//Classe controller que faz a requisicão e devoluçao dos dados
@RestController
@RequestMapping("v1")
public class EnderecoController {

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

    @PostMapping("/consulta-endereco")
    public EnderecoResultDTO retornaCep(@RequestBody RequestCep cep) {
        CepUtils.confereCep(cep.getCep());
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Endereco> response = restTemplate.getForEntity(String.format("https://viacep.com.br/ws/" + cep.getCep() + "/json"), Endereco.class);
        if (response != null && response.getBody() != null) {
            return convertEndereco(response.getBody());
        } else {
            return new EnderecoResultDTO();
        }

    }
}


