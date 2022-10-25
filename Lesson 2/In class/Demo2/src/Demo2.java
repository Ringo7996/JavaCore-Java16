public class Demo2 {
    public static void main(String[] args) {
        char kitu ='a';
        String chuoi1="abc";  //tạo chuỗi sử dụng phép gán
        String chuoi2= new String("abc");  //tạo chuỗi bằng từ khoá new
        String chuoi3= new String("abc");

        System.out.println("chuỗi 1= "+chuoi1);
        System.out.println("chuỗi 2= "+chuoi1);
        System.out.println(chuoi1==chuoi2);



        ////
        String str1="Hello world";
        String str2="123";
        String str3=str1+str2;

        System.out.println(str3);

    }
}
