package mainrun;

import action.ClazzAction;
import action.TechmasterAction;
import entity.Clazz;
import entity.Student;
import entity.Techmaster;
import view.Menu;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Techmaster techmaster = new Techmaster();
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        while (true) {
            menu.showMenu();
            menu.chooseFunction(scanner);
        }
    }

}
