import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;

public class UploadInterface extends JFrame
{
    public UploadInterface(int type)
    {
        setTitle("Human Machine Interface Source");
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(500,300);

        //creating main panel
        var panel = new JPanel();
        panel.setSize(500,500);
        panel.setBackground(new Color(38, 78, 54));
        panel.setLayout(null);
        add(panel);

        if(type==1)
            {
                var titleField  = new JTextField("your title here");
                titleField.setBounds(120,10,250,32);
                titleField.setFont(new Font("Arial", Font.PLAIN, 15));
                titleField.setBorder(new LineBorder(new Color(255, 255, 255),5,false));
                panel.add(titleField);

                var linkField  = new JTextField("your link here");
                linkField.setBounds(120,50,250,32);
                linkField.setFont(new Font("Arial", Font.PLAIN, 15));
                linkField.setBorder(new LineBorder(new Color(255, 255, 255),5,false));
                panel.add(linkField);

                var testButton = new JButton("Test link");
                testButton.setBounds(200,130,100,32);
                testButton.setVerticalTextPosition(SwingConstants.CENTER);
                testButton.setContentAreaFilled(true);
                testButton.setFocusPainted(false);
                testButton.setForeground(Color.WHITE);
                testButton.addActionListener(e -> new OpenWebPage("https://"+linkField.getText()));
                testButton.setFont(new Font("Arial",Font.BOLD,14));
                testButton.setBackground(new Color(38, 78, 54));
                testButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE));
                panel.add(testButton);

