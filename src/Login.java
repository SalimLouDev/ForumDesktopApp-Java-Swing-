import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;

public class Login extends JFrame
{
    public static Login l;
    //public static SignUp s;
    //public LOGIN l;

    public Login()
    {
        InitUI();
    }
    private void InitUI()
    {

        // creating LOGIN window
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


        //creating the app title
        var title = new JLabel("HUMAN MACHINE INTERFACE SOURCE");
        title.setBounds(20,20,800,50);
        title.setFont(new Font("calibri", Font.PLAIN, 40));
        title.setForeground(Color.white);
        panel.add(title);

        // creating LOGIN button
        var loginIcon = new ImageIcon("src/resources/login_40px.png");
        Image lIcone = loginIcon.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);
        loginIcon.setImage(lIcone);
        var loginBtn = new JButton("Login"/*,loginIcon*/);
        loginBtn.setBounds(430, 360, 140, 45    );
        loginBtn.setBackground(new Color(38, 78, 54));
        loginBtn.setIcon(loginIcon);
        loginBtn.setBorderPainted(true);
        loginBtn.setForeground(Color.white); //loginBtn.setBackground(Color.WHITE); loginBtn.setBackground(new Color(38, 78, 54));
        loginBtn.setFont(new Font("calibri",Font.PLAIN,24));
        loginBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
        loginBtn.setContentAreaFilled(false);
        loginBtn.setFocusPainted(false);
        loginBtn.addActionListener(e -> new Home(l));
        loginBtn.setBorder(new LineBorder(new Color(255, 255, 255),1,false));
        panel.add(loginBtn);

        //creating the exit button
        //var exitIcon = new ImageIcon("src/resources/close40px.png");
        var exitIcon = new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("resources/close40px.png")));
        var exitBtn = new JButton();
        exitBtn.setIcon(exitIcon);
        exitBtn.setBackground(new Color(38, 78, 54));
        exitBtn.setBorderPainted(false);
        exitBtn.setBounds(940,20,40,40);
        exitBtn.setFocusPainted(false);
        exitBtn.setContentAreaFilled(false);
        exitBtn.addActionListener(e -> System.exit(0));
        panel.add(exitBtn);

        //member logo
        /*var memberIcon = new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("resources/member_100px.png")));
        var memberBtn = new JLabel();
        memberBtn.setIcon(memberIcon);
        memberBtn.setBackground(new Color(38, 78, 54));
        memberBtn.setBounds(450,150,100,100);
        panel.add(memberBtn);*/

        //creating Text field and lable for username
        var textField1 = new JTextField(15);
        textField1.setBounds(450,250,200,30);
        textField1.setFont(new Font("Arial", Font.PLAIN, 15));
        textField1.setBorder(new LineBorder(new Color(255, 255, 255),5,false));
        panel.add(textField1);

        var passField = new  JPasswordField();
        passField.setBounds(450,300,200,30);
        passField.setBorder(new LineBorder(new Color(255, 255, 255),5,false));
        panel.add(passField);

        var username = new JLabel("Username");
        username.setForeground(Color.white);
        username.setBounds(340,255,130,30);
        username.setFont(new Font("calibri",Font.PLAIN,24));
        panel.add(username);

        var password= new JLabel("Password");
        password.setForeground(Color.white);
        password.setBounds(345,305,130,30);
        password.setFont(new Font("calibri",Font.PLAIN,24));
        panel.add(password);

        //creating sign up transaction
        var signUpLable = new JLabel("You don't have an account ?                       NOW !");
        signUpLable.setForeground(Color.white);
        signUpLable.setBounds(400,555,330,20);
        signUpLable.setFont(new Font("calibri",Font.PLAIN,15));
        panel.add(signUpLable);

        //sign up button
        var signUpBtn = new JButton("Sign Up");
        signUpBtn.setContentAreaFilled(false);
        signUpBtn.setFocusPainted(false);
        signUpBtn.setBorderPainted(false);
        signUpBtn.setForeground(Color.white);
        signUpBtn.addActionListener(e -> new SignUp(l));
        signUpBtn.setFont(new Font("calibri",Font.BOLD,18));
        signUpBtn.setBounds(555,555,100,20);
        panel.add(signUpBtn);

    }

    public static void main(String [] args)
    {
        //SIGNUP s = new SIGNUP();
        //s.setVisible(true);
        l = new Login();
        l.setVisible(true);
    }
}
