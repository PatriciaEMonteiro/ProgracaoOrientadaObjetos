package poo.model;

public class Person {

    private static final int TAMANHO_CPF = 11;
    private static final int TAMANHO_CNPJ = 14;

    public enum TypePerson {
        PHYSICAL,
        LEGAL
    }

    public Integer code;
    public String name;
    private String document;
    public TypePerson typePerson;

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        if (document == null || document.isEmpty()){
            throw new RuntimeException("Documento não pode ser nulo ou vazio!");
        }

        if (document.length() == TAMANHO_CPF){
            setDocument(document, typePerson = TypePerson.PHYSICAL);
        }
        else if (document.length() == TAMANHO_CNPJ){
            setDocument(document, typePerson = TypePerson.LEGAL);
        }
        else{
            throw new RuntimeException("Documento invalido para pessoal fisica ou juridica");
        }
    }

    private void setDocument(String document, TypePerson typePerson){
        this.document = document;
        this.typePerson = typePerson;
    }

    public TypePerson getTypePerson() {
        return typePerson;
    }

}
