import javax.print.Doc;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Aurelio Guerrero","Pediatría");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
    }
}
