import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login implements ActionListener{
        JTextField userF = new JTextField();
        JPasswordField passwordF = new JPasswordField();
    public Login(){
        JFrame loginF = new JFrame("Sunshine");
        JPanel loginP = new JPanel();
        JLabel head, user, password;
        head = new JLabel("LOGIN");
        user = new JLabel("Username:");
        password = new JLabel("Password:");
        JButton loginB = new JButton("<html><font color=white>Login</font></html");

        userF.setBounds(120,100,140,30);
        userF.setBackground(Color.LIGHT_GRAY);
        userF.setFont(new Font("verdana",Font.PLAIN,14));
        loginB.setBorder(null);
        loginP.add(userF);

        passwordF.setBounds(120,150,140,30);
        passwordF.setBackground(Color.LIGHT_GRAY);
        passwordF.setFont(new Font("verdana",Font.PLAIN,14));
        loginB.setBorder(null);
        loginP.add(passwordF);

        loginB.setBounds(50,220,200,40);
        loginB.setBackground(Color.black);
        loginB.setFont(new Font("verdana",Font.PLAIN,18));
        loginB.setFocusPainted(false);
        loginP.add(loginB);
        loginB.addActionListener(this);   

        head.setBounds(100,40,100,50);
        head.setFont(new Font("candara",Font.BOLD,36));
        loginP.add(head);

        user.setBounds(20, 100, 100, 30);
        user.setFont(new Font("verdana",Font.PLAIN,14));
        loginP.add(user);

        password.setBounds(20,150,100,30);
        password.setFont(new Font("verdana",Font.PLAIN,14));
        loginP.add(password);

        loginP.setBounds(490,210,300,300);
        loginP.setBackground(Color.white);
        loginP.setLayout(null);
        loginF.add(loginP);

        loginF.setSize(1280,720);
        loginF.getContentPane().setBackground(new Color(255,224,0));
        loginF.setLayout(null);
        loginF.setVisible(true);

        
    }

    public static void main(String[] args){
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(userF.getText().equals("Naitik_Soni") && passwordF.getText().equals("Abcd@1234")){
            JOptionPane.showMessageDialog(null, "Login successfully");
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid login credentials");
        }
    }
}
