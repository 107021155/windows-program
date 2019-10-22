import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainframe extends JFrame{
    private Container cp;
    private JPanel jpnl=new JPanel(new GridLayout(2,1,3,3));
    private JPanel jpnc=new JPanel(new GridLayout(2,1,3,3));
    private JPanel jpns=new JPanel(new GridLayout(1,3,3,3));
    private JLabel jlb1=new JLabel("ID");
    private JLabel jlb2=new JLabel("PASSWORD");
    private JTextField lg=new JTextField();
    private JPasswordField pas= new JPasswordField();
    private JButton jbtk=new JButton("Keyboard");
    private JButton jbts=new JButton("LOGIN");
    private JButton jbte=new JButton("Exit");


    public mainframe(){
        init();
    }
    private void init(){
        cp=this.getContentPane();
        cp.setLayout(new BorderLayout(3,3));
        this.setSize(300,150);
        this.setLocation(100,100);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        cp.add(jpnl, BorderLayout.WEST);
        cp.add(jpnc, BorderLayout.CENTER);
        cp.add(jpns, BorderLayout.SOUTH);

        lg.setFont (new Font(null, Font.PLAIN, 20));
        pas.setFont (new Font(null, Font.PLAIN, 20));
        
        jlb1.setHorizontalAlignment(JLabel.RIGHT);
        jlb2.setHorizontalAlignment(JLabel.RIGHT);

        jpnl.add(jlb1);
        jpnl.add(jlb2);
        
        jpnc.add(lg);
        jpnc.add(pas);
        
        jpns.add(jbtk);
        jpns.add(jbts);
        jpns.add(jbte);
        
        jbte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        jbtk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RandomKeyboard rk = new RandomKeyboard(mainframe.this);
                rk.setVisible(true);
            }
        });

        jbts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ps= new String(pas.getPassword());
                System.out.println();
                if(lg.getText().equals("h304")&&ps.equals("23323456")){
                    JOptionPane.showMessageDialog(null,"SUCEED");
                    appframe cl=new appframe();
                    cl.setVisible(true);
                    mainframe.this.setVisible(false);
                    mainframe.this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null,"ERROR");
                }
            }
        });
    }
    public void setPwData(String pwStr){
        pas.setText(pwStr);
    }
}