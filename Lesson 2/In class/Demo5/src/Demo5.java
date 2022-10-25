import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        String date1 = "24/10/2022";
        String date2 = "26/10/2022";

        LocalDate LocalDate1 = java.time.LocalDate.parse(date1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate LocalDate2 = java.time.LocalDate.parse(date2, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(LocalDate1);
        System.out.println(LocalDate2);

        Duration x = Duration.between(LocalDate1.atStartOfDay(),LocalDate2.atStartOfDay());
        System.out.println(x.toDays());
        System.out.printf("so Pi la %.2f",Math.PI);


        String name;
        Scanner nhapvao = new Scanner(System.in);
        System.out.println("Nhập tên vào");
        name = nhapvao.nextLine();    /// NextInt, NextFloat
        System.out.println("Bạn vừa nhập"+name);

    }
}
