public class Curso {
    private String nombre;
    private String credito;
    private String id;
    public String getNombre() {
        return nombre;
    }
    public String getCredito() {
        return credito;
    }
    public String getId() {
        return id;
    }
    public Curso(String nombre, String credito, String id) {
        this.nombre = nombre;
        this.credito = credito;
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCredito(String credito) {
        this.credito = credito;
    }
    public void setId(String id) {
        this.id = id;
    }
}