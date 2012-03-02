/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

/**
 *
 * @author alumnos
 */
public class Main {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
        // TODO code application logic here
        // Aqui instanciamos la Calculadora
        Calculadora calculadora1 = new Calculadora();
        Calculadora pepito = new Calculadora();

        // Se imprimen los calculos
        System.out.println(calculadora1.suma(4, 6));
        System.out.println(pepito.producto(5, 12));

        //System.out.println(suma(4,5));
        //System.out.println(resta(4,5));
        //System.out.println(producto(4,5));
        //System.out.println(cociente(16,5));
    }

}
