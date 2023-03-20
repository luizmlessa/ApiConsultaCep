package calcula.frete.api.exception;
// classe usada para lançae uma exceção quando o cep vem com a formatação errada
public class ViaCepFormatoException extends RuntimeException {
    public ViaCepFormatoException(String s) {
        super(s);
    }
}
