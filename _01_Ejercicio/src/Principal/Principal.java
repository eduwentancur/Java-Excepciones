/*
    01 Excepciones
* Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null
* y tratar de invocar el método esMayorDeEdad() a través de ese objeto. Luego,
* englobe el código con una cláusula try-catch para probar la nueva excepción
* que debe ser controlada.
*/

package Principal;

public class Principal {
    
    public static void main(String[] args) {
        Persona persona = null;
        try {
            persona.esMayorDeEdad();
        } catch (NullPointerException e) {
            System.out.println("ERROR "+e);
        }
    }
}
