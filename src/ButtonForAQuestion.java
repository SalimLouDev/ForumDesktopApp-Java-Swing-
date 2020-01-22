import javax.swing.*;
import java.awt.*;

public class ButtonForAQuestion extends JButton
{
    public  ButtonForAQuestion(int positionY , int positionX)
    {
        var iQuestions = new ImageIcon("src/resources/help_20px.png");
        setText("What is HMI ?                              ");
        setIcon(iQuestions);
        setBounds(positionX,80+positionY,330,40);
        setBackground(new Color(38, 78, 54));
        //iBQuestion1.setBorderPainted(false);
        setForeground(Color.white);
        setFont(new Font("Arial",Font.PLAIN,14));
        setVerticalTextPosition(SwingConstants.CENTER);
        setContentAreaFilled(true);
        setFocusPainted(false);
        addActionListener(e -> new AnswerQuestionPanel());
        setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, Color.WHITE));
    }
    public  ButtonForAQuestion()
    {
        // for questions in the main panel
        var iQuestions = new ImageIcon("src/resources/help_40px.png");
        setText("What is HMI ?                                                                                ");
        setIcon(iQuestions);
        setBackground(new Color(38, 78, 54));
        setForeground(Color.white);
        setFont(new Font("Arial",Font.PLAIN,14));
        setVerticalTextPosition(SwingConstants.CENTER);
        setContentAreaFilled(true);
        setFocusPainted(false);
        addActionListener(e -> new AnswerQuestionPanel());
        setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, Color.WHITE));
    }
    public  ButtonForAQuestion(int zero)
    {
        //leftmargin=15 marginwidth=15 topmargin=8  marginheight=5
        var iQuestions = new ImageIcon("src/resources/help_40px.png");
        setText("What is HMI ?                                                                                                                                                                                               ");
        setIcon(iQuestions);
        setBackground(new Color(38, 78, 54));
        //iBQuestion1.setBorderPainted(false);
        setForeground(Color.white);
        setFont(new Font("Arial",Font.PLAIN,14));
        setVerticalTextPosition(SwingConstants.CENTER);
        setContentAreaFilled(true);
        setFocusPainted(false);
        addActionListener(e -> new AnswerQuestionPanel());
        setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, Color.WHITE));
    }
}
