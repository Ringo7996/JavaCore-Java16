import action.SummonRifAction;
import entity.SummonRif;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SummonRifAction summonRifAction = new SummonRifAction();
        SummonRif summonRif = summonRifAction.inputSummonRif(scanner);

        System.out.println("Thông tin trận đấu như dưới đây: ");
        System.out.println(summonRif);
    }
}
