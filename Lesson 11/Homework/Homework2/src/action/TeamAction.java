package action;

import entity.Figure;
import entity.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class TeamAction {
    public static int AUTO_ID = 1;
    private ArrayList<Figure> figures = new ArrayList<>();

    public Team inputTeam(Scanner scanner) {
        int id = AUTO_ID;
        AUTO_ID++;
        for (int i = 0; i < 5; i++) {
            System.out.println("Tướng thứ " + (i + 1) + ": ");
            FigureAction figureAction = new FigureAction();
            Figure figure = figureAction.inputFigure(scanner);
            figures.add(figure);
        }
        System.out.println("------");

        Team team = new Team(id, figures);
        return team;
    }
}
