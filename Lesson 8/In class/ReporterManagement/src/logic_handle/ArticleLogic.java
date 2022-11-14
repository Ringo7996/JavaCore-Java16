package logic_handle;

import entity.Article;
import run.MainRun;

import java.util.Scanner;

public class ArticleLogic {



    public static void addNewArticle() {
        System.out.println("Nhập số bài viết muốn thêm mới");
        int articleNum = new Scanner(System.in).nextInt();
        do {
            if (articleNum > 0) {
                break;
            }
            System.out.println("Mời nhập lại số dương");
            articleNum = new Scanner(System.in).nextInt();
        } while (true);
        for (int i = 0; i < articleNum; i++) {
            Article article = new Article();
            article.inputInfo();
            saveArticle(article);
        }
    }

    private static void saveArticle(Article article) {
        for (int i = 0; i < MainRun.articles.length; i++) {
            if (MainRun.articles[i] == null) {
                MainRun.articles[i] = article;
                break;
            }
        }
    }


    public static void showArticle() {
        for (int i = 0; i < MainRun.articles.length; i++) {
            if (MainRun.articles[i] != null) {
                System.out.println(MainRun.articles[i]);
            }
        }
    }

}
