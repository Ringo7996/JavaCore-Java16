package constant;

public enum ReporterType {
    PRO("Chuyên nghiệp"),
    AMATEUR("Nghiệp dư"),
    PARTTIME("Cộng tác viên");

    public String value;

    ReporterType(String value) {
        this.value = value;
    }
}
