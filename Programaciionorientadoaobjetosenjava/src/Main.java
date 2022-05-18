import ui.UIMenu;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Doctor myDoctor= new Doctor("Edwin Mauricio Gallego","medico del  amor");
        //UIMenu.showMenu();
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient= new Patient("alejandra","alejandra@gmail.com");
      
    }
}
