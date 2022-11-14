package Entity;

public class Tuyen_Vong {
    private Route route;
    private int vong;

    public Tuyen_Vong(Route route, int vong) {
        this.route= route;
        this.vong = vong;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public int getVong() {
        return vong;
    }

    public void setVong(int vong) {
        this.vong = vong;
    }

    @Override
    public String toString() {
        return "Tuyen_Vong{" +
                "route=" + route +
                ", vong=" + vong +
                '}';
    }
}
