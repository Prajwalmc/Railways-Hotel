
package railways.hotel;

import java.awt.*;
import net.proteanit.sql.DbUtils;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.*;

public class Room extends JFrame implements ActionListener{
	//Connection conn = null;
	//private JPanel contentPane;
	JTable table;
        JLabel l2;
	JLabel l3;
	JLabel l4;
	JLabel l5;
	JButton back;
	JLabel l1;

	/**
	 * Launch the application.
	 */
	

        
	public Room() {
		
		setBounds(300,200,1050,600);
                getContentPane().setBackground(Color.WHITE);
		
		setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/eight.jpg"));
                Image i3 = i1.getImage().getScaledInstance(600, 600,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel image = new JLabel(i2);
                image.setBounds(500,0,600,600);
                add(image);
                
                l1 = new JLabel("Room Number");
		l1.setBounds(10,10,100,20);
		add(l1);
		
		l2 = new JLabel("Availability");
		l2.setBounds(120, 10,100,20);
		add(l2);
		
		l3 = new JLabel("Clean Status");
		l3.setBounds(230, 10,100,20);
		add(l3);
		
		l4 = new JLabel("Price");
		l4.setBounds(330, 10,100,20);
		add(l4);
		
		l5 = new JLabel("Bed Type");
		l5.setBounds(410, 10,100,20);
		add(l5);
                
                table = new JTable();
		table.setBounds(0, 40, 500, 400);
		add(table);
		
		//JButton btnLoadData = new JButton("Load Data");
		//btnLoadData.addActionListener(new ActionListener() {
			//public void actionPerformed(ActionEvent e) {
				try{
                                    Conn c = new Conn();
					//String displayCustomersql = "select * from Room";
					//PreparedStatement pst = conn.prepareStatement(displayCustomersql);
					ResultSet rs = c.s.executeQuery("select * from room");
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					
				}
				catch(Exception e1){
					e1.printStackTrace();
				}
			//}
		//});
		//btnLoadData.setBounds(100, 470, 120, 30);
                //btnLoadData.setBackground(Color.BLACK);
                //btnLoadData.setForeground(Color.WHITE);
		//contentPane.add(btnLoadData);
                
                back = new JButton("Back");
		/*btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Reception().setVisible(true);
                                setVisible(false);
			}
		});*/
		back.setBounds(200,500,120,30);
                back.setBackground(Color.BLACK);
                back.setForeground(Color.WHITE);
                back.addActionListener(this);
		add(back);

                setVisible(true);
        }
	
    
        public void actionPerformed(ActionEvent ae){
            
            setVisible(false);
            new Reception();
            /*EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reception frame = new Reception();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
            
            
        }
        
        public static void main(String[] args) {
            
            new Room();
		/*EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Room frame = new Room();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
                
	
        }
}

