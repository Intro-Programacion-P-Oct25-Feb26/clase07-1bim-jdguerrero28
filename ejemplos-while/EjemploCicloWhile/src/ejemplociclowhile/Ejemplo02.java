/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejemplo02 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite;
        int contador = 1;
        System.out.println("Ingrese el Límite");
        limite = entrada.nextInt(); 
        while (contador <= limite){
            
            if (contador%2!=0) {
                System.out.printf("Contador %d\n", 
                    contador);
            }
            
            contador = contador + 1;
        }
        
    }
}
/*
El codigo hace un contador que tiene un limite que se da por teclado, por lo 
tanto el limite lo da el usuario en donde mientras el contador divido para 2 
tenga un residuo diferente de cero se debe imprimir el valor del contador en ese
instante, caso contrario al contador se va sumando 1
*/