package entity;

import java.util.ArrayList;

public class Tiktok {
    public ArrayList<Idol> idols;
    public ArrayList<Song> songs;

    public Tiktok(ArrayList<Idol> idols, ArrayList<Song> songs) {
        this.idols = idols;
        this.songs = songs;
    }

    public Tiktok() {
    }

    @Override
    public String toString() {
        return "entity.Tiktok{" +
                "idolArrayList=" + idols +
                ", songArrayList=" + songs +
                '}';
    }
}


