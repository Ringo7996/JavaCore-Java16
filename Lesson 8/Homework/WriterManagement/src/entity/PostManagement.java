package entity;

import java.util.Arrays;

public class PostManagement {
    public PostDetail postDetail;
    private Writer writer;
    private PostDetail[] postDetails;
    private int total;


    public PostDetail getPostDetail() {
        return postDetail;
    }

    public void setPostDetail(PostDetail postDetail) {
        this.postDetail = postDetail;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public PostDetail[] getPostDetails() {
        return postDetails;
    }

    public void setPostDetails(PostDetail[] postDetails) {
        this.postDetails = postDetails;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "PostManagement{" +
                "postDetail=" + postDetail +
                ", writer=" + writer +
                ", postDetails=" + Arrays.toString(postDetails) +
                ", total=" + total +
                '}';
    }

    public PostManagement(Writer writer, PostDetail[] postDetails, int total) {
        this.writer = writer;
        this.postDetails = postDetails;
        this.total = total;
    }
}