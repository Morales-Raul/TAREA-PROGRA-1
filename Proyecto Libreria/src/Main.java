import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new Libro("Libro 1","Autor 1","Editorial 1",2024,100);
        Libro libro2 = new Libro("Libro 2","Autor 2","Editorial 2",2024,100);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);


        GestionUsuarios gestionUsuarios = new GestionUsuarios();
        Usuario usuario1 = new Usuario("Usuario 1", "Apellido 1", "usuario1@gmail.com", "4321");
        Usuario usuario2 = new Usuario("Usuario 2", "Apellido 2", "usuario2@gmail.com", "1234");
        gestionUsuarios.registrarUsuario(usuario1);
        gestionUsuarios.registrarUsuario(usuario2);


        GestionPrestamos gestionPrestamos = new GestionPrestamos();
        Prestamo prestamo1 = new Prestamo(libro1, usuario1, LocalDate.now(), LocalDate.now().plusDays(14));
        Prestamo prestamo2 = new Prestamo(libro2, usuario2, LocalDate.now(), LocalDate.now().plusDays(14));
        gestionPrestamos.realizarPrestamo(prestamo1);
        gestionPrestamos.realizarPrestamo(prestamo2);


        System.out.println("Libros en la biblioteca:");
        for (Libro libro : biblioteca.listarLibros()) {
            System.out.println(libro);
        }

        System.out.println("\nUsuarios registrados:");
        for (Usuario usuario : gestionUsuarios.usuarios.values()) {
            System.out.println(usuario);
        }

        System.out.println("\nPréstamos activos:");
        for (Prestamo prestamo : gestionPrestamos.consultarPrestamosActivos()) {
            System.out.println(prestamo);
        }


        gestionPrestamos.devolverPrestamo(prestamo1);
        System.out.println("\nPréstamos activos después de la devolución:");
        for (Prestamo prestamo : gestionPrestamos.consultarPrestamosActivos()) {
            System.out.println(prestamo);
        }
    }
}

