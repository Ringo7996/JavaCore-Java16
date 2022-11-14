package entity;

import java.util.Scanner;

public class PostDetail {
    public Post post;
    public int quanlity;

    public PostDetail(Post post, int quantity) {
        this.post = post;
        this.quanlity = quantity;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public int getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(int quanlity) {
        this.quanlity = quanlity;
    }


    @Override
    public String toString() {
        return "PostDetail{" +
                "post=" + post +
                ", quanlity=" + quanlity +
                '}';
    }
}
