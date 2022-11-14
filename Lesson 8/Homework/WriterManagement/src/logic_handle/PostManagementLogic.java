package logic_handle;

import entity.Post;
import entity.PostDetail;
import entity.PostManagement;
import entity.Writer;

import java.util.Scanner;

import static run.MainRun.*;
import static run.MainRun.postManagements;

public class PostManagementLogic {
    public static void postManagement() {
        System.out.print("Nhập số phóng viên cần tính lương: ");
        int postManagementNum = new Scanner(System.in).nextInt();
        PostManagement[] postManagements = new PostManagement[postManagementNum];

        for (int i = 0; i < postManagementNum; i++) {
            System.out.print("Nhập mã phóng viên cần tính lương: ");
            int writerId = new Scanner(System.in).nextInt();
            Writer writer = null;


            for (int j = 0; j < writers.length; j++) {
                if (writers[j] != null && writers[j].getId() == writerId) {
                    writer = writers[j];
                    break;
                }
            }

            System.out.print("Nhập số lượng thể loại bài viết");
            int typeNum = new Scanner(System.in).nextInt();
            PostDetail[] postDetails = new PostDetail[typeNum];
            int count = 0;
            int total = 0;

            for (int j = 0; j < typeNum; j++) {
                System.out.print("Nhập mã bài viết: ");
                int postID = new Scanner(System.in).nextInt();
                Post post = null;

                for (int k = 0; k < posts.length; k++) {
                    if (posts[k] != null && posts[k].getId() == postID) {
                        post = posts[k];
                        break;
                    }
                }

                System.out.print("Nhập số lượng bài thuộc thể loại");
                int quantity = new Scanner(System.in).nextInt();
                postDetails[count] = new PostDetail(post, quantity);
                total += quantity;
                count++;
            }

            PostManagement postManagement = new PostManagement(writer, postDetails, total);
            savePostManagement(postManagement);

        }
    }

    public static void salary() {
        for (int i = 0; i < postManagements.length; i++) {
            if (postManagements[i] != null) {
                double salary = 0;
                Writer writer = postManagements[i].getWriter();
                PostDetail[] postDetails = postManagements[i].getPostDetails();
                for (int j = 0; j < postDetails.length; j++) {
                    if (postDetails[j] != null){
                    salary += postDetails[j].getPost().getPrice() * postDetails[j].getQuanlity();}
                }

                System.out.println("Lương của phóng viên " + writer.getName() + " là " + salary);

            }
        }
    }


    private static void savePostManagement(PostManagement postManagement) {
        for (int i = 0; i < postManagements.length; i++) {
            if (postManagements[i] == null) {
                postManagements[i] = postManagement;
                break;
            }
        }
    }

    public static void showPostManagement() {
        for (int i = 0; i < postManagements.length; i++) {
            if (postManagements[i] != null) {
                System.out.println(postManagements[i]);
            }
        }
    }


}
