public class Homework5 {
    public static void main(String[] args) {
        double canh_goc_vuong1 = 3;
        double canh_goc_vuong2 = 4;
        double canh_huyen = 5;

        double sin_goc_1 = canh_goc_vuong2/canh_huyen;
        double cos_goc_1 = canh_goc_vuong1/canh_huyen;

        System.out.println(
                "Góc trong tam giác vuông có cạnh kề là "+canh_goc_vuong1+
                ", cạnh đối là "+canh_goc_vuong2+", cạnh huyền là "+ canh_huyen+
                " thì có sin bằng "+ sin_goc_1+ " và cos bằng "+cos_goc_1);
    }
}
