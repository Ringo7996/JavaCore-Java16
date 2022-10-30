public class DemoOverloading {
    public static void main(String[] args) {
        tinhTong(1,2);
        tinhTong(3.3f, 3,4.5f);

    }

    public static float tinhTong(float a, float b, float c) {
        return a+b+c;
    }

    public static int tinhTong(int a, int b) {
        return a+b;
    }
}
