public class Airport {
    private String name;
    private String address;
    private String code;

    public Airport(String name, String address, String code) {
        this.name = name;
        this.address = address;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCode() {
        return code;
    }
}
