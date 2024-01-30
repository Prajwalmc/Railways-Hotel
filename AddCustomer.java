
package railways.hotel;


import java.awt.*;

import java.util.Date;

import java.sql.*;	
import javax.swing.*;
import java.awt.event.*;
public class AddCustomer extends JFrame implements ActionListener{
	
	JTextField tfnumber,tfname,tfcountry,tfdeposit;
        JComboBox comboid;
        JLabel checkintime;
        JRadioButton rmale,rfemale;
        JButton add,back;
        Choice croom;

	

        AddCustomer() {
		
                setBounds(350,200,800,550);
		//contentPane = new JPanel();
		//setContentPane(contentPane);
		setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/fifth.png"));
                Image i3 = i1.getImage().getScaledInstance(300, 400,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(400,50,300,400);
                add(l1);
		
		JLabel text = new JLabel("NEW CUSTOMER FORM");
		text.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
		text.setBounds(100,20,300,30);
		add(text);
                
                JLabel lblId = new JLabel("ID :");
		lblId.setBounds(35, 80, 100, 20);
		add(lblId);
                
                String options[] = new String[] {"Passport", "Aadhar Card", "Voter Id", "Driving license"};
                comboid = new JComboBox(options);
		comboid.setBounds(200,80, 150, 25);
                comboid.setBackground(Color.WHITE);
		add(comboid);
                
                JLabel lblnumber = new JLabel("Number");
		lblnumber.setBounds(35,120,100,20);
		add(lblnumber);
                
                tfnumber = new JTextField();
		tfnumber.setBounds(200,120,150,25);
		add(tfnumber);
		//tfnumber.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(35,160,100,20);
		add(lblName);
		
		tfname = new JTextField();
		tfname.setBounds(200,160,150,25);
		add(tfname);
		//tfname.setColumns(10);

                
		JLabel lblgender = new JLabel("Gender");
		lblgender.setBounds(35,200,100,20);
		add(lblgender);
                
                rmale = new JRadioButton("Male");
                //rmale.setFont(new Font("Raleway", Font.BOLD, 20));
                rmale.setBackground(Color.WHITE);
                rmale.setBounds(200,200,60,25);
                add(rmale);
                
                rfemale = new JRadioButton("Female");
                //rfemale.setFont(new Font("Raleway", Font.BOLD, 20));
                rfemale.setBackground(Color.WHITE);
                rfemale.setBounds(270,200,100,25);
		add(rfemale);
                
		JLabel lblcountry = new JLabel("Country");
		lblcountry.setBounds(35, 240,100,20);
		add(lblcountry);
                
                tfcountry = new JTextField();
		tfcountry.setBounds(200,240,150,25);
		add(tfcountry);
		//tfcountry.setColumns(10);
		
		JLabel lblroom = new JLabel("Room Number");
		lblroom.setBounds(35, 280,150,20);
                //lblroom.setFont(new Font("Raleway", Font.BOLD, 14));
		add(lblroom);
                
                croom = new Choice();
                try{
                    Conn c = new Conn();
                    String query = "select * from room where available = 'Available'";
                    ResultSet rs = c.s.executeQuery(query);
                    while(rs.next()){
                        croom.add(rs.getString("room"));    
                    }
                }catch(Exception e){ 
                    e.printStackTrace();
                }
                croom.setBounds(200, 280, 150, 20);
		add(croom);
		
		JLabel lbltime = new JLabel("Checkin Time");
		lbltime.setBounds(35, 320,150,20);
		add(lbltime);
                
                Date date = new Date();
                
                checkintime = new JLabel("" + date);
		checkintime.setBounds(200,320, 120, 25);
		add(checkintime);
                
                /*t5 = new JTextField();
		t5.setBounds(271, 316, 150, 20);
		contentPane.add(t5);
		t5.setColumns(10);*/
		
		JLabel lbldeposite = new JLabel("Deposit");
		lbldeposite.setBounds(35, 360,100,20);
		add(lbldeposite);
				
		tfdeposit = new JTextField();
		tfdeposit.setBounds(200,360,150,25);
		add(tfdeposit);
		//tfdeposit.setColumns(10);

		add = new JButton("Add");
                
		/*btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            Conn c = new Conn();
                            String radio = null;
                            
                            if(r1.isSelected()){ 
                                radio = "Male";
                            }
                            else if(r2.isSelected()){ 
                                radio = "Female";
                            }
                            
                            String s6 = c1.getSelectedItem();
                          
                            try{
	    			
                                String s1 = (String)comboBox.getSelectedItem(); 
	    			String s2 =  t1.getText();
	    			String s3 =  t2.getText();
                                String s4 =  radio;
	    			String s5 =  t3.getText();
	    			String s7 =  t5.getText();
                                String s8 =  t6.getText();
                                
                                String q1 = "insert into customer values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"')";
                                String q2 = "update room set availability = 'Occupied' where room_number = "+s6;
                                c.s.executeUpdate(q1);
                                c.s.executeUpdate(q2);
	    			
	    			
	    			JOptionPane.showMessageDialog(null, "Data Inserted Successfully");
                                new Reception().setVisible(true);
                                setVisible(false);
	    		}catch(SQLException e1){
	    			System.out.println(e1.getMessage());
	    		}
		    		catch(NumberFormatException s){
		    			JOptionPane.showMessageDialog(null, "Please enter a valid Number");
			}
			}
		});*/
		add.setBounds(50,410,120,30);
                add.setBackground(Color.BLACK);
                add.setForeground(Color.WHITE);
                add.addActionListener(this);
		add(add);
		
		back = new JButton("Back");
                
		/*btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            new Reception().setVisible(true);
                            setVisible(false);
			}
		}); */
		back.setBounds(200,410,120,30);
                back.setBackground(Color.BLACK);
                back.setForeground(Color.WHITE);
                back.addActionListener(this);
		add(back);
                
                getContentPane().setBackground(Color.WHITE);
                setVisible(true);
                
	}
        public void actionPerformed(ActionEvent ae){
            if (ae.getSource() == add){
                String id = (String) comboid.getSelectedItem();
                String number = tfnumber.getText();
                String name = tfname.getText();
                String gender = null;
                if(rmale.isSelected()){ 
                    gender = "Male";
                }
                else { 
                     gender = "Female";
                }
                
                String country = tfcountry.getText();
                String room = croom.getSelectedItem();
                String time = checkintime.getText();
                String deposit = tfdeposit.getText();
                
                try{
                   String query = "insert into customer values('"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+room+"','"+time+"','"+deposit+"')";
                   String query2 = "update room set available = 'Occupied' where room = '"+room+"'";
                   
                   Conn c = new Conn();
                   
                   c.s.executeUpdate(query);
                   c.s.executeUpdate(query2);
                   
                   JOptionPane.showMessageDialog(null, "New Customer Added Successfully");
                   
                   setVisible(false);
                   new Reception();
                   
                }catch (Exception e){
                    e.printStackTrace();
                }
                
            }else if (ae.getSource() == back){
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
        }
        public static void main(String[] args) {
            new AddCustomer();
            
		/*EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCustomer frame = new AddCustomer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
	}
}

