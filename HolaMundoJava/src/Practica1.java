public class Practica1 {
    public static void main(String[] args) {
        //========================================Ejercicio 1=================================================
        String nombreEsposa = "Yuliana Calero";
        String nombreEsposo = "Aurelio Guerrero";
        String nombreHijo   = "Emmanuel Guerrero";

        int edadEsposo = 35;
        int edadEsposa = 35;
        float edadHijo   = 2.5F;

        System.out.println("Hola, mi nombre es "+nombreEsposo+" y tengo "+edadEsposo+" años de edad.");
        System.out.println("El nombre de mi esposa es "+nombreEsposa+" y tiene "+edadEsposa+" años de edad.");
        System.out.println("Tenemos un hermoso hijo llamado "+nombreHijo+" que tiene "+edadHijo+" años de edad.");

        //=========================================Ejercicio 2=================================================
        char c = 'z'; //conviertelo a int
        int i = 250; //conviertelo a long y luego de long a short
        double d = 301.067; //conviertelo a long
        int ia = 100; //súmale 5000.66 y conviertelo a float
        int ib = 737; //multiplícalo por 100 y conviertelo a byte
        double da = 298.638; //divídelo entre 25 y conviertelo a long

        int c2 = c;//122
        System.out.println("La variable c convertida a int con casting implícito: "+c2+". Se calcula con exactitud.");
        long i2 = i;//250
        System.out.println("La variable i convertida a long con casting implícito: "+i2+". Se calcula con exactitud.");
        short i3 = (short)i2;//250
        System.out.println("La variable i convertida a long y luego a short con casting explícito: "+i3+". Se calcula con exactitud.");
        long d2 = (long)d;//301
        System.out.println("La variable d convertida a long con casting explícito: "+d2+". Se calcula con estimación.");
        float ia2 = ia += 5000.66;//5100.0
        System.out.println("La variable ia+500.66 y convertida a float con casting implícito: "+ia2+". Se calcula con estimación.");
        byte ib2 = (byte)(ib*100);//-28
        System.out.println("La variable ib*100 y convertida a byte con casting explícito: "+ib2+". Se calcula con exactitud.");
        long da2 = (long)(da /= 25);//11
        System.out.println("La variable da/25 y convertida a long con casting explícito: "+da2+". Se calcula con estimación.");
    }
}
