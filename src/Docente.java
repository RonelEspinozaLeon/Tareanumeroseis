public class Docente {
    private int id;
    private String nombres;
    private String apellidos;
    private String carrera;
    public int getId() {
        return id;
    }
    public String getNombres() {
        return nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getCarrera() {
        return carrera;
    }
    public Docente(int id, String nombres, String apellidos, String carrera) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.carrera = carrera;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
