import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class RandomKeyboard extends JFrame{
    private Container cp;
    private JPasswordField jpf = new JPasswordField();
    private JButton jbtns[]=new JButton[12]; 
    private JPanel jpn = new JPanel(new GridLayout(3, 4, 2, 2));
    private mainframe login;

    public RandomKeyboard(mainframe loginFrm){
        login = loginFrm;
          init();
    } 
    private void init(){
        int data[] = new int[10];
        boolean flag = false;
        Random rnd = new Random();
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(3, 3)); 
        this.setBounds(100, 100, 400, 300);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        int j=0;
        while (j<10) {
            data[j] = rnd.nextInt(10);
            flag = true;
            int k=0;
            while(k<j && flag == true){
                if (data[k] == data[j]) {
                    flag = false;
                }
                k++;
            }
            if(flag){
                j++;
            }
        }
        for (int i=0;i<10;i++){
            jbtns[i] = new JButton(Integer.toString(data[i]));
            jpn.add(jbtns[i]);
            jbtns[i].addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    JButton btn = (JButton) ae.getSource();
                    String ps= new String(jpf.getPassword());
                    jpf.setText(ps + btn.getText());   
                }
            });
        }
        jbtns[10] = new JButton("submit");
        jbtns[11] = new JButton("Cancel");
        jpn.add(jbtns[10]);
        jpn.add(jbtns[11]);
        cp.add(jpf, BorderLayout.NORTH);
        cp.add(jpn, BorderLayout.CENTER);

        jbtns[10].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                login.setPwData (new String(jpf.getPassword()));
                RandomKeyboard.this.dispose();
            }
        });
    }
}