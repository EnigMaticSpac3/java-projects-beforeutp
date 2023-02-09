import java.util.Scanner;

public class Promedio3Notas {
    
    public static void main(String[] args) {
        // Calcular y mostrar la calificación promedio como valor tipo putno flotante.
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, promedio;
        boolean continuar = true;
        String resp;

        while (continuar) {
            System.out.println("Ingrese las 3 notas a promediar.");
            System.out.print("Nota 1: ");
            nota1 = scanner.nextDouble();
            System.out.print("Nota 2: ");
            nota2 = scanner.nextDouble();
            System.out.print("Nota 3: ");
            nota3 = scanner.nextDouble();

            // Calcular Promedio
            promedio = (nota1 + nota2 + nota3) / 3;
            
            // Mostrar
            System.out.printf("El promedio es: %.2f", promedio);

            // Preguntar para reiniciar el programa
            System.out.println("\nDesea promediar otras notas? (s/n)");
            resp = scanner.next();

            if (!resp.equals("s")) {
                continuar = false;
                break;
            }
        }
        System.out.println("Programa Finalizado");
        scanner.close();
    }
}
