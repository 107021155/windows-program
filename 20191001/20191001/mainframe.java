import javax.swing.*;
import java.awt.*;
import java.awt.event.*;   


public class mainframe extends JFrame{
    private JButton jbtns[] = new JButton[16];
    private JLabel lab = new JLabel("0");
    private JPanel pnl = new JPanel(new GridLayout(4,4,3,3));
    private Container cp;
    String str[]={
         "7", "8", "9", "+",
         "4", "5", "6", "-",
         "1", "2", "3", "*",
         "0", "=", ".", "/",
     };
     



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

        for (int i=0; i<16;i++) {
            jbtns[i] = new JButton(str[i]);
            pnl.add(jbtns[i]);
            jbtns[i].setFont(new Font(null, Font.PLAIN,24));
            jbtns.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                 JButton jbtns = (JButton)ae.getSource();
                 int vx = jbtn.getText().charAt(0) - '0';
                 if (vx >= 0 && vx <=9) {
                     float v1 = Float.parseFloat(lab.getText());
                     if(isOpclick){
                        lab.setText("");
                        isOpclick = false;             
                    }
                    if(v1 == 0.0f){
                        if(isDotClick){
                            lab.setText(lab.getText() + jbtn.getText());
                        }else{
                            lab.setText(jbtn.getText());
                        }
                    }else{
                       lab.setText(lab,getText() + jbtn.getText());
                    } 
                 }
            });  
        }
     }  
}
