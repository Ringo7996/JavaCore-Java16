package entity;

public class ArticleDetail {

    Article article;
    int quality;

    public ArticleDetail(Article article, int quantity) {

    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "ArticleDetail{" +
                "article=" + article +
                ", quality=" + quality +
                '}';
    }
}
