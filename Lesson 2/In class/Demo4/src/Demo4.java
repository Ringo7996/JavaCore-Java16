import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Demo4 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalTime time = LocalTime.of(3,4,15);
        System.out.println(time);

        DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse("24/05/2022 14:20:20",DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println(parse);


        
    }
}
