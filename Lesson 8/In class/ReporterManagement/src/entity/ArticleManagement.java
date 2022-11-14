package entity;

import java.util.Arrays;

public class ArticleManagement {

    private Reporter reporter;
    private ArticleDetail[] articleDetails;
    private int total;

    public ArticleManagement(Reporter reporter, ArticleDetail[] articleDetails) {

    }

    public Reporter getReporter() {
        return reporter;
    }

    public void setReporter(Reporter reporter) {
        this.reporter = reporter;
    }

    public ArticleDetail[] getArticleDetails() {
        return articleDetails;
    }

    public void setArticleDetails(ArticleDetail[] articleDetails) {
        this.articleDetails = articleDetails;
    }

    @Override
    public String toString() {
        return "ArticleManagement{" +
                "reporter=" + reporter +
                ", articleDetails=" + Arrays.toString(articleDetails) +
                '}';
    }
}
