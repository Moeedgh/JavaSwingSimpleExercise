import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickCounterApp extends JFrame implements ActionListener {
    private JLabel counterLabel;    // Displays the click count
    private JButton clickButton;    // Button to register clicks
    private int count = 0;
    public ClickCounterApp() {
        setTitle("Click Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        counterLabel = new JLabel("Clicks: 0", SwingConstants.CENTER);
        clickButton = new JButton("Click Me");
        clickButton.addActionListener(this);

        setLayout(new BorderLayout());
        add(counterLabel, BorderLayout.CENTER);
        add(clickButton, BorderLayout.SOUTH);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        count++;  // Increment the click counter
        counterLabel.setText("Clicks: " + count);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ClickCounterApp().setVisible(true));
    }
}
