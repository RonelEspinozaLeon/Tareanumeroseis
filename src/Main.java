public class Main {
    public static void main(String args[]) {
        System.out.println("DATOS:");
        CursoDocente cursoDocente = new CursoDocente(3,3);
        System.out.println("CURSOS(ID,NOMBRE,CREDITOS):");
        cursoDocente.agregarCurso(new Curso("Programacion orientada a objetos-->","12","1-->"));
        cursoDocente.agregarCurso(new Curso("Base de Datos-->","7","2-->"));
        cursoDocente.agregarCurso(new Curso("Estructura de datos-->","9","3-->"));
        cursoDocente.listarCurso();
        System.out.println("DOCENTES(ID,NOMBRES,APELLIDOS,CARRERA):");
        cursoDocente.agregarDocente(new Docente(1,"Freedy-->","Vigilio-->","profesor"));
        cursoDocente.agregarDocente(new Docente(2,"Ethel-->","vazques-->","Ingeniero"));
        cursoDocente.agregarDocente(new Docente(3,"Jose-->","Nuñez-->","Contador"));
        cursoDocente.listarDocente();
        System.out.println("BUSCAR DATOS:");
        System.out.println("BUSCAR POR ID DEL CURSO(1-->):");
        String idBuscado = "1-->"; // ID del curso a buscar
        cursoDocente.buscarCurso(idBuscado);
        System.out.println("BUSCAR POR NOMBRE DEL DOCENTE(Freedy-->):");
        String nombresBuscado = "Freedy-->"; // Nombre del docente a buscar
        cursoDocente.buscarDocente(nombresBuscado);
        System.out.println("EDITAR:");
        System.out.println("EDITAR CURSO");
        System.out.println("ID USADO PARA EDITAR (1-->)");
        String nuevoId = "1-->";
        String nuevoNombre = "Gestion de procesos-->";
        String nuevoCredito = "8";
        cursoDocente.editarCurso(nuevoId, nuevoNombre, nuevoCredito);
        System.out.println("EDITAR DOCENTE");
        System.out.println("NOMBRE USADO PARA EDITAR (Freedy-->)");
        String nuevoNombres = "Freedy-->";
        int nuevoid = 1;
        String nuevoApellidos = "Gutierrez-->";
        String nuevaCarrera = "Arquitecto";
        cursoDocente.editarDocente(nuevoid, nuevoNombres, nuevoApellidos,nuevaCarrera);
        System.out.println("ELIMINAR");
        System.out.println("ELIMINAR CURSO:");
        System.out.println("ID USADO PARA ELIMINAR CURSO (1-->)");
        String idEliminar = "1-->"; // ID del curso a eliminar
        cursoDocente.eliminarCurso(idEliminar);
        System.out.println("ELIMINAR DOCENTE:");
        System.out.println("NOMBRE DE DOCENTE USADO PARA ELIMINAR DOCENTE (Freedy-->)");
        String nombreEliminar = "1-->"; // nombre del docente a eliminar
        cursoDocente.eliminarDocente(nombreEliminar);
    }
}
