import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mainframe extends JFrame{
    private JButton btn0 = new JButton("0");
    private JButton btn1 = new JButton("1");
    private JButton btn2 = new JButton("2");
    private JButton btn3 = new JButton("3");
    private JButton btn4 = new JButton("4");
    private JButton btn5 = new JButton("5");
    private JButton btn6 = new JButton("6");
    private JButton btn7 = new JButton("7");
    private JButton btn8 = new JButton("8");
    private JButton btn9 = new JButton("9");
    private JButton btnadd = new JButton("+");
    private JButton btnsub = new JButton("-");
    private JButton btnm = new JButton("*");
    private JButton btndiv = new JButton("/");
    private JButton btneq = new JButton("=");
    private JButton btndot = new JButton(".");
    private JLabel lab = new JLabel("0");
    private JPanel pnl = new JPanel(new GridLayout(4,4,3,3));
    private Container cp;
    
    public mainframe(){
        init();
    }

    private void init(){
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(3,3));
        this.setBounds(0,0,300,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        lab.setHorizontalAlignment(JLabel.RIGHT);

        cp.add(lab, BorderLayout.NORTH);
        cp.add(pnl, BorderLayout.CENTER);  

        pnl.add(btn7);
        pnl.add(btn8);
        pnl.add(btn9);
        pnl.add(btnadd);

        pnl.add(btn4);
        pnl.add(btn5);
        pnl.add(btn6);
        pnl.add(btnsub);

        pnl.add(btn1);
        pnl.add(btn2);
        pnl.add(btn3);
        pnl.add(btnm);

        pnl.add(btn0);
        pnl.add(btndot);
        pnl.add(btneq);
        pnl.add(btndiv);

        btn0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
             JButton btn = (JButton)ae.getSource();
             lab.setText(lab.getText() + btn.getText());
                }
        });
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
             JButton btn = (JButton)ae.getSource();
             lab.setText(lab.getText() + btn.getText());
                }
        });
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
             JButton btn = (JButton)ae.getSource();
             lab.setText(lab.getText() + btn.getText());
                }
        });
        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
             JButton btn = (JButton)ae.getSource();
             lab.setText(lab.getText() + btn.getText());
                }
        });
        btn4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
             JButton btn = (JButton)ae.getSource();
             lab.setText(lab.getText() + btn.getText());
                }
        });
        btn5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
             JButton btn = (JButton)ae.getSource();
             lab.setText(lab.getText() + btn.getText());
                }
        });
        btn6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
             JButton btn = (JButton)ae.getSource();
             lab.setText(lab.getText() + btn.getText());
                }
        });
        btn7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
             JButton btn = (JButton)ae.getSource();
             lab.setText(lab.getText() + btn.getText());
                }
        });
        btn8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
             JButton btn = (JButton)ae.getSource();
             lab.setText(lab.getText() + btn.getText());
                }
        });
        btn9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
             JButton btn = (JButton)ae.getSource();
             lab.setText(lab.getText() + btn.getText());
                }
        });
    }
    
}
