package logic;

import entity.Goods;
import entity.Salesman;

import java.util.Scanner;

import static run.MainRun.goodss;

public class GoodsLogic {

    public static void addNewGoods() {
        System.out.print("Nhập số mặt hàng muốn thêm: ");
        int goodsNum = new Scanner(System.in).nextInt();

        for (int i = 0; i < goodsNum; i++) {
            Goods goods = new Goods();
            goods.inputInfo();
            saveGoods(goods);
        }
    }

    private static void saveGoods(Goods goods) {
        for (int i = 0; i < goodss.length; i++) {
            if (goodss[i] == null) {
                goodss[i] = goods;
                break;
            }
        }
    }

    public static void showGoods(){
        for (int i = 0; i < goodss.length; i++) {
            if (goodss[i] != null) {
                System.out.println(goodss[i]);
            }
        }
    }
}
