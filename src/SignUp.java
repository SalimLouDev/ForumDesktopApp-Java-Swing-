import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class SignUp extends JFrame
{
    public SignUp signup;
        public SignUp(Login login)
        {
            InitUI();
            this.setVisible(true);
            login.setVisible(false);
        }

        private void InitUI()
        {
            // creating SIGNUP window
            setTitle("Human Machine Interface Source");
            setSize(1000,600);
            setLocationRelativeTo(null);
            setLayout(null);
            setUndecorated(true);

            //creating main panel
            var panel = new JPanel();
            panel.setSize(1000,600);
            panel.setBackground(new Color(38, 78, 54));
            panel.setLayout(null);
            //panel.setBorder(BorderFactory.createLineBorder(new Color(17, 34, 24),5));
            add(panel);

            // creating SignUp button
            var loginIcon = new ImageIcon("src/resources/checked_40px.png");
            var loginBtn = new JButton("Sign Up",loginIcon);
            loginBtn.setBounds(390, 460, 140, 45);
            loginBtn.setBackground(new Color(38, 78, 54));
            //loginBtn.setBorderPainted(false);
            loginBtn.setForeground(Color.white);
            loginBtn.setFont(new Font("calibri",Font.PLAIN,24));
            loginBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
            loginBtn.setContentAreaFilled(false);
            loginBtn.setFocusPainted(false);
            loginBtn.addActionListener(e -> new Home(signup));
            loginBtn.setBorder(new LineBorder(new Color(255, 255, 255),1,false));
            panel.add(loginBtn);


            //creating the app title
            var title = new JLabel("HUMAN MACHINE INTERFACE SOURCE");
            title.setBounds(20,20,800,50);
            title.setFont(new Font("calibri", Font.PLAIN, 40));
            title.setForeground(Color.white);
            panel.add(title);

            //creating the exit button
            var exitIcon = new ImageIcon("src/resources/close40px.png");
            var exitBtn = new JButton(exitIcon);
            exitBtn.setBackground(new Color(38, 78, 54));
            exitBtn.setBorderPainted(false);
            exitBtn.setBounds(940,20,40,40);
            exitBtn.setFocusPainted(false);
            exitBtn.setContentAreaFilled(false);
            exitBtn.addActionListener(e -> System.exit(0));
            panel.add(exitBtn);

            //creating Text field and lable for username
            var textField = new JTextField(15);
            textField.setBounds(450,250,200,30);
            textField.setFont(new Font("Arial", Font.PLAIN, 15));
            textField.setBorder(new LineBorder(new Color(255, 255, 255),5,false));
            panel.add(textField);

            var textField1 = new JTextField(15);
            textField1.setBounds(450,200,200,30);
            textField1.setFont(new Font("Arial", Font.PLAIN, 15));
            textField1.setBorder(new LineBorder(new Color(255, 255, 255),5,false));
            panel.add(textField1);

            var firstName = new JLabel("First Name");
            firstName.setForeground(Color.white);
            firstName.setBounds(260,205,130,30);
            firstName.setFont(new Font("calibri",Font.PLAIN,24));
            panel.add(firstName);

            var lastName = new JLabel("Last Name");
            lastName.setForeground(Color.white);
            lastName.setBounds(260,255,130,30);
            lastName.setFont(new Font("calibri",Font.PLAIN,24));
            panel.add(lastName);

            var passField = new  JPasswordField();
            passField.setBounds(450,350,200,30);
            passField.setBorder(new LineBorder(new Color(255, 255, 255),5,false));
            panel.add(passField);

            var confPassField = new  JPasswordField();
            confPassField.setBounds(450,400,200,30);
            confPassField.setBorder(new LineBorder(new Color(255, 255, 255),5,false));
            panel.add(confPassField);

            var password= new JLabel("Password");
            password.setForeground(Color.white);
            password.setBounds(260,355,130,30);
            password.setFont(new Font("calibri",Font.PLAIN,24));
            panel.add(password);

            var confPassword= new JLabel("Confirm Password");
            confPassword.setForeground(Color.white);
            confPassword.setBounds(260,405,200,30);
            confPassword.setFont(new Font("calibri",Font.PLAIN,24));
            panel.add(confPassword);

            var emailField = new  JTextField();
            emailField.setBounds(450,300,200,30);
            emailField.setBorder(new LineBorder(new Color(255, 255, 255),5,false));
            emailField.setFont(new Font("Arial", Font.PLAIN, 15));
            panel.add(emailField);

            var email= new JLabel("Email");
            email.setForeground(Color.white);
            email.setBounds(260,305,130,30);
            email.setFont(new Font("calibri",Font.PLAIN,24));
            panel.add(email);
        }
}