import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class LessonMainPanel extends JPanel
{
    public LessonMainPanel()
    {
        setBackground(new Color(38, 78, 54));
        setLayout(null);
        setBackground(new Color(38, 78, 54));
        setLayout(null);

        var questionContainer = new JPanel();
        questionContainer.setLayout(new BoxLayout(questionContainer, BoxLayout.Y_AXIS));
        questionContainer.setBackground(new Color(38, 78, 54));
        questionContainer.setBorder(new LineBorder(new Color(255, 255, 255),1,false));

        for (int i = 0; i < 50; i++) {
            questionContainer.add(new ButtonForALesson());
        }
        JScrollPane scrollPane = new JScrollPane(questionContainer);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.getVerticalScrollBar().setUnitIncrement(20);
        scrollPane.setComponentZOrder(scrollPane.getVerticalScrollBar(), 0);
        scrollPane.setComponentZOrder(scrollPane.getViewport(), 1);
        scrollPane.getVerticalScrollBar().setOpaque(false);
        scrollPane.setLayout(new ScrollPaneLayout() {
            @Override
            public void layoutContainer(Container parent) {
                JScrollPane scrollPane = (JScrollPane) parent;

                Rectangle availR = scrollPane.getBounds();
                availR.x = availR.y = 0;

                Insets parentInsets = parent.getInsets();
                availR.x = parentInsets.left;
                availR.y = parentInsets.top;
                availR.width -= parentInsets.left + parentInsets.right;
                availR.height -= parentInsets.top + parentInsets.bottom;

                Rectangle vsbR = new Rectangle();
                vsbR.width = 12;
                vsbR.height = availR.height;
                vsbR.x = availR.x + availR.width - vsbR.width;
                vsbR.y = availR.y;

                if (viewport != null) {
                    viewport.setBounds(availR);
                }
                if (vsb != null) {
                    vsb.setVisible(true);
                    vsb.setBounds(vsbR);
                }
            }
        });
        scrollPane.getVerticalScrollBar().setUI(new MyScrollBarUI(Color.WHITE));
        UIManager.put("ScrollBarUI", "my.package.MyScrollBarUI");
        scrollPane.setBorder(new LineBorder(new Color(255, 255, 255),1,false));
        scrollPane.setBounds(5,15,465,500);
        scrollPane.getVerticalScrollBar().setBackground(new Color(38, 78, 54));
        add(scrollPane);

        var iUpload = new ImageIcon("src/resources/upload_40px.png");
        var iBUpload = new JButton("Upload",iUpload);
        iBUpload.setVerticalTextPosition(SwingConstants.BOTTOM);
        iBUpload.setContentAreaFilled(false);
        iBUpload.setFocusPainted(false);
        iBUpload.setForeground(Color.WHITE);
        iBUpload.setFont(new Font("calibri",Font.PLAIN,24));
        iBUpload.setBackground(new Color(38, 78, 54));
        iBUpload.setBorder(null);
        iBUpload.setBounds(640,110,150,45);
        add(iBUpload);

        var iYoutube = new ImageIcon("src/resources/youtube_40px.png");
        var iBYoutube = new JButton("Upload youtube link",iYoutube);
        iBYoutube.setVerticalTextPosition(SwingConstants.CENTER);
        iBYoutube.setContentAreaFilled(true);
        iBYoutube.setFocusPainted(false);
        iBYoutube.setForeground(Color.WHITE);
        iBYoutube.addActionListener(e -> new UploadInterface(1));
        iBYoutube.setFont(new Font("Arial",Font.BOLD,14));
        iBYoutube.setBackground(new Color(38, 78, 54));
        iBYoutube.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.WHITE));
        iBYoutube.setBounds(620,155,200,45);
        add(iBYoutube);

        var iDrive = new ImageIcon("src/resources/google_drive_40px.png");
        var iBDrive = new JButton("Upload google Drive link",iDrive);
        iBDrive.setVerticalTextPosition(SwingConstants.CENTER);
        iBDrive.setContentAreaFilled(true);
        iBDrive.setFocusPainted(false);
        iBDrive.setForeground(Color.WHITE);
        iBDrive.addActionListener(e -> new UploadInterface(2));
        iBDrive.setFont(new Font("Arial",Font.BOLD,12));
        iBDrive.setBackground(new Color(38, 78, 54));
        iBDrive.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.WHITE));
        iBDrive.setBounds(620,201,200,45);
        add(iBDrive);

        var iWeb = new ImageIcon("src/resources/website_40px.png");
        var iBWeb = new JButton("Upload a website link",iWeb);
        iBWeb.setVerticalTextPosition(SwingConstants.CENTER);
        iBWeb.setContentAreaFilled(true);
        iBWeb.setFocusPainted(false);
        iBWeb.setForeground(Color.WHITE);
        iBWeb.addActionListener(e -> new UploadInterface(3));
        iBWeb.setFont(new Font("Arial",Font.BOLD,13));
        iBWeb.setBackground(new Color(38, 78, 54));
        iBWeb.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.WHITE));
        iBWeb.setBounds(620,247,200,45);
        add(iBWeb);

        var iPdf = new ImageIcon("src/resources/pdf_40px.png");
        var iBPdf = new JButton("Upload  a  PDF",iPdf);
        iBPdf.setVerticalTextPosition(SwingConstants.CENTER);
        iBPdf.setContentAreaFilled(true);
        iBPdf.setFocusPainted(false);
        iBPdf.setForeground(Color.WHITE);
        iBPdf.addActionListener(e -> new UploadInterface(4));
        iBPdf.setFont(new Font("Arial",Font.BOLD,19));
        iBPdf.setBackground(new Color(38, 78, 54));
        iBPdf.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE));
        iBPdf.setBounds(620,293,200,45);
        add(iBPdf);

    }
}