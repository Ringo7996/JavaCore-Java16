package handle;

import entity.Book;
import entity.Library;

import java.util.Scanner;

public class BookHandle implements IService<Book> {
    public Book inputInfo(Scanner scanner) {
        System.out.print("Nhập id sách: ");
        int id;
        while (true) {
            try {
                id = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.print("Vui lòng nhập lại: ");
            }
        }
        System.out.print("Nhập tên sách: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tác giả: ");
        String author = scanner.nextLine();
        System.out.print("Nhập ngày xuất bản: ");
        String publicDate = scanner.nextLine();

        return new Book(id, name, author, publicDate);
    }

    @Override
    public void insert(Book object, Library library) {
        library.getBooks().add(object);
    }

    @Override
    public void delete(Book object, Library library) {
        boolean hasThatBook = false;
        for (Book b : library.getBooks()) {
            if (b.getId() == object.getId()) {
                library.getBooks().remove(b);
                hasThatBook = true;
                System.out.println("Xoá thành công");
                return;
            }
        }
        if (!hasThatBook) {
            System.out.println("Không có mã trong hệ thống");
        }
    }

    @Override
    public void update(Book object, Library library) {
        boolean hasThatBook = false;
        for (Book b : library.getBooks()) {
            if (b.getId() == object.getId()) {
                hasThatBook = true;
                b.setName(object.getName());
                b.setAuthor(object.getAuthor());
                b.setPublicDate(object.getPublicDate());
                System.out.println("Cập nhật sách thành công");
                break;
            }
        }
        if (!hasThatBook) {
            System.out.println("Không có mã trong hệ thống");
        }
    }
}
