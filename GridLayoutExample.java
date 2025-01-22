import javax.swing.*;
import java.awt.*;
public class GridLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Example");
        frame.setLayout(new GridLayout(3, 3));
        for (int i = 1; i <= 6; i++) {
            frame.add(new JButton("Button " + i));
        }
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
