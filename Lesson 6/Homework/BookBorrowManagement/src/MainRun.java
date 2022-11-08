import Entity.Book;
import Entity.Reader;

import java.util.Scanner;

public class MainRun {
    public static Reader[] readers = new Reader[1000];
    public static Book[] books = new Book[1000];

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int functionChoice = chooseFunction();
            logicHandle(functionChoice);
        }
    }

    private static void logicHandle(int functionChoice) {
        switch (functionChoice) {
            case 1:
                addNewBook();
                showAllBook();
                break;
            case 2:
                addNewReader();
                showAllReader();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                System.exit(0);
        }
    }

    private static void addNewBook() {
        System.out.print("Nhập số lượng đầu sách muốn thêm mới: ");
        int bookNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < bookNum; i++) {
            Book book = new Book();
            book.nhapThongtin();
            saveBook(book);
        }
    }

    private static void saveBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    private static void showAllBook() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i]);
            }
        }
    }

    private static void addNewReader() {
        System.out.print("Nhập số lượng bạn đọc muốn thêm mới: ");
        int readerNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < readerNum; i++) {
            Reader reader = new Reader();
            reader.nhapThongTin();
            saveReader(reader);
        }
    }

    private static void saveReader(Reader reader) {
        for (int i = 0; i < readers.length; i++) {
            if (readers[i] == null) {
                readers[i] = reader;
                break;
            }
        }

    }

    private static void showAllReader() {
        for (int i = 0; i < readers.length; i++) {
            if (readers[i] != null) {
                System.out.println(readers[i]);
            }
        }
    }

    private static int chooseFunction() {
        System.out.print("\nXin mời chọn chức năng: ");
        int functionChoice;
        do {
            functionChoice = new Scanner(System.in).nextInt();
            if (functionChoice >= 1 && functionChoice <= 6) {
                break;
            }
            System.out.print("Không hợp lệ. Xin mời chọn lại chức năng: ");
        } while (true);
        return functionChoice;
    }

    private static void showMenu() {
        System.out.println("---------Quản lí mượn sách thư viện-------");
        System.out.println("1.Nhập danh sách đầu sách mới, in ra danh sách các đầu sách đã có");
        System.out.println("2.Nhập danh sách bạn đọc mới, in ra danh sách bạn đọc đã có");
        System.out.println("3.Lập bảng QL mượn sách cho từng bạn đọc bằng cách nhập các đầu sách mà bạn đọc mượn, và in danh sách ra màn hình");
        System.out.println("4.Sắp xếp danh sách Quản lý mượn sách: Theo tên bạn đọc, Theo Số lượng cuốn sách được mượn (giảm dần)");
        System.out.println("5.Tìm kiếm và hiển thị danh sách mượn sách theo tên bạn đọc");
        System.out.println("6.Thoát chương trình");
    }
}
