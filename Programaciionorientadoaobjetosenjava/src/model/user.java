package model;

public class user {
    /*Super indica que una variable o método es de la clase padre, la superclase de cual heredan nuestras subclases,
      solo la usamos cuando aplicamos herencia. Además, podemos llamar al constructor de la clase
      padre desde sus diferentes subclases usando super(); y enviando los argumentos que sean necesarios.
      Por otro lado, this nos permite especificar que nuestras variables están señalando a la misma clase
      donde estamos trabajando, ya sea una clase normal, anidada, subclase o superclase.*/

    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public user(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8){
            System.out.println("El número telefónico debe ser de 8 dígitos máximo");
        }else if(phoneNumber.length() == 8){
            this.phoneNumber = phoneNumber;
        }
    }


    @Override
    public String toString() {
        return "User: " + name + ", Email: "+email+
                "\nAddreess: "+address+". Phone: "+phoneNumber;
    }
}
