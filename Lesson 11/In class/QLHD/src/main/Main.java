package main;

import action.HodanAction;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập hộ dân");
        HodanAction hodanAction = new HodanAction();
        hodanAction.showInfo(hodanAction.inputInfo());
    }
}
