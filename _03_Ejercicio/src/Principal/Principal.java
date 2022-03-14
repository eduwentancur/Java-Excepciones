package Principal;

import static java.lang.Integer.parseInt;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        boolean salida = false;
        do {
            System.out.println("Ingrese 2 numero para dividir");
            try {
                int num1 = parseInt(teclado.next());
                int num2 = parseInt(teclado.next());
                salida = true;
                try {
                    System.out.println(DivisionDeNumero.division(num1, num2));
                } catch (ArithmeticException e) {
                    System.out.println("Error en la division: "+e);
                }
            } catch (NumberFormatException e) {
                System.out.println("Error en los numeros ingresados: "+e);
            }
        } while (!salida);
    }
}
