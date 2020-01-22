import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class ContainerForAnAnswer extends JPanel
{
    public ContainerForAnAnswer()
    {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.WHITE);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.WHITE);
        //setBorder(new LineBorder(new Color(38, 78, 54),2,false));
        /*for (int i = 0; i < 50; i++) {
            add(new JLabel("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sit amet interdum elit. " +
                    "Nunc lorem elit, aliquet eget nulla a, ultricies egestas ex. In ultrices egestas sapien,"));
        }*/
        var titel = new JTextArea("Definition - What does Human-Machine Interface (HMI) mean ?\n");
        titel.setFont(new Font("roboto",Font.BOLD,14));
        titel.setForeground(Color.BLACK);
        titel.setEditable(false);
        var textarea = new JTextArea();
        textarea.setText("Human-machine interface (HMI) is a component of certain devices that are capable of handling\n");
        textarea.append("human-machine interactions. The interface consists of hardware and software \n that allow user inputs ");
        textarea.append("to be translated as signals for machines that, in turn, provide the required result to the user. ");
        textarea.append("Human-machine interface technology has been  \nused in different industries like electronics,\n ");
        textarea.append("entertainment, military, medical, etc. Human-machine interfaces help in integrating humans\n ");
        textarea.append("into complex technological systems.");
        textarea.setEditable(false);
        textarea.setFont(new Font("roboto",Font.PLAIN,12));
        textarea.setForeground(Color.BLACK);
        var image = new ImageIcon("src/resources/HMIStructure.jpg");
        var hmiImage = new JLabel(image);
        hmiImage.setMinimumSize(new Dimension(3500,600));
        add(titel);
        add(textarea);
        add(hmiImage);

    }
}
