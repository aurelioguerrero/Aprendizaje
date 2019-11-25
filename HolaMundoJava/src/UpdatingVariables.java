public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //bono $200
        salary = salary + 200;
        System.out.println(salary);

        //Pensión: $50 descuento
        salary = salary - 50;
        System.out.println(salary);

        salary = salary + (30*2) - 45;
        System.out.println(salary);

        String employeeName = "Aurelio Guerrero";
        employeeName = employeeName + " Rueda";
        System.out.println(employeeName);
    }
}
