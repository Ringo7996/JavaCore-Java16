package entity;

import java.util.Arrays;

public class PurchaseList {
    private Salesman salesman;
    private SoldManagement[] soldManagements;
    private double revenue;

    public PurchaseList(Salesman salesman, SoldManagement[] soldManagements) {
        this.salesman = salesman;
        this.soldManagements = soldManagements;
    }

    public PurchaseList(Salesman salesman, SoldManagement[] soldManagements, int revenue) {
        this.salesman = salesman;
        this.soldManagements = soldManagements;
        this.revenue = revenue;
    }


    public Salesman getSalesman() {
        return salesman;
    }

    public void setSalesman(Salesman salesman) {
        this.salesman = salesman;
    }

    public SoldManagement[] getSoldManagements() {
        return soldManagements;
    }

    public void setSoldManagements(SoldManagement[] soldManagements) {
        this.soldManagements = soldManagements;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    @Override
    public String toString() {
        return "PurchaseList{" +
                "salesman=" + salesman +
                ", soldManagements=" + Arrays.toString(soldManagements) +
                ", revenue=" + revenue +
                '}';
    }
}
