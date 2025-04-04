package proyecto_hilos_y_concurrencia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase SlotMachineController que maneja la interacción entre el modelo y la vista.
 * Escucha los eventos del botón "Spin" y ejecuta la animación del giro de los rodillos.
 */
public class SlotMachineController {

    private final SlotMachine model; // Modelo del juego.
    private final SlotMachineView view; // Vista del juego.

    /**
     * Constructor que inicializa el controlador con el modelo y la vista.
     * @param model El modelo del juego.
     * @param view La vista del juego.
     */
    public SlotMachineController(SlotMachine model, SlotMachineView view) {
        this.model = model;
        this.view = view;

        // Agrega un oyente de acción para el botón "Spin".
        view.getSpinButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Thread(() -> animateSpin()).start(); // Inicia un hilo para la animación del giro.
            }
        });
    }

    /**
     * Realiza la animación del giro de los rodillos.
     * Los rodillos muestran símbolos aleatorios antes de detenerse con el resultado final.
     */
    private void animateSpin() {
        String[] temp = {"🍒", "🍋", "🔔"}; // Símbolos para la animación.

        // Realiza el "giro" mostrando símbolos aleatorios.
        for (int i = 0; i < 20; i++) {
            String[] spinResult = new String[3];
            for (int j = 0; j < 3; j++) {
                spinResult[j] = temp[(int) (Math.random() * temp.length)];
            }
            view.setReels(spinResult); // Actualiza los rodillos.
            try {
                Thread.sleep(100); // Tiempo de espera para simular el giro.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Detiene los rodillos con un resultado final.
        String[] result = model.spin();
        view.setReels(result);

        // Muestra el mensaje de resultado.
        if (model.isWinner(result)) {
            view.setResultText("¡Ganaste!");
        } else {
            view.setResultText("Inténtalo de nuevo");
        }
    }
}
