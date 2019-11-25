public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnable = false;
        int fileSended = 3;

        if(isBluetoothEnable){
            //Send file
            fileSended++;
            System.out.println("Archivo Enviado");
        }else{
            System.out.println("Por favor enciende tu Bluetooth para enviar la transferencia.");
        }

        System.out.println(isBluetoothEnable);
        System.out.println(fileSended);
    }
}
