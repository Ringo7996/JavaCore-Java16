package constant;

public enum GoodsType {
    DIEN_TU("Điện tử"),
    DIEN_LANH("Điện lạnh"),
    MAY_TINH("Máy tính"),
        TBVP("Thiết bị văn phòng");

    public String value;

    GoodsType(String value) {
        this.value = value;
    }
}


