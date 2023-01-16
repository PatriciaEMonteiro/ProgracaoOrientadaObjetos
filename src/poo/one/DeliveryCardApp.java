package poo.one;

import poo.model.Address;
import poo.model.Client;

import java.util.ArrayList;

public class DeliveryCardApp {

    public static void main(String[] args) {
        //Dados do endereço
        Address address = new Address();
        address.zipCode = "000000000";

        //Dados do cliente
        Client client = new Client();

        try{
            client.addAddress(address);
            System.out.println("Endereço Adicionado com sucesso!");
        } catch (Exception e){
            System.err.println("Houve um erro ao adicionar o endereço: " + e.getMessage());
        }

    }

}
