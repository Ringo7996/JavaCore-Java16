public class Demo3 {
    public static void main(String[] args) {
        String str1="Hello1";
        String str2="hello1";
        String str3="llo";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.contains(str3));

        String str4="Mở ngoặc \n kép:\" 123 \"";
        System.out.println(str4);


        String msv = "BDC123";
        String regax = "^[B|N][DC|CC|]\\d{3}";  //Regex101

        System.out.println(msv.matches(regax));

        /////////////5

        int a = 5;
        Integer a1= new Integer(5);
        Integer a2= 5;

        long x = 10000;
        Long x1= new Long (10000); /// hỗ trợ hàm mà kiểu dữ liệu nguyên thuỷ ko có
                                        /// chuyển đổi kiểu dữ liệu qua lại cho nhau double - int -float (số ra số, chữ ra chữ)

        int o=0;   //giá trị gốc là 0
        Integer o1 = null;  //null ko có bộ nhớ trên ram đc dành ra.


    }

}
