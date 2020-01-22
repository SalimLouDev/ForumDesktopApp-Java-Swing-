import javax.swing.*;
import java.awt.*;

public class Home extends JFrame
{
    public Home h=this;
    public Home(Login login)
    {
        InitUI();
        this.setVisible(true);
        login.setVisible(false);
    }

    public Home(SignUp signUp)
    {
        InitUI();
        this.setVisible(true);
        signUp.setVisible(false);
    }

    public Home(JScrollPane panel ,Home home)
    {
        InitUI(panel);
        this.setVisible(true);
        home.setVisible(false);
    }

    public Home(JPanel panel ,Home home)
    {
        InitUI(panel);
        this.setVisible(true);
        home.setVisible(false);
    }

    private void InitUI()
    {
        // creating HOME window
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

        /////////////////////////////////////////////

        UIManager.put("TabbedPane.borderHightlightColor",new Color(38, 78, 54));
        UIManager.put("TabbedPane.darkShadow",new Color(38, 78, 54));
        UIManager.put("TabbedPane.light",new Color(38, 78, 54));
        UIManager.put("TabbedPane.selectHighlight",new Color(38, 78, 54));
        UIManager.put("TabbedPane.darkShadow",new Color(38, 78, 54));
        UIManager.put("TabbedPane.focus",new Color(38, 78, 54));

        var hometabbedpan = new JTabbedPane();
        hometabbedpan.setFont(new Font("calibri",Font.PLAIN,20));
        hometabbedpan.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5 style='font-family:roboto;color:white'>Dashboard</body></html>", new DashboardMainPanel());
        hometabbedpan.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5 style='font-family:roboto;color:white'>Questions</body></html>", new QuestionMainPanel(h));
        hometabbedpan.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5 style='font-family:roboto;color:white'>Lessons</body></html>"  , new LessonMainPanel());
        hometabbedpan.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5 style='font-family:roboto;color:white'>Subjects</body></html>" , new SubjectsMainPanel());
        hometabbedpan.setBounds(20,20,960,600);
        hometabbedpan.setBackground(new Color(38, 78, 54));
        hometabbedpan.setForeground(Color.white);
        panel.add(hometabbedpan);

        /////////////////////////////////////////////

        //creating then icon problem
        ImageIcon problemIcon = new ImageIcon("src/resources/info_32px.png");
        JButton problemBtn = new JButton(problemIcon);
        problemBtn.setBounds(900,25,32,32);
        problemBtn.setBackground(new Color(38, 78, 54));
        problemBtn.addActionListener(e -> new OpenWebPage("https://mail.google.com/mail/u/1/?tab=wm0&ogbl#inbox?compose=new"));
        problemBtn.setBorderPainted(false);
        problemBtn.setContentAreaFilled(false);
        panel.add(problemBtn);

    }
    private void InitUI(JScrollPane p)
    {
        // creating HOME window
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

        /////////////////////////////////////////////

        UIManager.put("TabbedPane.borderHightlightColor",new Color(38, 78, 54));
        UIManager.put("TabbedPane.darkShadow",new Color(38, 78, 54));
        UIManager.put("TabbedPane.light",new Color(38, 78, 54));
        UIManager.put("TabbedPane.selectHighlight",new Color(38, 78, 54));
        UIManager.put("TabbedPane.darkShadow",new Color(38, 78, 54));
        UIManager.put("TabbedPane.focus",new Color(38, 78, 54));

        var hometabbedpan = new JTabbedPane();

        hometabbedpan.setFont(new Font("calibri",Font.PLAIN,20));
        hometabbedpan.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5 style='font-family:roboto;color:white'>Dashboard</body></html>", new DashboardMainPanel());
        hometabbedpan.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5 style='font-family:roboto;color:white'>Questions</body></html>", p);
        hometabbedpan.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5 style='font-family:roboto;color:white'>Lessons</body></html>"  , new LessonMainPanel());
        hometabbedpan.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5 style='font-family:roboto;color:white'>Subjects</body></html>" , new SubjectsMainPanel());
        hometabbedpan.setBounds(20,20,960,600);
        hometabbedpan.setSelectedIndex(1);
        hometabbedpan.setBackground(new Color(38, 78, 54));
        hometabbedpan.setForeground(Color.white);
        panel.add(hometabbedpan);

        /////////////////////////////////////////////

        //creating then icon problem
        ImageIcon problemIcon = new ImageIcon("src/resources/info_32px.png");
        JButton problemBtn = new JButton(problemIcon);
        problemBtn.setBounds(900,25,32,32);
        problemBtn.setBackground(new Color(38, 78, 54));
        problemBtn.setBorderPainted(false);
        problemBtn.addActionListener(e -> new OpenWebPage("https://mail.google.com/mail/u/1/?tab=wm0&ogbl#inbox?compose=new"));
        problemBtn.setContentAreaFilled(false);
        panel.add(problemBtn);
    }
    private void InitUI(JPanel p)
    {
        // creating HOME window
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

        /////////////////////////////////////////////

        UIManager.put("TabbedPane.borderHightlightColor",new Color(38, 78, 54));
        UIManager.put("TabbedPane.darkShadow",new Color(38, 78, 54));
        UIManager.put("TabbedPane.light",new Color(38, 78, 54));
        UIManager.put("TabbedPane.selectHighlight",new Color(38, 78, 54));
        UIManager.put("TabbedPane.darkShadow",new Color(38, 78, 54));
        UIManager.put("TabbedPane.focus",new Color(38, 78, 54));

        var hometabbedpan = new JTabbedPane();

        hometabbedpan.setFont(new Font("calibri",Font.PLAIN,20));
        hometabbedpan.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5 style='font-family:roboto;color:white'>Dashboard</body></html>", new DashboardMainPanel());
        hometabbedpan.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5 style='font-family:roboto;color:white'>Questions</body></html>", p);
        hometabbedpan.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5 style='font-family:roboto;color:white'>Lessons</body></html>"  , new LessonMainPanel());
        hometabbedpan.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5 style='font-family:roboto;color:white'>Subjects</body></html>" , new SubjectsMainPanel());
        hometabbedpan.setBounds(20,20,960,600);
        hometabbedpan.setSelectedIndex(1);
        hometabbedpan.setBackground(new Color(38, 78, 54));
        hometabbedpan.setForeground(Color.white);
        panel.add(hometabbedpan);

        /////////////////////////////////////////////

        //creating then icon problem
        ImageIcon problemIcon = new ImageIcon("src/resources/info_32px.png");
        JButton problemBtn = new JButton(problemIcon);
        problemBtn.setBounds(900,25,32,32);
        problemBtn.setBackground(new Color(38, 78, 54));
        problemBtn.setBorderPainted(false);
        problemBtn.addActionListener(e -> new OpenWebPage("https://mail.google.com/mail/u/1/?tab=wm0&ogbl#inbox?compose=new"));
        problemBtn.setContentAreaFilled(false);
        panel.add(problemBtn);
    }
}