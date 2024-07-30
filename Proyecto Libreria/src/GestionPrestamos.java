import java.util.LinkedList;
import java.util.Queue;

public class GestionPrestamos {
    private Queue<Prestamo>prestamos;

    public GestionPrestamos() {
        this.prestamos = new LinkedList<>();
    }

    public void realizarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public void devolverPrestamo(Prestamo prestamo) {
        prestamos.remove(prestamo);
    }

    public Queue<Prestamo> consultarPrestamosActivos() {
        return new LinkedList<>(prestamos);
    }
}

