package Entity;

public class RouteDetail {
    private Route route;
    private int turnNum;

    public RouteDetail(Route route, int turnNum) {

    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public int getTurnNum() {
        return turnNum;
    }

    public void setTurnNum(int turnNum) {
        this.turnNum = turnNum;
    }

    @Override
    public String toString() {
        return "RouteDetail{" +
                "route=" + route +
                ", turnNum=" + turnNum +
                '}';
    }
}
