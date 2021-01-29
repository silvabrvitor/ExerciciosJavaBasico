import java.util.Calendar;


import static java.time.DayOfWeek.SUNDAY;

public class Exercicio02 {

    public static void main(String[] args){

        Calendar dataPagamento = Calendar.getInstance();

        dataPagamento.add(Calendar.DATE, +10);

        int diaDaSemana = dataPagamento.get(Calendar.DAY_OF_WEEK);

        System.out.println("Verifica dia da semana");

        if (diaDaSemana == 1 || diaDaSemana == 7){
            System.out.println("Pague sua conta na Segunda-feira");
        }

    }



}
