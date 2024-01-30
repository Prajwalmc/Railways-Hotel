
package railways.hotel;

import java.awt.*;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.*;
import net.proteanit.sql.DbUtils;

public class CustomerInfo extends JFrame implements ActionListener{
    JTable table;
    JButton back;
    
    CustomerInfo(){
        
        setLayout(null);
        setBounds(300, 200, 1000, 600);
        getContentPane().setBackground(Color.WHITE);
        
        
                
                JLabel l1 = new JLabel("Document Type");
		l1.setBounds(10, 10,100,20);
		add(l1);
		
		JLabel l2 = new JLabel("Number");
		l2.setBounds(160,10,100,20);
		add(l2);
		
		JLabel l3 = new JLabel("Name");
		l3.setBounds(290, 10,100,20);
		add(l3);
		
		JLabel l4 = new JLabel("Gender");
		l4.setBounds(410, 10,100,20);
		add(l4);
		
		JLabel l5 = new JLabel("Country");
		l5.setBounds(540, 10,100,20);
		add(l5);
                
                JLabel l6 = new JLabel("RoomNo");
		l6.setBounds(640, 10,100,20);
		add(l6);
                
                JLabel l7 = new JLabel("Checkin Time");
		l7.setBounds(760,10,100,20);
		add(l7);
                
                JLabel l8 = new JLabel("Deposit");
		l8.setBounds(900, 10,100,20);
		add(l8);
                
                table = new JTable();
		table.setBounds(0, 40, 1000, 400);
		add(table);
                try{
                                    Conn c = new Conn();
					//String displayCustomersql = "select * from Room";
					//PreparedStatement pst = conn.prepareStatement(displayCustomersql);
					ResultSet rs = c.s.executeQuery("select * from customer");
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					
				}
				catch(Exception e1){
					e1.printStackTrace();
				}
                
                back = new JButton("Back");
		/*btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Reception().setVisible(true);
                                setVisible(false);
			}
		});*/
		back.setBounds(420, 490, 120, 30);
                back.setBackground(Color.BLACK);
                back.setForeground(Color.WHITE);
                back.addActionListener(this);
		add(back);

                setVisible(true);
            }
    public void actionPerformed(ActionEvent ae){
            
            setVisible(false);
            new Reception();
  
        }
    
    
    
    public static void main(String[] args){
        new CustomerInfo();
    }
    
}