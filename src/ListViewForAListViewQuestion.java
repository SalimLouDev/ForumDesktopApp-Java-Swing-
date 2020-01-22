import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class ListViewForAListViewQuestion extends JPanel
{
    Home h;
    public ListViewForAListViewQuestion(Home home)
    {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(new Color(38, 78, 54));

        // return Button
        var iOriginalView = new ImageIcon("src/resources/return_32px.png");
        var iBOriginalView = new JButton("                                                                                                                                                                                                 Original View",iOriginalView);
        iBOriginalView.setVerticalTextPosition(SwingConstants.CENTER);
        iBOriginalView.setContentAreaFilled(true);
        iBOriginalView.setFocusPainted(false);
        iBOriginalView.setForeground(Color.WHITE);
        iBOriginalView.addActionListener(e -> h=new Home(new QuestionMainPanel(h),home));
        iBOriginalView.setFont(new Font("Arial",Font.BOLD,14));
        iBOriginalView.setBackground(new Color(38, 78, 54));
        iBOriginalView.setBorder(null);
        add(iBOriginalView);
        add(new ScrollableListViewQuestionPanel(h));
    }
}