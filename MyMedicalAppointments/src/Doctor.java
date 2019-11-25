public class Doctor {
    static int id = 0;//Autoincrement
    String name;
    String speciality;

    Doctor(){
        System.out.println("Construyendo el objeto Doctor");
        id++;
    }

    Doctor(String nombre){
        System.out.println("El nombre asignado al doctor es " + nombre);
    }

    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: "+id);
    }
}
