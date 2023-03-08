public class CarrotSeller {





    private String firstName;
    private String lastName;
    private int agreedContracts;
    private double soldCarrotsInTons;
    private String sellerCityLocation;
    private SPZ spz;
    private double consumptionLitersPer100KM;
    private IPv4 iPv4;

    public CarrotSeller(String firstName, String lastName, int agreedContracts, double soldCarrotsInTons, String sellerCityLocation, SPZ spz, double consumptionLitersPer100KM, IPv4 iPv4) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.soldCarrotsInTons=soldCarrotsInTons;
        this.sellerCityLocation=sellerCityLocation;
        this.spz=spz;
        this.consumptionLitersPer100KM=consumptionLitersPer100KM;
        this.iPv4=iPv4;
        this.agreedContracts=agreedContracts;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAgreedContracts() {
        return agreedContracts;
    }

    public void setAgreedContracts(int agreedContracts) {
        this.agreedContracts = agreedContracts;
    }

    public double getSoldCarrotsInTons() {
        return soldCarrotsInTons;
    }

    public void setSoldCarrotsInTons(double soldCarrotsInTons) {
        this.soldCarrotsInTons = soldCarrotsInTons;
    }

    public String getSellerCityLocation() {
        return sellerCityLocation;
    }

    public void setSellerCityLocation(String sellerCityLocation) {
        this.sellerCityLocation = sellerCityLocation;
    }

    public SPZ getSpz() {
        return spz;
    }

    public void setSpz(SPZ spz) {
        this.spz = spz;
    }

    public double getConsumptionLitersPer100KM() {
        return consumptionLitersPer100KM;
    }

    public void setConsumptionLitersPer100KM(double consumptionLitersPer100KM) {
        this.consumptionLitersPer100KM = consumptionLitersPer100KM;
    }

    public IPv4 getiPv4() {
        return iPv4;
    }

    public void setiPv4(IPv4 iPv4) {
        this.iPv4 = iPv4;
    }

}
