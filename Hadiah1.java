package hadiah1;

import javax.swing.*;
import java.awt.event.*;
public class Hadiah1 implements ActionListener{
    /**
     * @param args the command line arguments
     */
    private static void createAndShowGUI(){
        //make frame
        JFrame frame = new JFrame ("I am a JFrame"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20,30,300,100);
        frame.getContentPane().setLayout(null);
        //make a button
        JButton butt=new JButton("Click me");
        frame.getContentPane().add(butt);
        butt.setBounds(20, 20, 200,20);
        
        //instantiate an appliation object
        Hadiah1 app = new Hadiah1();
        //make the label
        app.label = new JLabel ("3 clicks");
        app.label.setBounds (20, 40, 200, 20);
        frame.getContentPane().add(app.label);
        
        butt.addActionListener(app);
        frame.setVisible(true);
    }
    
public void actionPerformed(ActionEvent e)
{
    //ini akan dieksekusi ketika button diklik
    clickCount--;
    label.setText("Clicks = "+clickCount);
}

    public static void main(String[] args) {
        //mulai Swing GUI
        SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            createAndShowGUI();
        }
        });
}

int clickCount=3;
    JLabel label;
}
    