import javax.swing.*;
import java.awt.*;
public class FlowLayoutExample {
    public static void main(String[]args) {
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setLayout(new FlowLayout());
        frame.add(new JButton("Button1"));
        frame.add(new JButton("Button2"));
        frame.add(new JButton("Button3"));
        frame.add(new JButton("Button4"));
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
