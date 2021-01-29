import java.time.LocalDateTime;

public class Exercicio04 {

    public static void main(String[] args){
        LocalDateTime dateTime = LocalDateTime.of(2010, 05, 15, 10, 00, 00);
        System.out.println(dateTime);

        LocalDateTime dateTimeFuturo = dateTime.plusYears(4).plusMonths(6).plusHours(13);

        System.out.println(dateTimeFuturo);
    }
}
