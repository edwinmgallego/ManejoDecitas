import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();
        /*
        * El Polimorfismo es una característica de la programación orientada a objetos que consiste en sobrescribir
        * algunos métodos de la clase de la cual heredan nuestras subclases para asignar comportamientos diferentes.
        * Además de los métodos de las superclases, también podemos redefinir el comportamiento
        * de los métodos que “heredan” todos nuestros objetos, así como .toString, hashCode, finalize, notify,
        *  entre otros. La sobreescritura de constructores consiste en usar los miembros heredados de una
        * supreclase pero con argumentos diferentes. Recuerda que no podemos sobrescribir los métodos marcados como final o static.
        * */
        Doctor myDoctor = new Doctor("Anahí Salgado", "Pediatria");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }


        System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        Patient patient2 = new Patient("Anahi", "anahi@mail.com");

        System.out.println(patient);

    }



}
