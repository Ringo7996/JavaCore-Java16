package logic_handle;

import entity.Reporter;
import run.MainRun;

import java.util.Scanner;

public class ReporterLogic {

    public static void addNewReporter() {
        System.out.println("Nhập số phóng viên muốn thêm mới");
        int reporterNum = new Scanner(System.in).nextInt();
        do {
            if (reporterNum > 0) {
                break;
            }
            System.out.println("Mời nhập lại số dương");
            reporterNum = new Scanner(System.in).nextInt();
        } while (true);
        for (int i = 0; i < reporterNum; i++) {
            Reporter reporter = new Reporter();
            reporter.inputInfo();
            saveReporter(reporter);
        }
    }

    public static void saveReporter(Reporter reporter) {
        for (int i = 0; i < MainRun.reporters.length; i++) {
            if (MainRun.reporters[i] == null) {
                MainRun.reporters[i] = reporter;
                break;
            }
        }
    }

    public static void showReporter() {
        for (int i = 0; i < MainRun.reporters.length; i++) {
            if (MainRun.reporters[i] != null) {
                System.out.println(MainRun.reporters[i]);
            }
        }
    }

}
