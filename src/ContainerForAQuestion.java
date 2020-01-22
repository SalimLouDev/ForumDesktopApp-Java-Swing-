import javax.swing.*;
import java.awt.*;

public class ContainerForAQuestion extends JPanel
{
    public ContainerForAQuestion()
    {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.WHITE);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.WHITE);
        /*for (int i = 0; i < 50; i++) {
            add(new JLabel("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sit amet interdum elit. " +
                    "Nunc lorem elit, aliquet eget nulla a, ultricies egestas ex. In ultrices egestas sapien,"));
        }*/
        var titel = new JTextArea("Hi guys i have a problem understanding clearly HMI \n");
        titel.setFont(new Font("roboto",Font.BOLD,14));
        titel.setForeground(Color.RED);
        titel.setEditable(false);
        var textarea = new JTextArea();
        textarea.setText("we studied in univesrtiny about Human Machine Interface and how it makes the user ");
        textarea.append("experience better and to not so crush the users mind with information  \n but how can i use this ");
            textarea.append("science in my work and my codes my programmes i have no idea how to start !. \n");
            textarea.append("so please anyone can help me and explain it more how to use it in real work \n ");
            textarea.append("providing some examples of code and structures\n ");
            textarea.append("Thank you so much to you all !.\n");
            textarea.append("THis is my interface :\n");
        textarea.setEditable(false);
        textarea.setFont(new Font("roboto",Font.PLAIN,12));
        textarea.setForeground(Color.BLACK);
        var image = new ImageIcon("src/resources/hello.jpg");
        var hmiImage = new JLabel(image);
        hmiImage.setMinimumSize(new Dimension(3500,600));
        add(titel);
        add(textarea);
        add(hmiImage);
    }
}
