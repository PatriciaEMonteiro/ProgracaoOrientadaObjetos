package poo.model;

import poo.one.DeliveryCardApp;

import java.util.ArrayList;
import java.util.List;

public class Client extends Person {

    private String numCard;
    private List <Address> addresses;

    public void addAddress(Address address){
        if (address==null){
            throw new NullPointerException("Endereço não pode ser nulo!");
        }

        if (address.zipCode==null){
            throw new NullPointerException("Cep não pode ser nulo!");
        }

        getAddresses().add(address);

    }

    private List<Address> getAddresses() {
        if (addresses==null){
            addresses = new ArrayList<Address>();
        }
        return addresses;
    }

}
