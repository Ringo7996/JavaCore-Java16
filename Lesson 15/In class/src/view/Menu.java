package view;

import entity.Book;
import entity.Library;
import entity.Reader;
import handle.BookHandle;
import handle.ReaderHandle;

import java.util.Scanner;

public class Menu {
    public void showMenu() {
        System.out.println("1. Thêm sách vào thư viện");
        System.out.println("2. Xoá sách khỏi thư viện");
        System.out.println("3. Thay đổi thông tin sách trong thư viện");
        System.out.println("4. Thêm bạn đọc vào thư viện");
        System.out.println("5. Xoá bạn đọc khỏi thư viện");
        System.out.println("6. Thay đổi thông tin bạn đọc trong thư viện");
        System.out.println("7. Xem danh sách sách");
        System.out.println("8. Xem danh sách bạn đọc");
        System.out.println("0.Thoát");
    }

    public void chooseFunction(Scanner scanner, Library library) {
        BookHandle bookHandle = new BookHandle();
        ReaderHandle readerHandle = new ReaderHandle();
        System.out.print("Mời bạn chọn chức năng: ");
        int choice = -1;
        while (true) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice > 8 || choice < 0) {
                    System.out.print("Vui lòng chọn lại: ");
                    continue;
                }
            } catch (Exception e) {
                System.out.print("Vui lòng chọn lại: ");
                continue;
            }
            break;
        }

        switch (choice) {
            case 1:
                System.out.println("Mời bạn nhập thông tin sách muốn thêm: ");
                Book newBook = bookHandle.inputInfo(scanner);
                bookHandle.insert(newBook, library);
                break;
            case 2:
                System.out.print("Mời bạn nhập id sách muốn xoá: ");
                int deleteBookId;
                while (true) {
                    try {
                        deleteBookId = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (Exception e) {
                        System.out.print("Vui lòng nhập lại: ");
                    }
                }
                Book deleteBook = new Book(deleteBookId);
                bookHandle.delete(deleteBook, library);
                break;
            case 3:
                System.out.println("Mời bạn nhập thông tin sách muốn chỉnh sửa: ");
                Book updateBook = bookHandle.inputInfo(scanner);
                bookHandle.update(updateBook, library);
                break;
            case 4:
                System.out.println("Mời bạn nhập thông tin bạn đọc muốn thêm: ");
                Reader newReader = readerHandle.inputInfo(scanner);
                readerHandle.insert(newReader, library);
                break;
            case 5:
                System.out.print("Mời bạn nhập id bạn đọc muốn xoá: ");
                int deleteReaderId;
                while (true) {
                    try {
                        deleteReaderId = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (Exception e) {
                        System.out.print("Vui lòng nhập lại: ");
                    }
                }
                Reader deleteReader = new Reader(deleteReaderId);
                readerHandle.delete(deleteReader, library);
                break;
            case 6:
                System.out.println("Mời bạn nhập thông tin bạn đọc muốn chỉnh sửa: ");
                Reader updateReader = readerHandle.inputInfo(scanner);
                readerHandle.update(updateReader, library);
                break;
            case 7:
                System.out.println(library.getBooks());
                break;
            case 8:
                System.out.println(library.getReaders());
                break;
            case 0:
                return;
        }
    }
}
