package Entity;

import java.util.Arrays;

public class PhanCong {
    private Driver driver;
    private Tuyen_Vong[] tuyen_vongs;

    public PhanCong(Driver driver, Tuyen_Vong[] tuyen_vongs) {
        this.driver = driver;
        this.tuyen_vongs = tuyen_vongs;
    }

    @Override
    public String toString() {
        return "PhanCong{" +
                "driver=" + driver +
                ", tuyen_vongs=" + Arrays.toString(tuyen_vongs) +
                '}';
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Tuyen_Vong[] getTuyen_vongs() {
        return tuyen_vongs;
    }

    public void setTuyen_vongs(Tuyen_Vong[] tuyen_vongs) {
        this.tuyen_vongs = tuyen_vongs;
    }
}
