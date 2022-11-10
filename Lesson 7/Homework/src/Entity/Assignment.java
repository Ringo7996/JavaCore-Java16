package Entity;

import java.util.Arrays;

public class Assignment {
    private BusDriver busDriver;
    private RouteDetail[] routeDetails;

    public Assignment(BusDriver busDriver, RouteDetail[] routeDetails) {

    }

    public BusDriver getBusDriver() {
        return busDriver;
    }

    public void setBusDriver(BusDriver busDriver) {
        this.busDriver = busDriver;
    }

    public RouteDetail[] getRouteDetails() {
        return routeDetails;
    }

    public void setRouteDetails(RouteDetail[] routeDetails) {
        this.routeDetails = routeDetails;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "busDriver=" + busDriver +
                ", routeDetails=" + Arrays.toString(routeDetails) +
                '}';
    }




}
