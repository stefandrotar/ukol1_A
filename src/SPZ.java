public class SPZ {
    private final static char DELIMETER = ' ';
    private String country;
    private String region;
    private String postfix;

    public SPZ(String country, String region, String postfix) {
        this.postfix=postfix;
        this.region=region;
        this.country=country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostfix() {
        return postfix;
    }

    public void setPostfix(String postfix) {
        this.postfix = postfix;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "SPZ: "+
                country + DELIMETER +
                region  +  DELIMETER +
                postfix;
    }
}
