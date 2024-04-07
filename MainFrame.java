import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class MainFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Group name");
        frame.setLayout(new FlowLayout());

        // creating each member's class
        frame.add(new Grant());
        frame.add(new Bryan());
        frame.add(new Jacob());
        frame.add(new Ali());
        frame.add(new Kenton());

        // setting up the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

// each member's individual class
class Grant extends JPanel {
    public Grant() {
        add(new JButton("Grant"));
    }
}

class Bryan extends JPanel {
    public Bryan() {
        add(new JButton("Bryan"));
    }
}

class Jacob extends JPanel {
    public Jacob() {
        add(new JButton("Jacob"));
    }
}

class Ali extends JPanel {
    public Ali() {
        add(new JButton("Ali"));
    }
}

class Kenton extends JPanel {
    public Kenton() {
        add(new JButton("Kenton"));
    }
}
