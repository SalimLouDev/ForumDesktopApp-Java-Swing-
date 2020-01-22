import javax.swing.*;
import java.awt.*;

public class ListViewQuestionPanel extends JPanel {

    //Home h;
    public ListViewQuestionPanel()
    {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(new Color(38, 78, 54));


        for (int i = 0; i < 50; i++) {
            add(new ButtonForAQuestion(0));
            add(new ScrollableContainerForAQuestion());
        }
    }
}