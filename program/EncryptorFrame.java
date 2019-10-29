import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EncryptorFrame extends JInternalFrame {
    private Container cp;
    private JTextArea jta = new JTextArea();
    private JScrollPane jsp = new JScrollPane(jta);
    private JPanel jpnalN = new JPanel(new BorderLayout());
    private JLabel jlb = new JLabel("File");
    private JTextField jtf = new JTextField();
    private JButton jbtBrowse = new JButton("Browse");

    private JPanel jpnalE = new JPanel(new GridLayout(10,1,3,3));
    private JLabel jlb1 = new JLabel("key");
    private JTextField jtfKey = new JTextField("3");
    private JLabel jlb2 = new JLabel("Algorithm");
    private JComboBox<String> jcb = new JComboBox<String>();
    private ButtonGroup gp = new ButtonGroup();
    private JRadioButton jrb1 = new JRadioButton("Encrypt");
    private JRadioButton jrb2 = new JRadioButton("Decrypt");
    private JButton jbtStart = new JButton("Start");
    private JButton jbtClean = new JButton("Clean");
    private JButton jbtSave = new JButton("Save");
    private JButton jbtExit = new JButton("Exit");

    public EncryptorFrame(){
        init();
    }
    public void init() {
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout());
        this.setBounds(0,0,600,500);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        cp.add(jsp, BorderLayout.CENTER);
        cp.add(jpnalN, BorderLayout.NORTH);
        cp.add(jpnalE, BorderLayout.EAST);
        jpnalN.add(jlb, BorderLayout.WEST);
        jpnalN.add(jtf, BorderLayout.CENTER);
        jpnalN.add(jbtBrowse, BorderLayout.EAST);
        jcb.addItem("Caeser");
        jcb.addItem("XOR");
        jpnalE.add(jlb1);
        jpnalE.add(jtfKey);
        jpnalE.add(jlb2);
        jpnalE.add(jcb);
        jpnalE.add(jrb1);
        jpnalE.add(jrb2);
        jpnalE.add(jbtStart);
        jpnalE.add(jbtClean);
        jpnalE.add(jbtSave);
        jpnalE.add(jbtExit);
        gp.add(jrb1);
        gp.add(jrb2);
        jrb1.setSelected(true);

    }
}