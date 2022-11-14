package logic;

import entity.Goods;
import entity.PurchaseList;
import entity.Salesman;
import entity.SoldManagement;

import java.util.Scanner;

import static run.MainRun.*;

public class PurchaseListLogic {

    public static void addPurchaseList() {
        System.out.print("Nhập số nhân viên cần tính công");
        int salesmanNumber = new Scanner(System.in).nextInt();

        for (int i = 0; i < salesmanNumber; i++) {
            System.out.print("Nhập mã nhân viên bán hàng thứ " + (i + 1) + ": ");
            int salesmanId = new Scanner(System.in).nextInt();
            Salesman salesman = new Salesman();
            int revenue = 0;

            for (int j = 0; j < salesmen.length; j++) {
                if (salesmen[j] != null && salesmen[j].getId() == salesmanId) {
                    salesman = salesmen[j];
                    break;
                }
            }

            System.out.print("Nhập số lượng mặt hàng nhân viên " + salesman.getName() + " bán: ");
            int goodsNumber = new Scanner(System.in).nextInt();
            SoldManagement[] soldManagements = new SoldManagement[goodsNumber];
            int count = 0;

            do {
                if (goodsNumber > 0 && goodsNumber <= 5) {
                    break;
                }
                System.out.print("Nhập lại số lượng mặt hàng nhỏ hơn 5: ");
                goodsNumber = new Scanner(System.in).nextInt();
            } while (true);

            for (int j = 0; j < goodsNumber; j++) {
                System.out.print("Nhập mã mặt hàng thứ " + (j + 1) + ": ");
                int goodsId = new Scanner(System.in).nextInt();
                Goods goods = new Goods();
                for (int k = 0; k < goodss.length; k++) {
                    if (goodss[k] != null && goodss[k].getId() == goodsId) {
                        goods = goodss[k];
                        break;
                    }
                }

                System.out.print("Nhập số lượng hàng đã bán ở mặt hàng " + goods.getName() + "");
                int sold = new Scanner(System.in).nextInt();

                SoldManagement soldManagement = new SoldManagement(goods, sold);
                soldManagements[count] = soldManagement;
                count++;
                revenue += sold * goods.getPrice();
            }
            PurchaseList purchaseList = new PurchaseList(salesman, soldManagements);
            savePurchaseList(purchaseList);


            PurchaseList purchuaseListWithRevenue = new PurchaseList(salesman, soldManagements, revenue);
            savePurchaseListWithRevenue(purchuaseListWithRevenue);
        }
    }

    private static void savePurchaseListWithRevenue(PurchaseList purchuaseListWithRevenue) {
        for (int i = 0; i < purchaseListWithRevenue.length; i++) {
            if (purchaseListWithRevenue[i] == null) {
                purchaseListWithRevenue[i] = purchuaseListWithRevenue;
                break;
            }
        }
    }

    public static void showPurchaseListWithRevenue() {
        for (int i = 0; i < purchaseListWithRevenue.length; i++) {
            if (purchaseListWithRevenue[i] != null) {
                System.out.println(purchaseListWithRevenue[i]);
            }
        }
    }


    public static void savePurchaseList(PurchaseList purchaseList) {
        for (int i = 0; i < purchaseLists.length; i++) {
            if (purchaseLists[i] == null) {
                purchaseLists[i] = purchaseList;
                break;
            }
        }
    }

    public static void showPurchaseList() {
        for (int i = 0; i < purchaseLists.length; i++) {
            if (purchaseLists[i] != null) {
                System.out.println(purchaseLists[i]);
            }
        }
    }

    public static void sortbyGoods() {
        for (int i = 0; i < goodss.length - 1; i++) {
            if (goodss[i] == null) {
                continue;
            }

            for (int j = i + 1; j < goodss.length; j++) {
                if (goodss[j] == null) {
                    continue;
                }
                if (goodss[i].getType().compareTo(goodss[j].getType()) > 0) {
                    Goods temp = goodss[i];
                    goodss[i] = goodss[j];
                    goodss[j] = temp;
                }
            }
        }
    }

    public static void sortByName() {
        for (int i = 0; i < purchaseLists.length - 1; i++) {
            if (purchaseLists[i] == null) {
                continue;
            }

            for (int j = i + 1; j < purchaseLists.length; j++) {
                if (purchaseLists[j] == null) {
                    continue;
                }
                if (purchaseLists[i].getSalesman().getName().compareTo(purchaseLists[j].getSalesman().getName()) < 0) {
                    PurchaseList temp = purchaseLists[i];
                    purchaseLists[i] = purchaseLists[j];
                    purchaseLists[j] = temp;
                }
            }
        }
    }


}
