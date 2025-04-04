package proyecto_hilos_y_concurrencia;

import javax.swing.*;
import java.awt.*;

/**
 * Clase SlotMachineView que representa la interfaz gráfica del juego.
 * Se encarga de mostrar los rodillos y los botones, y de actualizar la interfaz según el resultado del juego.
 */
public class SlotMachineView extends JFrame {

    private final JLabel[] reels = new JLabel[3]; // Rodillos.
    private final JButton spinButton = new JButton("Spin"); // Botón para girar.
    private final JLabel resultLabel = new JLabel("", SwingConstants.CENTER); // Etiqueta de resultado.

    /**
     * Constructor que inicializa la ventana y los componentes gráficos.
     */
    public SlotMachineView() {
        setTitle("Tragamonedas"); // Título de la ventana.
        setSize(400, 300); // Tamaño de la ventana.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra la ventana cuando se presiona la X.
        setLayout(new BorderLayout()); // Establece el layout de la ventana.

        JPanel reelPanel = new JPanel(); // Panel para los rodillos.
        reelPanel.setLayout(new GridLayout(1, 3)); // Disposición en 3 columnas (uno para cada rodillo).
        for (int i = 0; i < reels.length; i++) {
            reels[i] = new JLabel("?", SwingConstants.CENTER); // Inicializa cada rodillo con un "?".
            reels[i].setFont(new Font("Serif", Font.BOLD, 50)); // Estilo de fuente para los rodillos.
            reels[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); // Borde de los rodillos.
            reels[i].setBackground(Color.RED); // Fondo rojo de los rodillos.
            reels[i].setOpaque(true); // Hace que el fondo sea visible.
            reelPanel.add(reels[i]); // Agrega cada rodillo al panel.
        }

        add(reelPanel, BorderLayout.CENTER); // Agrega el panel de los rodillos al centro de la ventana.
        add(spinButton, BorderLayout.SOUTH); // Agrega el botón de "Spin" al sur (abajo).
        add(resultLabel, BorderLayout.NORTH); // Agrega la etiqueta de resultado al norte (arriba).

        // Estiliza el botón de "Spin".
        spinButton.setBackground(Color.GREEN);
        spinButton.setForeground(Color.WHITE);
        spinButton.setFont(new Font("Arial", Font.BOLD, 16));
    }

    /**
     * Actualiza los rodillos con los valores proporcionados.
     * @param values Un arreglo de símbolos para mostrar en los rodillos.
     */
    public void setReels(String[] values) {
        for (int i = 0; i < reels.length; i++) {
            reels[i].setText("<html><font color='gold'>" + values[i] + "</font></html>"); // Los símbolos en dorado.
        }
    }

    /**
     * Establece el texto de la etiqueta de resultado.
     * @param text El texto que se mostrará en la etiqueta.
     */
    public void setResultText(String text) {
        resultLabel.setText(text);
        resultLabel.setFont(new Font("Serif", Font.BOLD, 20)); // Estilo del texto de resultado.
    }

    /**
     * Obtiene el botón de "Spin".
     * @return El botón de "Spin".
     */
    public JButton getSpinButton() {
        return spinButton;
    }
}
