import ui.UIMenu;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Doctor myDoctor;
        myDoctor = new Doctor();




        myDoctor.name = "edwin gallego";
        myDoctor.speciality= "medico del  amor.";


        //myDoctor.showName();
        //myDoctor.showId();
        Doctor myDoctorAnn= new Doctor();
        //myDoctor.showId();
        UIMenu.showMenu();

        System.out.println(myDoctor.id);
        System.out.println("hola  tqm");
    }
}
