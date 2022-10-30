import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
                    //*
                    //*  *
                    //*  *  *
                    //*  *  *  *

        System.out.print("Nhập số tự nhiên h: ");
        int h = new Scanner(System.in).nextInt();

        for (int i = 1; i <= h; i++) {
            for (int j = 0; j <= i; j++) {
                if (j < i) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\n");
                }
            }
        }
    }
}
