/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo
fuera de rango).
*/
package Principal;

import java.util.Locale;
import java.util.Scanner;


public class Principal {

    
    public static void main(String[] args) {
        Class clase = new Class();
        Scanner teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        boolean salida=false;
        do {
            System.out.println("Ingrese numero entre el 1 y 10");
            try {
                clase.generarException(teclado.nextInt());
                salida=true;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("FUERA DE RANGO: "+e);
            }
        } while (!salida);
    }
}
