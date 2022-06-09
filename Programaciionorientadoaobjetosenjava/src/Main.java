import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.user;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Anahí Salgado", "anahi@anahi.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);

        user user = new Doctor("Anahi", "ana@ana.com");
        user.showDataUser();
        user user1 =new user("Edwin","emgallego@uao.edu.co" ){
            @Override
            public void showDataUser(){
                System.out.println("hospital: cruz verde");
                System.out.println("Departamento: pegriatria");
            }
        };
        user1.showDataUser();
        ISchedulable iSchedulable=new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };


        /*

        for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
        */


        System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        System.out.println(patient);

    }



}
