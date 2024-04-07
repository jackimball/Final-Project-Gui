import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class MainFrame {

    public static void main(String[] args) {
        // title for new frame
        JFrame frame = new JFrame("Group name");

        // set layout
        frame.setLayout(new FlowLayout());

        // adds buttons and assigns names
        JButton button1 = new JButton("Grant");
        JButton button2 = new JButton("Bryan");
        JButton button3 = new JButton("Jacob");
        JButton button4 = new JButton("Ali");
        JButton button5 = new JButton("Kenton");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);

        // properties of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
