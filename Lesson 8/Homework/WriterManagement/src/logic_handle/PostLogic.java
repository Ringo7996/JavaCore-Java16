package logic_handle;

import entity.Post;

import java.util.Scanner;

import static run.MainRun.posts;

public class PostLogic {
    public static void addNewPost() {
        System.out.print("Nhập số bài viết muốn thêm: ");
        int postNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < postNum; i++) {
            Post post = new Post();
            post.inputInfo();
            savePost(post);
        }
    }

    public static void savePost(Post post) {
        for (int i = 0; i < posts.length; i++) {
            if (posts[i] == null) {
                posts[i] = post;
                break;
            }
        }
    }

    public static void showPost() {
        for (int i = 0; i < posts.length; i++) {
            if (posts[i] != null) {
                System.out.println(posts[i]);
            }
        }
    }


}
