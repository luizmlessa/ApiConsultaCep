package calcula.frete.api.exception;
//Classe usada para definir uma execeção de quando o cep vem faltando numero
public class ViaCepException extends RuntimeException {
    public ViaCepException(String s) {
        super(s);
    }
}
