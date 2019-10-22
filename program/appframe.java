import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class appframe extends JFrame{
    // private static JLabel lab=new JLabel();
    private JMenuBar mb = new JMenuBar();
    private JMenu demo=new JMenu("FUNTION");
    private JMenuItem m2=new JMenuItem("exit");
    private JMenuItem m3=new JMenuItem("logout");
    private JMenuItem m1=new JMenuItem("calcu");

    public appframe(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(0,0,960,540);
        this.setLocation(100,100);
        this.setJMenuBar(mb);
        mb.add(demo);
        demo.add(m1);
        demo.add(m2);
        demo.add(m3);
        m1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cal cl=new cal();
                    cl.setVisible(true);
            }
        });
        m2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        m3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                mainframe cl=new mainframe();
                cl.setVisible(true);
                appframe.this.setVisible(false);
                appframe.this.dispose();
            }
        });
    }
}
