import java.awt.*;
import javax.swing.*;

public class JuegoMinas extends JFrame {
    int numFilas = 10;
    int numColumns = 10;
    int numMinas = 10;
    
    JButton[][] tablaBotones;

    public JuegoMinas(String title) {
        super(title);
        setSize(400, 400);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        add(panel, BorderLayout.NORTH);
        panel.add(new JLabel("Jugador: "), BorderLayout.WEST);
        panel.add(new JTextField(10), BorderLayout.CENTER);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        panel.add(panel1, BorderLayout.SOUTH);
        panel1.add(new JLabel("Numero de minas: "), BorderLayout.WEST);
        panel1.add(new JTextField(10), BorderLayout.CENTER);
        panel1.add(new JButton("Generar"), BorderLayout.EAST);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(numFilas, numColumns));
        add(panel2, BorderLayout.CENTER);
        tablaBotones = new JButton[numFilas][numColumns];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablaBotones[i][j] = new JButton();
                panel2.add(tablaBotones[i][j]);
            }
        }

        JPanel panel3 = new JPanel();
        panel3.setLayout(new BorderLayout());
        add(panel3, BorderLayout.SOUTH);
        panel3.add(new JLabel("Score: "), BorderLayout.WEST);
        panel3.add(new JTextField(10), BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        JuegoMinas juegoMinas = new JuegoMinas("BuscaMinas");
    }
}