package entity;

public class SoldManagement {
    private Goods goods;
    private int sold;

    public SoldManagement(Goods goods, int sold) {
        this.goods = goods;
        this.sold = sold;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    @Override
    public String toString() {
        return "Sold{" +
                "goods=" + goods +
                ", sold=" + sold +
                '}';
    }
}
