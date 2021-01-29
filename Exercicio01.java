

import java.util.Date;


public class Exercicio01 {


    public static void main(String[] args){
        Date date = new Date(370494000000L);
        Date dataPassado = new Date(1273892400000L);

        boolean isAfter = date.after(dataPassado);

        System.out.println(isAfter);
    }

}