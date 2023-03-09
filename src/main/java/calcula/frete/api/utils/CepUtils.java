package calcula.frete.api.utils;


import calcula.frete.api.exception.ViaCepException;
import calcula.frete.api.exception.ViaCepFormatException;


import java.util.Objects;
//Classe usada usada para coferir o cep, confere se ele está vazio, null ou blank, ela também remove o hifen do cep e confere se o hifen foi retirado
public class CepUtils {

    public static void confereCep(String cep){
        if (Objects.isNull(cep) || cep.isEmpty() || cep.isBlank()) throw new ViaCepException("O cep informado não pode ser nulo ou vazio");
        if (cep.length() > 8) throw new ViaCepFormatException("Cep fora do formato, caso esteja com hifen, favor inserir sem o hifen");
        if (cep.length() < 8) throw new ViaCepException("Cep faltando numeros");
    }

    public static String removeMascaraCep(String cep){
        try {
            confereCep(cep);
            return cep;
        } catch (ViaCepFormatException e){
            return cep.replace("-", "");
        }
    }
    public static String mascararCep(String cep){
        try {
            confereCep(cep);
            return cep.substring(0, 5) + "-" + cep.substring(5);
        } catch (ViaCepFormatException e){
            throw new ViaCepException("Cep ja formatado ou fora do padrao");
        }
    }

}
