package com.company;

public class Doctor {
static int id = 0;
String name;
String speciality;
//comportamientos
Doctor(){
    System.out.println("construyendo  el objeto  Doctor");
    id++;
}
Doctor(String name){
    System.out.println("elnombre  del  doctor es  "+ name);

}
    public void showName(){
        System.out.println(name);
        System.out.println(speciality);

    }
    public  void showId(){
        System.out.println("ID doctor:  "+ id);
    }
}
