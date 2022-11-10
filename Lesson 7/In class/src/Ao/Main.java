package Ao;

import Ao.Drinkable;
import abstraction.Airplane;
import abstraction.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
//        Sinhvien sinhvien = new Sinhvien();
    }

    Airplane airplane = new Airplane();  //cách tạo đối tượng từ interface một cách gián tiếp

    Drinkable object1 = new Drinkable() {
        @Override
        public void drink() {
            System.out.println("uống nước");
        }
    };


}
