import java.util.Date;
import java.text.SimpleDateFormat;

public class Exercicio03 {

    public static void main(String[] args){
        Date dataAtual = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:mmm");

        String dataFormatada = dateFormat.format(dataAtual);

        System.out.println(dataFormatada);
    }
}
