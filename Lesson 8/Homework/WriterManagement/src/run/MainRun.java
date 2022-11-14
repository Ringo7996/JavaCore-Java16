package run;

import constant.WriterType;
import entity.Post;
import entity.PostDetail;
import entity.PostManagement;
import entity.Writer;

import java.util.Scanner;

import static logic_handle.PostLogic.addNewPost;
import static logic_handle.PostLogic.showPost;
import static logic_handle.PostManagementLogic.*;
import static logic_handle.WriterLogic.addNewWriter;
import static logic_handle.WriterLogic.showWriter;

public class MainRun {
    public static Writer[] writers = new Writer[1000];
    public static Post[] posts = new Post[1000];
    public static PostManagement[] postManagements = new PostManagement[1000];

    public static void main(String[] args) {
        while (true) {
            showMenu();
            choseFunction();
        }
    }


    private static void choseFunction() {
        System.out.print("Chọn chức năng: ");
        int function = new Scanner(System.in).nextInt();
        do {
            if (function >= 1 && function <= 8) {
                break;
            }
            System.out.print("Chọn lại: ");
        } while (true);

        switch (function) {
            case 1:
                addNewWriter();
                break;
            case 2:
                showWriter();
                break;
            case 3:
                addNewPost();
                break;
            case 4:
                showPost();
                break;
            case 5:
                postManagement();
                showPostManagement();
                salary();
                break;
            case 6:
                sortbyName();
                showPostManagement();
                break;
            case 7:
                sortbyPost();
                showPostManagement();
                break;
            case 8:
                break;

        }
    }

    private static void sortbyName() {
        for (int i = 0; i < postManagements.length; i++) {
            if (postManagements[i] != null) {
                for (int j = i + 1; j < postManagements.length; j++) {
                    if (postManagements[j] != null) {
                        if (postManagements[i].getWriter().getName().compareToIgnoreCase(postManagements[j].getWriter().getName()) > 0) {
                            PostManagement temp = postManagements[i];
                            postManagements[i] = postManagements[j];
                            postManagements[j] = temp;
                        }
                    }
                }
            }
        }
    }

    private static void sortbyPost() {
        for (int i = 0; i < postManagements.length; i++) {
            if (postManagements[i] != null) {
                for (int j = i + 1; j < postManagements.length; j++) {
                    if (postManagements[j] != null) {
                        if (postManagements[i].getTotal() - postManagements[j].getTotal() > 0) {
                            PostManagement temp = postManagements[i];
                            postManagements[i] = postManagements[j];
                            postManagements[j] = temp;
                        }
                    }
                }
            }
        }
    }


    public static void showMenu() {
        System.out.println("---Quản lí phóng viên--");
        System.out.println("1. Nhập danh sách phóng viên");
        System.out.println("2. In danh sách phóng viên");
        System.out.println("3. Nhập danh sách bài viết");
        System.out.println("4. In danh sách bài viết");
        System.out.println("5. Lập bảng tính công");
        System.out.println("6. Sắp xếp danh sách bảng tính công");
        System.out.println("7. Lâp bảng thu");
        System.out.println("8. Thoát");
    }


}
