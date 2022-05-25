import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    //Atributos
    static int id = 0; //Autoincrement
    private String name;
    private String email;
    private String address;
    private String PhoneNumber;

    private String speciality ;


    //Usaremos enum cada vez que necesitemos representar un conjunto fijo de constantes. Por ejemplo los días de la semana.

    /*public enum Day {
        MONDAY("Lunes");
        TUESDAY("Jueves");
        FRIDAY("Viernes");
        SATURDAY("Sábado");
        SUNDAY("Domingo");

        private String spanish;

        private Day(String s) {
            spanish = s;
        }

        private String getSpanish() {
            return spanish;
        }

         System.out.println(Day.MONDAY);
    }*/


    Doctor(){
        System.out.println("Construyendo el Objeto Doctor");
    }

    Doctor(String name, String speciality){
        System.out.println("El nombre del Doctor asignado es: " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){//metodo   publico  donde  se  recibe la  fecha  y  hora   ,  mi primer  ecuentro con colecciones
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){// nos  devuelve    una lista  con la  citas  de los   doctores
        return availableAppointments;
    }


//  clase  publica   independiente.
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

}
