//Clase Main con el menú de los métodos, recibe los datos del usuario por consola
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            AdmiPersonas admi = new AdmiPersonas();

            do {
                System.out.println("======= Menú =========:");
                System.out.println("1. Agregar personas");
                System.out.println("2. Mostrar nombres y géneros");
                System.out.println("3. Calcular promedio de edad");
                System.out.println("4. Contar masculinos");
                System.out.println("5. Contar femeninos");
                System.out.println("6. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer

                switch (opcion) {
                    case 1 -> admi.AgregarPersonas();
                    case 2 -> admi.mostrarNombresyGeneros();
                    case 3 -> System.out.println("Promedio de edad: " + admi.calcularPromedioEdad());
                    case 4 -> System.out.println("Cantidad de masculinos: " + admi.contarMasculinos());
                    case 5 -> System.out.println("Cantidad de femeninos: " + admi.contarFemeninos());
                    case 6 -> System.out.println("Saliendo...");
                    default -> System.out.println("Opción inválida. Intente nuevamente.");
                }
            } while (opcion != 6);
        }
    }
}
