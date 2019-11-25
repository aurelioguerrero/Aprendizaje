public class Casting {
    public static void main(String[] args) {
        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println (estimatedMonthlyDogs);

        int a = 30;
        int b = 12;

        System.out.println((double) a/b);

        //primero hace la división y debido a que los valores son decimales, el resultado de la división es un entero
        //luego se hace el casteo y simplemente el compilador le agrega una parte decimal con cero.
        //es decir, hace el casting del resultado.
        double c = a/b;
        System.out.println(c);
        c = (double) a/b;
        System.out.println(c);

        //Asigna el código ASCII del caracter
        char n = '1';
        int nI = n;
        System.out.println(nI);
        //Si no se hace el casting explícito, el compilador va a marcar error debido a que un char es mayor a un short.
        short nS = (short) n;
        System.out.println(nS);
    }
}
