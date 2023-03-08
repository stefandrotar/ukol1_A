import java.io.IOException;

public class IPv4 {
    private final static char DELIMETER = '.';
    private int oktetOne;
    private int oktetTwo;
    private int oktetThree;
    private int oktetFour;




    private boolean isValidOktet(int oktet) {
        return oktet > 0;
    }

    public IPv4(int oktetOne, int oktetTwo, int oktetThree, int oktetFour) {
        if(isValidOktet(oktetOne)) {this.oktetOne = oktetOne;}
        else throw new IllegalArgumentException("Error, oktet number should be >=0");

        if(isValidOktet(oktetTwo)) { this.oktetTwo= oktetTwo;}
        else throw new IllegalArgumentException("Error, oktet number should be >=0");

        if(isValidOktet(oktetThree)) {  this.oktetThree=oktetThree;}
        else throw new IllegalArgumentException("Error, oktet number should be >=0");

        if(isValidOktet(oktetFour)) { this.oktetFour=oktetFour;}
        else throw new IllegalArgumentException("Error, oktet number should be >=0");







    }

    @Override
    public String toString() {
        return "IPv4: " +
                 oktetOne + DELIMETER +
                 oktetTwo + DELIMETER+
                 oktetThree + DELIMETER +
                 oktetFour + DELIMETER;
    }

    public int getOktetOne() {
        return oktetOne;
    }

    public void setOktetOne(int oktetOne) {
        this.oktetOne = oktetOne;
    }

    public int getOktetTwo() {
        return oktetTwo;
    }

    public void setOktetTwo(int oktetTwo) {
        this.oktetTwo = oktetTwo;
    }

    public int getOktetThree() {
        return oktetThree;
    }

    public void setOktetThree(int oktetThree) {
        this.oktetThree = oktetThree;
    }

    public int getOktetFour() {
        return oktetFour;
    }

    public void setOktetFour(int oktetFour) {
        this.oktetFour = oktetFour;
    }

}
