package calcula.frete.api.utils;


import calcula.frete.api.exception.ViaCepException;
import calcula.frete.api.exception.ViaCepFormatoException;


import java.util.Objects;
//Classe usada usada para coferir o cep, confere se ele está vazio, null ou blank.
public class CepUtils {

    public static void confereCep(String cep){
        //Verifica se o cep foi passado null ou vazio, sendo um desses ele passa a execeção com a mensagem de que ele está vazio.
        if (Objects.isNull(cep) || cep.isEmpty() || cep.isBlank()) throw new ViaCepException("O cep informado não pode ser nulo ou vazio.");
        // Verifica o tamanho do cep sendo menor que 8 ele devolve a mensagem de que falta numero
        if (cep.length() < 8 ) throw new ViaCepException("Cep incompleto.");
        //Verifica o tamanho do cep sendo maior que 8 ele da o aviso de que está no formato errado.
        if (cep.length() > 8 || !cep.matches("[0-9]*") )throw new ViaCepFormatoException("Favor inserir apenas os 8 numeros do cep.");


    }

    public static String removeMascaraCep(String cep){
        try {
            confereCep(cep);
            return cep;
        } catch (ViaCepFormatoException e){
            return cep.replace("-", "");
        }
    }
    public static String mascararCep(String cep){
        try {
            confereCep(cep);
            return cep.substring(0, 5) + "-" + cep.substring(5);
        } catch (ViaCepFormatoException e){
            throw new ViaCepException("Cep ja formatado ou fora do padrao");
        }
    }

}
