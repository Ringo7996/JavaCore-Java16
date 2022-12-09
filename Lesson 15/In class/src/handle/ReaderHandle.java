package handle;

import entity.Book;
import entity.Library;
import entity.Reader;

import java.util.Scanner;

public class ReaderHandle implements Service<Reader> {
    public Reader inputInfo(Scanner scanner) {
        System.out.print("Nhập id bạn đọc: ");
        int id;
        while (true) {
            try {
                id = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.print("Vui lòng nhập lại: ");
            }
        }
        System.out.print("Nhập tên bạn đọc: ");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String birthDate = scanner.nextLine();

        return new Reader(id, name, birthDate);
    }


    @Override
    public void insert(Reader object, Library library) {
        library.getReaders().add(object);
    }

    @Override
    public void delete(Reader object, Library library) {
        boolean hasThatReader = false;
        for (Reader r : library.getReaders()) {
            if (r.getId() == object.getId()) {
                library.getReaders().remove(r);
                hasThatReader = true;
                System.out.println("Xoá thành công");
                return;
            }
        }
        if (!hasThatReader) {
            System.out.println("Không có mã trong hệ thống");
        }
    }

    @Override
    public void update(Reader object, Library library) {
        boolean hasThatReader = false;
        for (Reader r : library.getReaders()) {
            if (r.getId() == object.getId()) {
                r.setName(object.getName());
                r.setBirthDate(object.getBirthDate());
                hasThatReader = true;
                System.out.println("Cập nhật thành công");
                return;
            }
        }
        if (!hasThatReader) {
            System.out.println("Không có mã trong hệ thống");
        }
    }
}
