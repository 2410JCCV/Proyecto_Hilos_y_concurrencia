/**
 * @author Carrillo Viveros Juan Carlos-217o002237
           Luna Zamora Marlleli-217o00552
 * @version 1.0
 */
package proyecto_hilos_y_concurrencia;

import javax.swing.SwingUtilities;

/**
 * Clase SlotMachineApp que inicia la aplicación del juego de tragamonedas.
 * Crea el modelo, la vista y el controlador, y luego muestra la ventana.
 */
public class SlotMachineApp {

    /**
     * Método principal que inicializa la aplicación.
     * @param args Argumentos de línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        // Ejecuta la aplicación en el hilo de la interfaz gráfica.
        SwingUtilities.invokeLater(() -> {
            SlotMachine model = new SlotMachine(); // Crea el modelo del juego.
            SlotMachineView view = new SlotMachineView(); // Crea la vista del juego.
            new SlotMachineController(model, view); // Crea el controlador.
            view.setVisible(true); // Muestra la ventana de la vista.
        });
    }
}

