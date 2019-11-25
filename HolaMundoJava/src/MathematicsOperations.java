public class MathematicsOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        System.out.println(Math.ceil(x));
        System.out.println(Math.floor(x));
        System.out.println(Math.pow(x,y));
        System.out.println(Math.max(x,y));
        System.out.println(Math.sqrt(y));
        //Área de un círculo
        System.out.println(Math.PI*Math.pow(y,2));
        //Área de una esfera
        System.out.println(4*Math.PI*Math.pow(y,2));
    }
}
