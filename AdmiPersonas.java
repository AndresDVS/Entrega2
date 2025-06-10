//Clase con los métodos de la rubrica
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class AdmiPersonas{
    private ArrayList<Persona> listaPersonas = new ArrayList <>();
    Scanner scanner = new Scanner(System.in);

    public void AgregarPersonas(){
        for(int i = 0; i < 5; i ++){
            System.out.println("Ingrese el nombre");
            String nombre = scanner.nextLine();
            System.out.println("Ingresa el apellido ");
            String apellido = scanner.nextLine();
        
            String genero;
            do { 
                System.out.println("Ingrese el genero (Masculino/Femenino):");
                genero = scanner.nextLine();
                if(!(genero.equalsIgnoreCase("Masculino") || genero.equalsIgnoreCase("Femenino"))){
                    System.out.println("Género inválido. Debe ser 'Masculino' o 'Femenino'.");
                }
            } while (!(genero.equalsIgnoreCase("Masculino") || genero.equalsIgnoreCase("Femenino")));
            System.out.println("Ingrese la fecha de nacimiento (YYYY-MM-DD)");
            LocalDate fechanacimiento = LocalDate.parse(scanner.nextLine());
            listaPersonas.add(new Persona(nombre, apellido, genero, fechanacimiento));
        }
    }
    public void mostrarNombresyGeneros(){
        for(Persona persona:listaPersonas){
            System.out.println("Nombre:" + " " + persona.getNombre() + " " +"Genero:" + " " + persona.getGenero() );
        }
    }
    public double calcularPromedioEdad(){ 
    int suma = 0;
    for(Persona persona:listaPersonas) {
        suma += persona.getFechanacimiento();
    }
    if (listaPersonas.size() == 0) {
        return 0; // Evita división por cero
    }
        return (double) suma / listaPersonas.size();
    }
  //
  public int contarMasculinos(){
    int contador = 0;
    for (Persona persona:listaPersonas) {
        if(persona.getGenero().equalsIgnoreCase("Masculino")){
            contador ++;
        }  
    }
    return contador;
  }
  // Método para contar personas de género femenino
    public int contarFemeninos() {
        int contador = 0;
        for (Persona persona : listaPersonas) {
            if (persona.getGenero().equalsIgnoreCase("Femenino")) {
                contador++;
            }
        }
        return contador;
    }
}


