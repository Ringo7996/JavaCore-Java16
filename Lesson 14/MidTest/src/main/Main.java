package main;

import Action.GeneralHandle;
import entity.Account;
import view.MainMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();
        GeneralHandle generalHandle = new GeneralHandle();
        generalHandle.addSomeExistedAccount(accounts);

        MainMenu mainMenu = new MainMenu();
        while (true) {
            mainMenu.mainMenu();
            mainMenu.mainFunction(scanner, accounts);
        }
    }
}
