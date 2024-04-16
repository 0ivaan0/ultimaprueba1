/**
 * Clase principal que prueba la funcionalidad de las clases Deporte y GestorDeportes.
 */
public class Main {
    public static void main(String[] args) {
        // Crear algunos deportes
        Deporte futbol = new Deporte("Fútbol", 22);
        Deporte baloncesto = new Deporte("Baloncesto", 10);

        // Crear un gestor de deportes
        GestorDeportes gestor = new GestorDeportes();

        // Agregar los deportes al gestor
        gestor.agregarDeporte(futbol);
        gestor.agregarDeporte(baloncesto);

        // Imprimir la lista de deportes
        System.out.println("Lista de deportes:");
        for (Deporte deporte : gestor.getDeportes()) {
            System.out.println("Nombre: " + deporte.getNombre() + ", Jugadores: " + deporte.getCantidadJugadores());

            System.out.println("hoal");
        }
    }