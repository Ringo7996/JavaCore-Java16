package action;

import entity.Idol;
import entity.Song;
import entity.Tiktok;

import java.util.ArrayList;
import java.util.Scanner;

public class TiktokAction {
    public ArrayList<Idol> idols = new ArrayList<Idol>();
    public ArrayList<Song> songs = new ArrayList<Song>();
    public Tiktok inputTiktok(Scanner scanner) {
        System.out.print("Nhập số idol bạn muốn thêm: ");
        int idolNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < idolNumber; i++) {
            IdolAction idolAction = new IdolAction();
            Idol idol = idolAction.inputIdol(scanner);
            idols.add(idol);
        }
        System.out.println("-------");


        System.out.print("Nhập số bài hát bạn muốn thêm: ");
        int songNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < songNumber; i++) {
            SongAction songAction = new SongAction();
            Song song = songAction.inputSong(scanner);
            songs.add(song);
        }
        System.out.println("-------");


        Tiktok tiktok = new Tiktok(idols, songs);
        return tiktok;
    }
}
