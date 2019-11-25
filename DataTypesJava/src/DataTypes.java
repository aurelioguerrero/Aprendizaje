public class DataTypes {
    public static void main(String[] args) {
        //4 bytes, hasta 10 dígitos desde -2,147,483,648 hasta 2,147,483,647
        int n = 1234567891;
        //8 bytes, desde -9,223,372,036,854,775,808 hasta 9,223,372,036,854,775,807
        //si tiene hasta 10 dígitos, el compilador lo considera entero, si es mayor, hay que diferenciarlo con una L al final
        long nL = 12345678915L;

        //Algo similar sucede con los flotantes
        double nD = 123.456;
        float nF = 123.456F;

        var salary = 1000;//int
        var pension = salary*0.03;//double
        var totalSalary = salary-pension;//double
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Aurelio Guerrero";
        System.out.println("Employee: "+employeeName+" SALARY: "+totalSalary);
    }
}
