
public class Materia {
    private String nombreMateria;
    private int creditos;
    
    public Materia(String nombreMateria,int creditos)
    {
        this.nombreMateria=nombreMateria;
        this.creditos=creditos;
    }
    public String getNombreMateria()
    {
        return nombreMateria;
    }
    public int getCreditos(){
        return creditos;
    }
}
