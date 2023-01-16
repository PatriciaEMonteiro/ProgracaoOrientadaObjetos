package poo.model;

public class Address {

    public enum TypeAddress {
        RESIDENTIAL,
        DELIVERY,
        JOB}

    public String address;
    public String number;
    public String complement;
    public String district;
    public String state;
    public String zipCode;
    public TypeAddress type;


}
