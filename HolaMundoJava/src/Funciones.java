public class Funciones {
    public static void main(String[] args){
        double x = 2.1;
        double y = 3;

        //Area de un circulo
        //pi * r2
        double area = circleArea(y);
        System.out.println(area);

        //Area de una esfera
        //4*PI*r2
        sphereArea(y);

        //Volumen de una esfera
        //(4/3)*pi * r3
        sphereVolume(y);
        System.out.println("Pesos a dolares :  " + convertToDolar(1000, "COP"));
    }


    /**
     * Función para el area de un circulo especificando el radio del mismo
     * @param r Es el radio qe se usa para la ecuacion
     * @return devuelve el area del circulo directamente
     * */
    public static double circleArea(double r){
        return Math.PI * Math.pow(r, 2);
    }


    /**
     * Funcion para encontrar el area de una esfera
     * @param r El radio del esfera
     * @return devuelve el area de la esfera
     * */
    public static double sphereArea(double r){
        return 4*Math.PI * Math.pow(r, 2);
    }

    /**
     * Funcion para encontrar el volumen de una esfera
     * @param r El radio de la esfera
     * @return devuelve el volumen de la misma
     * */
    public static double sphereVolume(double r){
        return (4 / 3) * Math.PI * Math.pow(r, 3);
    }

    /**
     *Función que especificando el tipo de moneda lo convierte una cantidad de dinero a dólares
     * @param quantity cantidad de dinero
     * @param currency Tipo de moneda: solo se acepta MXN o COP
     * @return quantity Devuelve la cantidad en dolares
     * */
    public static double convertToDolar(double quantity, String currency){
        switch (currency) {
            case"MXN":
                quantity = quantity * 0.052;
                break;
            case"COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}
