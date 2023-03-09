package calcula.frete.api.exception;
// classe usada para lançae um exceção quando o cep vem com a formatação errada
public class ViaCepFormatException extends RuntimeException {
    public ViaCepFormatException(String s) {
        super(s);
    }
}
