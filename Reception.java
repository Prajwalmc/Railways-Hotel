
package railways.hotel;

import javax.swing.*;

import java.sql.*;	
import java.awt.event.*;
import java.awt.*;

public class Reception extends JFrame implements ActionListener{
        JButton newCustomer, rooms, allEmployee, customers,update,roomStatus,checkout,logout;
	//private JPanel contentPane;	
	Reception() {
		
                setBounds(350,200,800,570);
		//contentPane = new JPanel();
		//setContentPane(contentPane);
		setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/fourth.jpg"));
                Image i3 = i1.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel image = new JLabel(i2);
                image.setBounds(250,30,500,470);
                add(image);
		
		newCustomer = new JButton("New Customer Form");
		/*newCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				newCustomer custom = new newCustomer();
				custom.setVisible(true);
                                setVisible(false);
			}catch(Exception e1){
				e1.printStackTrace();
			}
			}
		});*/
		newCustomer.setBounds(10, 30, 200, 30);
                newCustomer.setBackground(Color.BLACK);
                newCustomer.setForeground(Color.WHITE);
                newCustomer.addActionListener(this);
		add(newCustomer);
		
		rooms = new JButton("Room");
		/*rooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				rooms room = new rooms();
				room.setVisible(true);
                                setVisible(false);
				}
				catch(Exception e){
					e.printStackTrace();
				}
				
			}
		});*/
		rooms.setBounds(10, 70, 200, 30);
                rooms.setBackground(Color.BLACK);
                rooms.setForeground(Color.WHITE);
                rooms.addActionListener(this);
                add(rooms);
		
	//	JButton btnNewButton_1 = new JButton("Department");
	//	btnNewButton_1.addActionListener(new ActionListener() {
	//		public void actionPerformed(ActionEvent e) {
	//			try{
	//				Department dept = new Department();
	//				dept.setVisible(true);
	//				setVisible(false);
					
	//			}
	//			catch (Exception e1){
	//				e1.printStackTrace();
	//			}
			
	//		}
	//	});
	//	btnNewButton_1.setBounds(10, 110, 200, 30);
        //        btnNewButton_1.setBackground(Color.BLACK);
        //        btnNewButton_1.setForeground(Color.WHITE);

	//	contentPane.add(btnNewButton_1);
		
		allEmployee = new JButton("All Employee Info");
		/*allEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				
					Employee em = new Employee();
					em.setVisible(true);
					setVisible(false);
					
				}
				catch (Exception e1){
					e1.printStackTrace();
				}
			
			}
		});*/
		allEmployee.setBounds(10, 110, 200, 30);                
                allEmployee.setBackground(Color.BLACK);
                allEmployee.setForeground(Color.WHITE);
                allEmployee.addActionListener(this);
		add(allEmployee);
		
		customers = new JButton("Customer Info");
		/*customers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					//error ---------------------
					CustomerInfo customer = new CustomerInfo();
					customer.setVisible(true);				
					setVisible(false);
				}
				catch (Exception e1){
					e1.printStackTrace();
				}
			}
		});*/
		customers.setBounds(10, 150, 200, 30);
                customers.setBackground(Color.BLACK);
                customers.setForeground(Color.WHITE);
                customers.addActionListener(this);
                add(customers);
		
	/*	JButton managerInfo = new JButton("Manager Info");
		managerInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				ManagerInfo mana = new ManagerInfo();
				mana.setVisible(true);
                                setVisible(false);
				}
				catch (Exception e1){
					e1.printStackTrace();
				}
			}
		});
		managerInfo.setBounds(10, 230, 200, 30);
                managerInfo.setBackground(Color.BLACK);
                managerInfo.setForeground(Color.WHITE);

		add(managerInfo);*/
		
		checkout = new JButton("Check Out");
		/*checkout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckOut check;
				try {
					check = new CheckOut();
					check.setVisible(true);
                                        setVisible(false);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});*/
		checkout.setBounds(10, 190, 200, 30);
                checkout.setBackground(Color.BLACK);
                checkout.setForeground(Color.WHITE);
                checkout.addActionListener(this);
                add(checkout);
		
		update = new JButton("Update Status");
		/*update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				UpdateCheck update = new UpdateCheck();
				update.setVisible(true);
                                setVisible(false);
				}
				catch(Exception e1){
					e1.printStackTrace();
				}
			}
		});*/
		update.setBounds(10, 230, 200, 30);
                update.setBackground(Color.BLACK);
                update.setForeground(Color.WHITE);
                update.addActionListener(this);
                add(update);
		
		roomStatus = new JButton("Update Room Status");
		/*roomStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					UpdateRoom room = new UpdateRoom();
					room.setVisible(true);
                                        setVisible(false);
				}catch(Exception s)
				{
					s.printStackTrace();
				}
			}
		});*/
		roomStatus.setBounds(10, 270, 200, 30);
                roomStatus.setBackground(Color.BLACK);
                roomStatus.setForeground(Color.WHITE);
                roomStatus.addActionListener(this);
                add(roomStatus);
		
	/*	JButton btnPickUpSerice = new JButton("Pick up Service");
		btnPickUpSerice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				PickUp pick = new PickUp();
				pick.setVisible(true);
                                setVisible(false);
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		btnPickUpSerice.setBounds(10, 390, 200, 30);
                btnPickUpSerice.setBackground(Color.BLACK);
                btnPickUpSerice.setForeground(Color.WHITE);

		contentPane.add(btnPickUpSerice);
		
		JButton btnSearchRoom = new JButton("Search Room");
		btnSearchRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				SearchRoom search = new SearchRoom();
				search.setVisible(true);
                                setVisible(false);
				}
				catch (Exception ss){
					ss.printStackTrace();
				}
			}
		});
		btnSearchRoom.setBounds(10, 430, 200, 30);
                btnSearchRoom.setBackground(Color.BLACK);
                btnSearchRoom.setForeground(Color.WHITE);

		contentPane.add(btnSearchRoom);*/

		logout = new JButton("Log Out");
		/*logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
                                    new Login().setVisible(true);
                                    setVisible(false);
                                    
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});*/
		logout.setBounds(10, 310, 200, 30);
                logout.setBackground(Color.BLACK);
                logout.setForeground(Color.WHITE);
                logout.addActionListener(this);
                add(logout);
                
                
                getContentPane().setBackground(Color.WHITE);                
                setVisible(true);
	}
        public void actionPerformed(ActionEvent ae){
            
            if(ae.getSource() == newCustomer){
                setVisible(false);
                new AddCustomer();
                /*EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCustomer frame = new AddCustomer();
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
            
            }else if(ae.getSource() == rooms){
                setVisible(false);
                new Room();
                
            }else if(ae.getSource() == allEmployee){
                setVisible(false);
                new Employeeinfo();
            }else if(ae.getSource() == customers){
                setVisible(false);
                new CustomerInfo();
            }else if(ae.getSource() == update){
                setVisible(false);
                new UpdateCheck();
            }else if(ae.getSource() == roomStatus){
                setVisible(false);
                new UpdateRoom();
            }else if(ae.getSource() == checkout){
                setVisible(false);
                new Checkout();
            }else if(ae.getSource() == logout){
                setVisible(false);
                
            }

        }
        
        public static void main(String[] args) {
            try{
		new Reception();
                /*EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reception frame = new Reception();
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
	}catch (Exception e){
            e.printStackTrace();
        }
    }
}
