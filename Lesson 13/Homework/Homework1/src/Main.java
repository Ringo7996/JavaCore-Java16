import entity.Pet;
import handle.Handle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();
        Handle handle = new Handle();
        handle.addList(pets);
        handle.match(pets);
    }
}
