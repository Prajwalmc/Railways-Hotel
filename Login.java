
package railways.hotel;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    
    JTextField username;
    JPasswordField password;
    JButton login,cancel;

    Login(){

        //super("Login");
        getContentPane().setBackground(Color.WHITE);
        setBounds(500,200,600,300);
        setLayout(null);

        JLabel user = new JLabel("Username");
        user.setBounds(40,20,100,30);
        add(user);
        
        JLabel pass = new JLabel("Password");
        pass.setBounds(40,70,100,30);
        add(pass);
 
        username = new JTextField();
        username.setBounds(150,20,150,30);
        add(username);

        password=new JPasswordField();
        password.setBounds(150,70,150,30);
        add(password);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(350,10,200,200);
        add(l3);


        login = new JButton("Login");
        login.setBounds(40,150,120,30);
        login.setFont(new Font("serif",Font.BOLD,15));
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        cancel=new JButton("Cancel");
        cancel.setBounds(180,150,120,30);
        cancel.setFont(new Font("serif",Font.BOLD,15));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);

        

        setVisible(true);
        

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == login){
            String user = username.getText();
            String pass = password.getText();
            
            try{
            
                Conn c = new Conn();
                
                String query = "select * from login where username = '"+ user +"' and password = '"+ pass +"'";
            
                ResultSet rs = c.s.executeQuery(query); 
                if(rs.next()){ 
                
                    setVisible(false);
                    new Dashboard();
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                    setVisible(false);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            }else if(ae.getSource() == cancel){
                setVisible(false);
        }
    }
    public static void main(String[] arg){
        new Login();
    }
}
