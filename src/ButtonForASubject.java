import javax.swing.*;
import java.awt.*;

public class ButtonForASubject extends JButton
{
    public ButtonForASubject(int positionY , int positionX)
    {
        var iSubject = new ImageIcon("src/resources/exam_20px.png");
        setText("Subject One IHM 2017/2018         ");
        setIcon(iSubject);
        setBounds(positionX,80+positionY,330,40);
        setBackground(new Color(38, 78, 54));
        //iBSubject1.setBorderPainted(false);
        setForeground(Color.white);
        setFont(new Font("Arial",Font.PLAIN,14));
        setVerticalTextPosition(SwingConstants.CENTER);
        setContentAreaFilled(true);
        setFocusPainted(false);
        //iBSubject1.addActionListener(e -> new HOME());
        setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, Color.WHITE));
    }
    public ButtonForASubject()
    {
        var iSubject = new ImageIcon("src/resources/exam_40px.png");
        setText("Subject One IHM 2017/2018                                                         ");
        setIcon(iSubject);
        setBounds(0,0,330,40);
        setBackground(new Color(38, 78, 54));
        setForeground(Color.white);
        setFont(new Font("Arial",Font.PLAIN,14));
        setVerticalTextPosition(SwingConstants.CENTER);
        setContentAreaFilled(true);
        setFocusPainted(false);
        addActionListener(e -> new OpenWebPage("https://drive.google.com/open?id=13fn_nfftsl7BEnZ7KQz31YBb43YJlGxp"));
        setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, Color.WHITE));
    }
}
