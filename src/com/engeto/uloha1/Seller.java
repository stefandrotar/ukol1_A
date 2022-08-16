package com.engeto.uloha1;

/**
 * Class representing Seller of carrot
 */
public class Seller {
    private String firstName;
    private String lastName;
    private int agreedAccord;
    double soldCarrotsTons;
    private String mestoSidlaProdejce;
    private RegistrationPlate registrationPlate;
    private double consumptionLiters;

    private IPv4 iPv4;

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

    public int getAgreedAccord() {
        return agreedAccord;
    }

    public void setAgreedAccord(int agreedAccord) {
        this.agreedAccord = agreedAccord;
    }

    public double getSoldCarrotsTons() {
        return soldCarrotsTons;
    }

    public void setSoldCarrotsTons(double soldCarrotsTons) {
        this.soldCarrotsTons = soldCarrotsTons;
    }

    public String getMestoSidlaProdejce() {
        return mestoSidlaProdejce;
    }

    public void setMestoSidlaProdejce(String mestoSidlaProdejce) {
        this.mestoSidlaProdejce = mestoSidlaProdejce;
    }

    public RegistrationPlate getRegistrationPlate() {
        return registrationPlate;
    }

    public void setRegistrationPlate(RegistrationPlate registrationPlate) {
        this.registrationPlate = registrationPlate;
    }

    public double getConsumptionLiters() {
        return consumptionLiters;
    }

    public void setConsumptionLiters(double consumptionLiters) {
        this.consumptionLiters = consumptionLiters;
    }

    public Seller(String firstName, String lastName, int agreedAccord, double soldCarrotsTons, String mestoSidlaProdejce, RegistrationPlate registrationPlate, double consumptionLiters, IPv4 iPv4) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.agreedAccord = agreedAccord;
        this.soldCarrotsTons = soldCarrotsTons;
        this.mestoSidlaProdejce = mestoSidlaProdejce;
        this.registrationPlate = registrationPlate;
        this.consumptionLiters = consumptionLiters;
        this.iPv4 = iPv4;
    }

    public IPv4 getiPv4() {
        return iPv4;
    }
}
