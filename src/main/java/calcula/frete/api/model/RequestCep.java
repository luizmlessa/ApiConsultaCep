package calcula.frete.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
//Classe usada para fazer a requisião do cep e guarda ele
@Getter @Setter
@NoArgsConstructor

@ToString
public class RequestCep {

    private String cep;


}