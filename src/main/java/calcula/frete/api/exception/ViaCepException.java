package calcula.frete.api.exception;
//Classe usada para definir uma execeção de quando falta numero no cep
public class ViaCepException extends RuntimeException {
    public ViaCepException(String s) {
        super(s);
    }
}
