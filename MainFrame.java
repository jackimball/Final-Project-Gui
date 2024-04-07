import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class MainFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Group name");
        frame.setLayout(new FlowLayout());

        // creating each member's class
        frame.add(new GrantClass());
        frame.add(new BryanClass());
        frame.add(new JacobClass());
        frame.add(new AliClass());
        frame.add(new KentonClass());

        // setting up the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

// each member's individual class
class GrantClass extends JPanel {
    public GrantClass() {
        add(new JButton("Grant"));
    }
}

class BryanClass extends JPanel {
    public BryanClass() {
        add(new JButton("Bryan"));
    }
}

class JacobClass extends JPanel {
    public JacobClass() {
        add(new JButton("Jacob"));
    }
}

class AliClass extends JPanel {
    public AliClass() {
        add(new JButton("Ali"));
    }
}

class KentonClass extends JPanel {
    public KentonClass() {
        add(new JButton("Kenton"));
    }
}
