import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormElements  extends JFrame {
    private JPanel mainPanel;
    private JTextField enterNameTextField;
    private JButton enterButton;
    private JLabel nameLabel;

    public FormElements(String title){
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
    }

    public static void main(String[] args) {
        JFrame frame = new FormElements("Item example");
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
