import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class appframe extends JFrame{
    private Container cp;
    private JMenuBar mb = new JMenuBar();
    private JMenu demo=new JMenu("FUNTION");
    private JMenu tool=new JMenu("TOOL");
    private JMenu game=new JMenu("GAME");
    private JMenu help=new JMenu("HELP");
    private JMenuItem m2=new JMenuItem("exit");
    private JMenuItem m1=new JMenuItem("logout");
    private JMenuItem tool1=new JMenuItem("calculator");
    private JMenuItem tool2=new JMenuItem("encryptor");
    
    private EncryptorFrame jintFrame = new EncryptorFrame();
    private JDesktopPane desktop = new JDesktopPane();


    public appframe(){
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100,100,1000,700);
        this.setTitle("My application");
        this.setJMenuBar(mb);
        this.add(desktop);

        desktop.add(jintFrame);
        

        mb.add(demo);
        mb.add(tool);
        mb.add(game);
        mb.add(help);
        demo.add(m1);
        demo.add(m2);
        tool.add(tool1);
        tool.add(tool2);
    
        m1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                mainframe cl=new mainframe();
                cl.setVisible(true);
                appframe.this.setVisible(false);
                appframe.this.dispose();
            }
        });
        m2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        tool1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cal cl=new cal();
                    cl.setVisible(true);
            }
        });
        tool2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               jintFrame.setVisible(true);
            }
        });
    }
}
