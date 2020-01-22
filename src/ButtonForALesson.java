import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class ButtonForALesson extends JButton
{
    public ButtonForALesson(int positionY , int positionX)
    {
        var iLessons = new ImageIcon("src/resources/book_20px.png");
        setText("Shapter One HMI 2018/2019         ");
        setIcon(iLessons);
        setBounds(positionX,80+positionY,330,40);
        setBackground(new Color(38, 78, 54));
        //iBLessons1.setBorderPainted(false);
        setForeground(Color.white);
        setFont(new Font("Arial",Font.PLAIN,14));
        setVerticalTextPosition(SwingConstants.CENTER);
        setContentAreaFilled(true);
        setFocusPainted(false);
        //iBLessons1.addActionListener(e -> new HOME());
        setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, Color.WHITE));
    }
    public ButtonForALesson()
    {
        var iLessons = new ImageIcon("src/resources/book_40px.png");
        setText("Shapter One HMI 2018/2019                                                         ");
        setIcon(iLessons);
        setBounds(0,0,330,40);
        setBackground(new Color(38, 78, 54));
        //iBLessons1.setBorderPainted(false);
        setForeground(Color.white);
        setFont(new Font("Arial",Font.PLAIN,14));
        setVerticalTextPosition(SwingConstants.CENTER);
        setContentAreaFilled(true);
        setFocusPainted(false);
        addActionListener(e -> {
            try {
                new OpenPdfFiles("/Users/Salim Lou/Downloads/chapter1AJAX38.pdf");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, Color.WHITE));
    }
}
