
package railways.hotel;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RailwaysHotel extends JFrame implements ActionListener{

        //JLabel l1;
        //JButton b1;
        
        public RailwaysHotel() {
		
                setSize(1366,650);          // setContentPane(300,300,1366,390);   frame size
                setLayout(null);
                setLocation(100,100);

		//JLabel text = new JLabel("");
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/hotelicon.jpg"));
                Image i2 = i1.getImage().getScaledInstance(1366, 650,Image.SCALE_DEFAULT);
                ImageIcon i3 = new ImageIcon(i2);
                JLabel image = new JLabel(i3);
                image.setBounds(0, 0, 1366, 650);                
                add(image);
                
                JLabel text=new JLabel("Railways Hotel");
                text.setBounds(500,50,1000,90);
                text.setFont(new Font("serif",Font.PLAIN,70));
                text.setForeground(Color.WHITE);
                image.add(text);
                
                JButton next = new JButton("Next");
                next.setBounds(1150, 550, 150, 50);
                next.addActionListener(this);
                next.setBackground(Color.WHITE);
                next.setForeground(Color.WHITE);
                next.setFont(new Font("serif",Font.PLAIN,25));
                image.add(next);
		 
                setVisible(true);
                
                while(true){
                        text.setVisible(false); // lid =  j label
                    try{
                        Thread.sleep(500); //1000 = 1 second
                    }catch(Exception e){
                        e.printStackTrace();
                    } 
                        
                        text.setVisible(true);
                    try{
                        Thread.sleep(500);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
	}
        
        public void actionPerformed(ActionEvent ae){
                
                setVisible(false);
                new Login();
                
        }
        
        public static void main(String[] args) {
                new RailwaysHotel();			
	}
}    

