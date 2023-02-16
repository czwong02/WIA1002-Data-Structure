package Question1;

public class Telephone {
    String areaCode;
    String number;
    static int numberOfTelephoneObject;

    public Telephone(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
        
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public void setNumber(String number) {
        this.number = number;
    }
  
    public String makeFullNumber () {
        return areaCode + "-" + number;
    }
}