package logic_handle;

import entity.Writer;

import java.util.Scanner;

import static run.MainRun.writers;

public class WriterLogic {

    public static void addNewWriter() {
        System.out.print("Nhập số phóng viên muốn thêm: ");
        int writerNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < writerNum; i++) {
            Writer writer = new Writer();
            writer.inputInfo();
            saveWriter(writer);
        }
    }

    public static void saveWriter(Writer writer) {
        for (int i = 0; i < writers.length; i++) {
            if (writers[i] == null) {
                writers[i] = writer;
                break;
            }
        }
    }

    public static void showWriter() {
        for (int i = 0; i < writers.length; i++) {
            if (writers[i] != null) {
                System.out.println(writers[i]);
            }
        }
    }


}
