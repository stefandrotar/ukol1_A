/**
* Class representing IPv4 address
 */
public class IPv4 {
    private final static char delimeter = '.';
    private int octet1;
    private int octet2;
    private int octet3;
    private int octet4;

    public IPv4(int octet1, int okcet2, int octet3, int octet4) {
        this.octet1 = octet1;
        this.octet2 = okcet2;
        this.octet3 = octet3;
        this.octet4 = octet4;
    }

    public int getOctet1() {
        return octet1;
    }
    public int getOctet2() {
        return octet2;
    }
    public int getOctet3() {
        return octet3;
    }
    public int getOctet4() {
        return octet4;
    }

    @Override
    public String toString() {
        return String.valueOf(octet1) + delimeter + String.valueOf(octet2)+ delimeter +
                String.valueOf(octet3) + delimeter + String.valueOf(octet4);
    }

    public void setWholeIPv4(int newOctet1, int newOctet2, int newOctet3, int newOctet4) {
        this.octet1 =newOctet1;
        this.octet2 =newOctet2;
        this.octet3 =newOctet3;
        this.octet4 =newOctet4;
    }
}
