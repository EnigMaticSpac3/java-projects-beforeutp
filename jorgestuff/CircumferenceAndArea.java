
import java.util.Scanner;

public class CircumferenceAndArea {
    /* February 2, 2023.     
    * Usar instrucciones de asignación para calcular la circunferencia y el área de un círculo.
    * También el volúmen de una esfera con base en el mismo radio.  
    */ 

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Variables
        double radio, circunferencia, area, volumen;
    
        // Pedir Radio
        System.out.print("Ingrese el radio del Circulo: ");
        radio = scanner.nextDouble();
        
        // Calcular Circunferencia - 2 * PI * radio
        circunferencia = 2 * Math.PI * radio;

        // Calcular area - PI*radio^2
        area = Math.PI * Math.pow(radio, 2);
        
        // Calcular volumen - 4/3 * PI * radio^3
        volumen = 4/3 * Math.PI * Math.pow(radio, 3);

        // Imprimir resultados
        System.out.printf("\nLa circunferencia del circulo es: %.3f", circunferencia);
        System.out.printf("\nEl area del circulo es: %.3f", area);
        System.out.printf("\nEl volumen del circulo es: %.3f", volumen);

        scanner.close();
    }
}
