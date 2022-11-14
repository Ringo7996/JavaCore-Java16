package run;

import entity.Article;
import entity.ArticleManagement;
import entity.Reporter;
import logic_handle.ArticleLogic;
import logic_handle.ArticleManagementLogic;
import logic_handle.ReporterLogic;

import java.util.Scanner;

public class MainRun {
    public static Reporter[] reporters = new Reporter[1000];
    public static Article[] articles = new Article[1000];
    public static ArticleManagement[] articleManagements = new ArticleManagement[1000];

    public static void main(String[] args) {
        showMenu();
        chooseFunction();
    }




    public static void chooseFunction() {
        System.out.print("Chọn chức năng: ");
        int function = new Scanner(System.in).nextInt();
        do {
            if (function >= 1 && function <= 5) {
                break;
            }
            System.out.print("Chọn lại chức năng hợp lệ: ");
            function = new Scanner(System.in).nextInt();
        } while (true);

        switch (function) {
            case 1:
                ReporterLogic.addNewReporter();
                ReporterLogic.showReporter();
                break;
            case 2:
                ArticleLogic.addNewArticle();
                ArticleLogic.showArticle();
                break;
            case 3:
                ArticleManagementLogic.addNewArticleManagement();
                break;
            case 4:
                break;
            case 5:
                break;
        }
    }

    private static void showMenu() {
        System.out.println("1. Nhập danh sách phóng viên. In ra danh sách phóng viên đã có");
        System.out.println("2. Nhập danh sách kiểu bài viết. In ra danh sách kiểu bài đã có");
        System.out.println("3. Lập Bảng tính công cho phóng viên bằng cách nhập các kiểu bài mà mỗi phóng viên đã viết cùng số lượng tương ứng và in danh sách ra màn hình.");
        System.out.println("4. Sắp xếp danh sách Bảng tính công");
        System.out.println("a. Theo Họ tên phóng viên");
        System.out.println("b. Theo Số lượng bài viết (giảm dần)");
        System.out.println("5. Lập bảng kê thu nhập của mỗi phóng viên");
    }


}
