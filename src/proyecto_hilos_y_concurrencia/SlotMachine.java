package proyecto_hilos_y_concurrencia;

import java.util.Random;

/**
 * Clase SlotMachine que representa la lógica del juego.
 * Contiene los métodos para generar el resultado del giro de los rodillos y determinar si el jugador ha ganado.
 */
public class SlotMachine {

    // Lista de símbolos disponibles en los rodillos.
    private final String[] symbols = {"🍒", "🍋", "🔔", "⭐", "7"};
    private final Random random = new Random(); // Generador de números aleatorios.

    /**
     * Realiza el giro de los rodillos.
     * @return Un arreglo con los símbolos seleccionados aleatoriamente para cada rodillo.
     */
    public String[] spin() {
        return new String[]{
            symbols[random.nextInt(symbols.length)],
            symbols[random.nextInt(symbols.length)],
            symbols[random.nextInt(symbols.length)]
        };
    }

    /**
     * Verifica si los tres rodillos muestran el mismo símbolo.
     * @param result El resultado del giro de los rodillos.
     * @return true si los tres rodillos muestran el mismo símbolo, false si no.
     */
    public boolean isWinner(String[] result) {
        return result[0].equals(result[1]) && result[1].equals(result[2]);
    }
}
