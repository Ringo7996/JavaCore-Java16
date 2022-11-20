package action;

import entity.Figure;

import java.util.Scanner;

public class FigureAction {
    public static int AUTO_ID = 1;

    public Figure inputFigure(Scanner scanner) {
        int id = AUTO_ID;
        AUTO_ID++;
        System.out.print("Nhập tên tướng: ");
        String name = scanner.nextLine();
        System.out.print("Nhập thuộc tính của tướng: ");
        String position = scanner.nextLine();

        Figure figure = new Figure(id, name, position);
        return figure;
    }

}
