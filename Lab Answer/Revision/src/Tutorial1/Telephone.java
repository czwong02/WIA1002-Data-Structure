package Tutorial1;

public class Telephone {
    private String areaCode;
    private int number;
    static int numberOfTelephone;

    public Telephone(String areaCode, int number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public int getNumber() {
        return number;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public String makeFullNumber() {
        return areaCode + "-" + number;
    }
}