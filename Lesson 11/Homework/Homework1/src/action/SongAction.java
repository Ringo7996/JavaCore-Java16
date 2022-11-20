package action;

import entity.Song;

import java.util.Scanner;

public class SongAction {
    public static int AUTO_ID = 1;
    public Song inputSong(Scanner scanner) {
        int id = AUTO_ID;
        AUTO_ID++;
        System.out.print("Nhập tên bài hát: ");
        String name = scanner.nextLine();
        System.out.print("Nhập ca sĩ: ");
        String singer = scanner.nextLine();

        Song song = new Song(id, name, singer);
        return song;
    }
}
