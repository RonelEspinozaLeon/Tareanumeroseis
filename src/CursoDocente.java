public class CursoDocente {
    private int id;
    private Docente docente[];
    private Curso curso[];
    int indiceEliminar = -1;
    private int indiceCurso;
    private int indiceDocente;
    public CursoDocente(int sizeCurso,int sizeDocente) {
        this.curso = new Curso[sizeCurso];
        this.indiceCurso = 0;
        this.docente=new Docente[sizeDocente];
        this.indiceDocente =0;
    }
    public void agregarCurso(Curso curso) {
        this.curso[this.indiceCurso] = curso;
        this.indiceCurso++;
    }
    public void agregarDocente(Docente docente) {
        this.docente[this.indiceDocente] = docente;
        this.indiceDocente++;
    }
    public void listarCurso() {
        for (int j = 0; j < this.indiceCurso; j++) {
            System.out.println(this.curso[j].getId() + " " + this.curso[j].getNombre()+""+this.curso[j].getCredito());
        }
    }
    public void listarDocente() {
        for (int i = 0; i < this.indiceDocente; i++) {
            System.out.println(this.docente[i].getId() + " " + this.docente[i].getNombres()+""+this.docente[i].getApellidos()
                    +""+this.docente[i].getCarrera());
        }
    }
    public void buscarCurso(String idCurso)
    {
        for (int j = 0; j < this.indiceCurso; j++) {
            if (this.curso[j].getId() == idCurso) {
                System.out.println("Curso encontrado:");
                System.out.println("ID: " + this.curso[j].getId());
                System.out.println("Nombre: " + this.curso[j].getNombre());
                System.out.println("Crédito: " + this.curso[j].getCredito());
                return; // Termina la búsqueda si se encuentra el curso
            }
        }
        System.out.println("Curso no encontrado.");
    }
    public void buscarDocente(String nombresDocente)
    {
        for (int j = 0; j < this.indiceDocente; j++) {
            if (this.docente[j].getNombres() == nombresDocente) {
                System.out.println("Docente encontrado:");
                System.out.println("ID: " + this.docente[j].getId());
                System.out.println("NOMBRES: " + this.docente[j].getNombres());
                System.out.println("APELLIDOS: " + this.docente[j].getApellidos());
                System.out.println("CARRERA: " + this.docente[j].getCarrera());
                return; // Termina la búsqueda si se encuentra el curso
            }
        }
        System.out.println("Curso no encontrado.");
    }
    public void editarCurso(String nuevoid, String nuevoNombre, String nuevoCredito) {
        for (int l = 0; l < this.indiceCurso; l++) {
            if (this.curso[l].getId() == nuevoid) {
                this.curso[l].setNombre(nuevoNombre);
                this.curso[l].setCredito(nuevoCredito);
                System.out.println("Curso editado exitosamente.");
                // Mostrar el curso editado
                System.out.println("CURSO EDITADO :");
                System.out.println("ID: " + this.curso[l].getId());
                System.out.println("Nombre: " + this.curso[l].getNombre());
                System.out.println("Crédito: " + this.curso[l].getCredito());
                // Imprimir los cursos después de la edición
                System.out.println("LISTAR TODOS LOS CURSOS  :");
                for (int j = 0; j < this.indiceCurso; j++) {
                    System.out.println(this.curso[j].getId() + " " + this.curso[j].getNombre() + " " + this.curso[j].getCredito());
                }
                return; // Termina la búsqueda y edición si se encuentra el curso

            }
        }
        System.out.println("Curso no encontrado.");
    }
    public void editarDocente(int nuevoid, String nuevoNombres, String nuevoApellidos,String nuevaCarrera) {
        for (int j = 0; j < this.indiceDocente; j++) {
            if (this.docente[j].getNombres() == nuevoNombres) {
                this.docente[j].setId(nuevoid);
                this.docente[j].setApellidos(nuevoApellidos);
                this.docente[j].setCarrera(nuevaCarrera);
                System.out.println("Docente editado exitosamente.");
                // Mostrar el docente editado
                System.out.println("DOCENTE EDITADO :");
                System.out.println("ID: " + this.docente[j].getId());
                System.out.println("Nombres: " + this.docente[j].getNombres());
                System.out.println("Apellidos: " + this.docente[j].getApellidos());
                System.out.println("Carrera: " + this.docente[j].getCarrera());
                // Imprimir los Docente después de la edición
                System.out.println("LISTAR TODOS LOS DOCENTES  :");
                for (int i = 0; i < this.indiceDocente; i++) {
                    System.out.println(this.docente[i].getId() + " " + this.docente[i].getNombres()+""+this.docente[i].getApellidos()
                            +""+this.docente[i].getCarrera());
                }
                return; // Termina la búsqueda y edición si se encuentra el docente*/

            }
        }
        System.out.println("Docente no encontrado.");
    }
    public void eliminarCurso(String idcurso) {
        for (int i = 0; i < this.indiceCurso; i++) {
            if (this.curso[i].getId() == idcurso) {
                indiceEliminar = i;
                break; // Se encontró el curso, se sale del bucle
            }
        }
        if (indiceEliminar != -1) {
            for (int k = indiceEliminar; k < this.indiceCurso - 1; k++) {
                this.curso[k] = this.curso[k + 1];
            }
            System.out.println("Curso eliminado exitosamente.");
            this.indiceCurso--;
            for (int j = 0; j < this.indiceCurso; j++) {
                System.out.println(this.curso[j].getId() + " " + this.curso[j].getNombre()+""+this.curso[j].getCredito());
            }

        } else {
            System.out.println("Curso no encontrado.");
        }
    }
    public void eliminarDocente(String nombreDocente) {
        for (int i = 0; i < this.indiceDocente; i++) {
            if (this.docente[i].getNombres() == nombreDocente) {
                indiceEliminar = i;
                break; // Se encontró el curso, se sale del bucle
            }
        }
        if (indiceEliminar != -1) {
            for (int k = indiceEliminar; k < this.indiceDocente - 1; k++) {
                this.docente[k] = this.docente[k + 1];
            }
            System.out.println("Docente eliminado exitosamente.");

            this.indiceDocente--;
            for (int i = 0; i < this.indiceDocente; i++) {
                System.out.println(this.docente[i].getId() + " " + this.docente[i].getNombres()+""+this.docente[i].getApellidos()
                        +""+this.docente[i].getCarrera());
            }

        } else {
            System.out.println("Docente no encontrado.");
        }
    }
}