                var uploadButton = new JButton("Upload",new ImageIcon("src/resources/youtube_40px.png"));
                uploadButton.setBounds(175,180,150,45);
                uploadButton.setVerticalTextPosition(SwingConstants.CENTER);
                uploadButton.setContentAreaFilled(true);
                uploadButton.setFocusPainted(false);
                uploadButton.setForeground(Color.WHITE);
                //uploadButton.addActionListener(e -> new OpenWebPage("https://"+linkField.getText()));
                uploadButton.setFont(new Font("Arial",Font.BOLD,14));
                uploadButton.setBackground(new Color(38, 78, 54));
                uploadButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE));
                panel.add(uploadButton);
            }
        else if (type==2)
            {
                var titleField  = new JTextField("your title here");
                titleField.setBounds(120,10,250,32);
                titleField.setFont(new Font("Arial", Font.PLAIN, 15));
                titleField.setBorder(new LineBorder(new Color(255, 255, 255),5,false));
                panel.add(titleField);

                var linkField  = new JTextField("your link here");
                linkField.setBounds(120,50,250,32);
                linkField.setFont(new Font("Arial", Font.PLAIN, 15));
                linkField.setBorder(new LineBorder(new Color(255, 255, 255),5,false));
                panel.add(linkField);

                var testButton = new JButton("Test link");
                testButton.setBounds(200,130,100,32);
                testButton.setVerticalTextPosition(SwingConstants.CENTER);
                testButton.setContentAreaFilled(true);
                testButton.setFocusPainted(false);
                testButton.setForeground(Color.WHITE);
                testButton.addActionListener(e -> new OpenWebPage("https://"+linkField.getText()));
                testButton.setFont(new Font("Arial",Font.BOLD,14));
                testButton.setBackground(new Color(38, 78, 54));
                testButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE));
                panel.add(testButton);

                var uploadButton = new JButton("Upload",new ImageIcon("src/resources/google_drive_40px.png"));
                uploadButton.setBounds(175,180,150,45);
                uploadButton.setVerticalTextPosition(SwingConstants.CENTER);
                uploadButton.setContentAreaFilled(true);
                uploadButton.setFocusPainted(false);
                uploadButton.setForeground(Color.WHITE);
                //uploadButton.addActionListener(e -> new OpenWebPage("https://"+linkField.getText()));
                uploadButton.setFont(new Font("Arial",Font.BOLD,14));
                uploadButton.setBackground(new Color(38, 78, 54));
                uploadButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE));
                panel.add(uploadButton);
            }
        else if (type==3)
            {
                var titleField  = new JTextField("your title here");
                titleField.setBounds(120,10,250,32);
                titleField.setFont(new Font("Arial", Font.PLAIN, 15));
                titleField.setBorder(new LineBorder(new Color(255, 255, 255),5,false));
                panel.add(titleField);

                var linkField  = new JTextField("your link here");
                linkField.setBounds(120,50,250,32);
                linkField.setFont(new Font("Arial", Font.PLAIN, 15));
                linkField.setBorder(new LineBorder(new Color(255, 255, 255),5,false));
                panel.add(linkField);

                var testButton = new JButton("Test link");
                testButton.setBounds(200,130,100,32);
                testButton.setVerticalTextPosition(SwingConstants.CENTER);
                testButton.setContentAreaFilled(true);
                testButton.setFocusPainted(false);
                testButton.setForeground(Color.WHITE);
                testButton.addActionListener(e -> new OpenWebPage("https://"+linkField.getText()));
                testButton.setFont(new Font("Arial",Font.BOLD,14));
                testButton.setBackground(new Color(38, 78, 54));
                testButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE));
                panel.add(testButton);

                var uploadButton = new JButton("Upload",new ImageIcon("src/resources/website_40px.png"));
                uploadButton.setBounds(175,180,150,45);
                uploadButton.setVerticalTextPosition(SwingConstants.CENTER);
                uploadButton.setContentAreaFilled(true);
                uploadButton.setFocusPainted(false);
                uploadButton.setForeground(Color.WHITE);
                //uploadButton.addActionListener(e -> new OpenWebPage("https://"+linkField.getText()));
                uploadButton.setFont(new Font("Arial",Font.BOLD,14));
                uploadButton.setBackground(new Color(38, 78, 54));
                uploadButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE));
                panel.add(uploadButton);
            }
        else
            {
                var titleField  = new JTextField("your title here");
                titleField.setBounds(120,10,250,32);
                titleField.setFont(new Font("Arial", Font.PLAIN, 15));
                titleField.setBorder(new LineBorder(new Color(255, 255, 255),5,false));
                panel.add(titleField);

                var linkField  = new JTextField("your PDF Path here");
                linkField.setBounds(120,50,250,32);
                linkField.setFont(new Font("Arial", Font.PLAIN, 15));
                linkField.setBorder(new LineBorder(new Color(255, 255, 255),5,false));
                panel.add(linkField);

                var testButton = new JButton("Test link");
                testButton.setBounds(200,130,100,32);
                testButton.setVerticalTextPosition(SwingConstants.CENTER);
                testButton.setContentAreaFilled(true);
                testButton.setFocusPainted(false);
                testButton.setForeground(Color.WHITE);
                testButton.addActionListener(e -> {
                    try {
                        new OpenPdfFiles(linkField.getText());
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                });
                testButton.setFont(new Font("Arial",Font.BOLD,14));
                testButton.setBackground(new Color(38, 78, 54));
                testButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE));
                panel.add(testButton);

                var uploadButton = new JButton("Upload",new ImageIcon("src/resources/pdf_40px.png"));
                uploadButton.setBounds(175,180,150,45);
                uploadButton.setVerticalTextPosition(SwingConstants.CENTER);
                uploadButton.setContentAreaFilled(true);
                uploadButton.setFocusPainted(false);
                uploadButton.setForeground(Color.WHITE);
                uploadButton.addActionListener(e -> {
                    try {
                        new InsertPdf(linkField.getText(),titleField.getText());
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    } catch (ClassNotFoundException ex) {
                        ex.printStackTrace();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                });
                uploadButton.setFont(new Font("Arial",Font.BOLD,14));
                uploadButton.setBackground(new Color(38, 78, 54));
                uploadButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE));
                panel.add(uploadButton);
            }
    }
}