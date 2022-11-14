package logic_handle;

import entity.Article;
import entity.ArticleDetail;
import entity.ArticleManagement;
import entity.Reporter;
import run.MainRun;

import java.util.Scanner;

public class ArticleManagementLogic {
    public static void addNewArticleManagement() {
        System.out.println("Nhập bảng tính công cho bao nhiêu phóng viên");
        int reporterNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < reporterNum; i++) {
            System.out.println("Nhập tính công cho phóng viên thứ " + (i + 1));
            System.out.println("Nhập mã phóng viên tính công");
            int reporterId = new Scanner(System.in).nextInt();
            Reporter reporter = null;
            for (int j = 0; j < MainRun.reporters.length; j++) {
                if (MainRun.reporters[j].getId() == reporterId) {
                    reporter = MainRun.reporters[j];
                    break;
                }
            }
            System.out.println("Nhập số lượng loại bài viết mà phóng viên đã viết");
            int articleNum = new Scanner(System.in).nextInt();
            ArticleDetail[] articleDetails = new ArticleDetail[articleNum];
            int count = 0;
            for (int j = 0; j < articleNum; j++) {
                System.out.println("Nhập thông tin thể loại bài thứ " + (j + 1) + "mà póng viên" + reporter.getName() + "viết");
                System.out.println("Nhập id của loại bài viết thứ" + (j + 1));
                int articleId = new Scanner(System.in).nextInt();
                Article article = null;
                for (int k = 0; k < MainRun.articles.length; k++) {
                    if (MainRun.articles[k].getId() == articleId) {
                        article = MainRun.articles[k];
                        break;
                    }
                }

                System.out.print("Nhập số lượng bài ở thể này đã viết:");
                int quantity = new Scanner(System.in).nextInt();
                articleDetails[count] = new ArticleDetail(article, quantity);
                count++;
            }
            ArticleManagement articleManagement = new ArticleManagement(reporter, articleDetails);
            saveArticleManagement(articleManagement);
        }
    }

    private static void saveArticleManagement(ArticleManagement articleManagement) {
        for (int i = 0; i < MainRun.articleManagements.length; i++) {
            if (MainRun.articleManagements[i] == null){
                MainRun.articleManagements[i]=articleManagement;
                break;
            }
        }
    }
}
