
package railways.hotel;

import java.awt.EventQueue;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class AddEmployee extends JFrame implements ActionListener{ //Third Frame

    JTextField tfname,tfage,tfsalary,tfphone,tfemail,tfaadhar;
    JComboBox cbjob;
    JButton submit;
    JRadioButton male,female;

    AddEmployee(){
        setLayout(null);
        setBounds(350,200,850,540);
            
            //getContentPane().setForeground(Color.BLUE);
        getContentPane().setBackground(Color.WHITE);
            //setTitle("ADD EMPLOYEE DETAILS");
		 
            //setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            //setSize(778,486);
            //getContentPane().setLayout(null);
	JLabel lblname = new JLabel("NAME");
        lblname.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblname.setBounds(60, 30, 120, 30);
        add(lblname);
            
        tfname = new JTextField();
        tfname.setBounds(200, 30, 150, 30);
        add(tfname);
						
        JLabel lblage = new JLabel("AGE");
        lblage.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblage.setBounds(60, 80, 100, 30);
        add(lblage);
			
        tfage = new JTextField();
        tfage.setBounds(200, 80, 150, 30);
        add(tfage);
            
        JLabel Gender = new JLabel("GENDER");
        Gender.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Gender.setBounds(60, 130, 120, 30);
        add(Gender);
		
        male = new JRadioButton("MALE");
        male.setBackground(Color.WHITE);
        male.setBounds(200, 130, 70, 30);
        add(male);
	
        female = new JRadioButton("FEMALE");
        female.setBackground(Color.WHITE);
        female.setBounds(280, 130, 70, 30);
        add(female);
            
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
            
        JLabel lbljob = new JLabel("JOB");
        lbljob.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lbljob.setBounds(60, 180, 120, 30);
        add(lbljob);    
            
        /*textField_2 = new JTextField();
        textField_2.setBounds(200, 80, 150, 27);
        add(textField_2);*/
			
        String str[] = {"Front Desk Clerks","Porters","Housekeeping","Kitchen Staff","Room Service","Waiter/Waitress","Manager","Accountant","Chef"};
        cbjob = new JComboBox(str);
        cbjob.setBackground(Color.WHITE);
        cbjob.setBounds(200,180,150,30);
        add(cbjob);
            		
        JLabel lblsalary = new JLabel("SALARY");
        lblsalary.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblsalary.setBounds(60, 230, 120, 30);
        add(lblsalary);
			
        tfsalary = new JTextField();
        tfsalary.setBounds(200, 230, 150, 30);
        add(tfsalary);    
	
        JLabel lblphone = new JLabel("PHONE");
        lblphone.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblphone.setBounds(60, 280, 120, 30);
        add(lblphone);
	
        tfphone = new JTextField();
        tfphone.setBounds(200, 280, 150, 30);
        add(tfphone);
	
        JLabel lbladaar = new JLabel("AADHAR");
        lbladaar.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lbladaar.setBounds(60, 330, 120, 30);
        add(lbladaar);
			
        tfaadhar = new JTextField();
        tfaadhar.setBounds(200, 330, 150, 30);
        add(tfaadhar);
	
        JLabel email = new JLabel("EMAIL");
        email.setFont(new Font("Tahoma", Font.PLAIN, 17));
        email.setBounds(60, 380, 120, 30);
        add(email); 
            
	tfemail = new JTextField();
        tfemail.setBounds(200, 380, 150, 30);
        add(tfemail);
            
        submit = new JButton("SUBMIT");
        submit.setBounds(200, 430, 150, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);		
            
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/tenth.jpg"));
        Image i2 = i1.getImage().getScaledInstance(450, 450,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(380,60,450,370);
        add(image);
            
        setVisible(true);    
            
	
	
            //JLabel AddPassengers = new JLabel("ADD EMPLOYEE DETAILS");
            //AddPassengers.setForeground(Color.BLUE);
            //AddPassengers.setFont(new Font("Tahoma", Font.PLAIN, 31));
            //AddPassengers.setBounds(450, 24, 442, 35);
            //add(AddPassengers);
			
     
            		
            
    }
            
    //Next.addActionListener (new ActionListener(){        
            
        
        public void actionPerformed(ActionEvent ae){
            
        
                
            
            String name = tfname.getText();
            String age = tfage.getText();
            //String job = tfjob.getText();
            String salary = tfsalary.getText();
            String phone = tfphone.getText();
            String aadhar = tfaadhar.getText();
            String email = tfemail.getText();
                   
            String gender = null;
  
                
            if(male.isSelected()){
                gender = "Male";
                    
            }else if(female.isSelected()){
                gender = "Female";
            }

                            
            String job = (String)cbjob.getSelectedItem();
                    
            try {
                Conn conn = new Conn();
                String query = "insert into employee values( '"+name+"', '"+age+"', '"+gender+"','"+job+"', '"+salary+"', '"+phone+"','"+aadhar+"', '"+email+"')";
                        
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Employee Added Successfully");
                setVisible(false);
                    
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
            
            
	
        
    
    public static void main(String[] args){
        new AddEmployee();
    }    
      
}

