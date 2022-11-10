package Constant;

public enum BusDriverLevel {
    LEVEL_A("Level A"),
    LEVEL_B("Level B"),
    LEVEL_C("Level C"),
    LEVEL_D("Level D"),
    LEVEL_E("Level E"),
    LEVEL_F("Level F");


    public String value;
    BusDriverLevel(String value){
        this.value = value;
    }
}
