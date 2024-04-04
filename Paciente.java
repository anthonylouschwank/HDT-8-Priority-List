
public class Paciente  {
    private String nombre;
    private String sintoma;
    
    public Paciente(String nombre, String sintoma) {
        this.nombre = nombre;
        this.sintoma = sintoma;
        
    }

    public String getNombre() {
        return nombre;
    }

    
    public String getSintoma() {
        return sintoma;
    }

}
