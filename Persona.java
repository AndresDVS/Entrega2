//super clase
import java.time.LocalDate;
import java.time.Period;

public class Persona{
    private String nombre;
    private String apellido;
    private String genero;
    private LocalDate fechanacimiento;

    public Persona(String nombre,String apellido, String genero,LocalDate fechanacimiento){
        if(!(genero.equalsIgnoreCase("Masculino") || genero.equalsIgnoreCase("Femenino"))){
            throw new IllegalArgumentException("Género inválido. Debe ser 'Masculino' o 'Femenino'");
        }
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechanacimiento= fechanacimiento;
    }        
    // Getters 
    // Hare getters y no incluire setters por que en esta ocasión no modificare ningun valor dentro de las variables

    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getGenero(){
        return genero;
    }
    //Calcula el tiempo transcurrido entre la fecha de nacimiento de la persona (fechanacimiento) y la fecha actual (LocalDate.now()).
    //.getYears(): Obtiene solo la cantidad de años completos de ese período.
    public int getFechanacimiento(){
        return Period.between(fechanacimiento, LocalDate.now()).getYears();
    }




}
