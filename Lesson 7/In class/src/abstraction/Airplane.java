package abstraction;

public class Airplane implements DiChuyen{
    public void dichuyen(){
        System.out.println("Bay bằng động cơ");
    }

    @Override
    public void diChuyen() {
        System.out.println("Bay");
    }
}
