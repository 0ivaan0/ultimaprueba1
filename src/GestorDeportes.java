import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona una lista de deportes.
 *
 * @author Ivan Perez
 * @version 1.0
 * @since 2024-04-02
 */
public class GestorDeportes {
    private List<Deporte> deportes;

    /**
     * Constructor de la clase GestorDeportes.
     */
    public GestorDeportes() {
        deportes = new ArrayList<>();
    }

    /**
     * Agrega un deporte a la lista de deportes.
     *
     * @param deporte El deporte a agregar.
     */
    public void agregarDeporte(Deporte deporte) {
        deportes.add(deporte);
    }

    /**
     * Obtiene la lista de deportes.
     *
     * @return La lista de deportes.
     */
    public List<Deporte> getDeportes() {
        return deportes;
    }
}
