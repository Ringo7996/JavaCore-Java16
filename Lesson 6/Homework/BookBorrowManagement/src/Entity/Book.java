package Entity;

import Constant.FieldConstant;

import java.util.Scanner;

public class Book {
    private static int AUTO_ID = 0;
    private int id;
    private String title;
    private String author;
    private String field;
    private int publicationYear;

    public Book() {
        if (AUTO_ID == 0) {
            AUTO_ID = 9999;
        }
        AUTO_ID++;
        this.id = AUTO_ID;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", field='" + field + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void nhapThongtin() {
        System.out.print("Nhập tên sách: ");
        this.title = new Scanner(System.in).nextLine();
        System.out.print("Nhập tác giả: ");
        this.author = new Scanner(System.in).nextLine();
        System.out.print("Nhập năm xuất bản: ");
        this.publicationYear = new Scanner(System.in).nextInt();
        System.out.println("Chọn lĩnh vực của sách");
        System.out.println("1.Khoa học tự nhiên");
        System.out.println("2.Văn học – Nghệ thuật");
        System.out.println("3.Điện tử Viễn thông");
        System.out.println("4.Công nghệ thông tin");
        int bookField;

        do {
            bookField = new Scanner(System.in).nextInt();
            if (bookField >= 1 && bookField <= 4) {
                break;
            }
            System.out.print("Không hợp lệ. Mời chọn lại: ");
        } while (true);

        switch (bookField){
            case 1:
                this.field = FieldConstant.SCIENCES;
                break;
            case 2:
                this.field = FieldConstant.LITERATURE;
                break;
            case 3:
                this.field = FieldConstant.TELECOM;
                break;
            case 4:
                this.field = FieldConstant.IT;
                break;
        }
        System.out.println("-----------");
    }
}
