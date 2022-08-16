package com.engeto.uloha1;

/**
* Class describing registration plate of a car
 */
public class RegistrationPlate {

    private String SPZ;

    public RegistrationPlate(String SPZ) {
        this.SPZ = SPZ;
    }

    public String getSPZ() {
        return SPZ;
    }

    public void setSPZ(String SPZ) {
        this.SPZ = SPZ;
    }

    public void changeSPZatPosition(int position, char newChar) {

        try {
            StringBuilder newSPZ = new StringBuilder(SPZ);
            newSPZ.setCharAt(position - 1, newChar);
            SPZ = newSPZ.toString();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Chyba, pozicia SPZ nie je platne cislo.\n" +
                    "Zadana pozicia " + position + " je mimo rozsah cisel: 1 az " + SPZ.length());
        }
    }

    @Override
    public String toString() {
        return "SPZ:" + SPZ;
    }
}