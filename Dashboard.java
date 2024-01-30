
package railways.hotel;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Dashboard extends JFrame implements ActionListener{

    JMenuItem addemployee,addrooms;
    
    public Dashboard() {
   
        //super("Railways Hotel");
	setBounds(0,0,1550,1000);
        //setForeground(Color.CYAN);
        setLayout(null); 

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	JLabel image = new JLabel(i3);
	image.setBounds(0, 0, 1550, 1000); 
        add(image);
        
        JLabel text  = new JLabel("RAILWAYS HOTEL WELCOMES YOU");
        text.setBounds(400, 80, 1000, 60);
	text.setForeground(Color.WHITE);
        text.setFont(new Font("Tahoma", Font.PLAIN, 46));
        image.add(text);
		
		
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0, 0, 1550, 30);
        mb.setForeground(Color.WHITE);
	image.add(mb);
	
        JMenu hotel = new JMenu("HOTEL MANAGEMENT");
        hotel.setForeground(Color.RED);
	mb.add(hotel);
		
        JMenuItem reception = new JMenuItem("RECEPTION");
        reception.addActionListener(this);
	hotel.add(reception);
        
        JMenu admin = new JMenu("ADMIN");
        admin.setForeground(Color.BLUE);
	mb.add(admin);
        
        addemployee = new JMenuItem("ADD EMPLOYEE");
        addemployee.addActionListener(this);
	admin.add(addemployee);
        
        addrooms = new JMenuItem("ADD ROOMS");
        addrooms.addActionListener(this);
	admin.add(addrooms);
        
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    
    }    
        //AddEmployee.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if(ae.getActionCommand().equals("ADD EMPLOYEE")){
                    new AddEmployee();
                }else if(ae.getActionCommand().equals("ADD ROOMS")){
                    new AddRooms();
                }else if(ae.getActionCommand().equals("RECEPTION")){
                    new Reception();                    
                }
                /*try{
                    setVisible(false);
                    new AddEmployee();
                }catch(Exception e ){
                    e.printStackTrace();
                }*/
            }
	//});
        

        
        
       //AddRooms.addActionListener(new ActionListener(){
        //    public void actionPerformed(ActionEvent ae){
        //        try{
        //            new AddRooms();
        //            setVisible(false);
        //        }catch(Exception e ){}
        //    }
	//});
       		
        
	
    
    
        public static void main(String[] args) {
            new Dashboard();
        }
}

