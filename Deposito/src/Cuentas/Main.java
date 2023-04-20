package Cuentas;

/**
*Esta clase se encarga de realizar operaciones sobre las cuentas bancarias. 
*
*@author Oscar Urbon Risueno
*@version 1.0
*/
public class Main {
	
	/** Crea las cuentas y llama a los metodos que operan sobre ellas. 
	*@param args Argumentos de entrada. 
	*/
    public static void main(String[] args) {
       	CCuenta cuenta1;
    	cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",3000,0);
    	operativa_cuenta (cuenta1,0);
    }
    
    /**
     * Realiza una serie de operaciones consecutivas sobre una cuenta.
     * Imprime un mensaje con el saldo actual, y trata de hacer una retirada y un ingreso. 
     * Si no fuera posible realizar alguna de las operaciones, imprime un mensaje de error en pantalla. 
     * @param cuenta Cuenta bancaria sobre la que operar.
     * @param cantidad Sin uso actualmente.
     */
    public static void operativa_cuenta (CCuenta cuenta, float cantidad) {
    	double saldoActual= cuenta.estado();
        System.out.println("El saldo actual es " + saldoActual);
        try {
            cuenta.retirar(2300);
            } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(695);
               } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
