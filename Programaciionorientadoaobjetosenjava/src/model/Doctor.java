package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends user {
    //Atributo
    /*
    Super indica que una variable o método es de la clase padre, la superclase de cual heredan nuestras subclases, solo la usamos cuando aplicamos herencia.

Además, podemos llamar al constructor de la clase padre desde sus diferentes subclases usando super(); y enviando los argumentos que sean necesarios.

Por otro lado, this nos permite especificar que nuestras variables están señalando a la misma clase donde estamos trabajando, ya sea una clase normal, anidada, subclase o superclase.
    * */
    private String speciality;

    public Doctor(String name, String email){
        super(name,email);
        System.out.println("El nombre del model.Doctor asignado es: " + name);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();


    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSpeciality: "+ speciality+ "\nAbailable: "+ availableAppointments.toString() ;
    }

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

        @Override
        public String toString() {
            return "AvailableAppointment{" +"\ndate =" + date + ", \ntime ='" + time + '\'' +  '}';
        }
    }

}
