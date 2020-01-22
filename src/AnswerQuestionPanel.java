import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.concurrent.atomic.AtomicInteger;

public class AnswerQuestionPanel extends JFrame
{
    AnswerQuestionPanel()
    {
        setTitle("Human Machine Interface Source");
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setSize(1000,600);

        //creating main panel
        var panel = new JPanel();
        panel.setSize(1000,600);
        panel.setBackground(new Color(38, 78, 54));
        panel.setLayout(null);
        //panel.setBorder(BorderFactory.createLineBorder(new Color(17, 34, 24),5));
        add(panel);

        var questionTitle = new JLabel("What is HMI ?");
        questionTitle.setFont(new Font("calibri", Font.PLAIN, 32));
        questionTitle.setForeground(Color.WHITE);
        questionTitle.setBounds(400,5,240,42);
        panel.add(questionTitle);

        // question container
        JScrollPane s = new ScrollableContainerForAQuestion();
        s.setBounds(75,45,850,150);
        panel.add(s);

        //label for showing number of likes
        AtomicInteger nlikes = new AtomicInteger();
        var likes = new JLabel(Integer.toString(nlikes.get()));
        likes.setFont(new Font("Roboto", Font.PLAIN, 24));
        likes.setForeground(Color.WHITE);
        likes.setBounds(27,105,50,25);
        panel.add(likes);

        //arrow up for increcment
        var iArrowUp = new ImageIcon("src/resources/triangle_40px.png");
        var iBArrowUp = new JButton(iArrowUp);
        iBArrowUp.setContentAreaFilled(true);
        iBArrowUp.setFocusPainted(false);
        iBArrowUp.addActionListener(e -> likes.setText(Integer.toString(nlikes.incrementAndGet())));
        iBArrowUp.setBackground(new Color(38, 78, 54));
        iBArrowUp.setBorder(null);
        iBArrowUp.setBounds(15,54,40,40);
        panel.add(iBArrowUp);

        //arrow down for decrecment
        var iArrowDown = new ImageIcon("src/resources/triangle_arrow_40px.png");
        var iBArrowDown = new JButton(iArrowDown);
        iBArrowDown.setContentAreaFilled(true);
        iBArrowDown.setFocusPainted(false);
        iBArrowDown.addActionListener(e -> likes.setText(Integer.toString(nlikes.decrementAndGet())));
        iBArrowDown.setBackground(new Color(38, 78, 54));
        iBArrowDown.setBorder(null);
        iBArrowDown.setBounds(15,139,40,40);
        panel.add(iBArrowDown);

        //answer title
        var answerTitle = new JLabel("Answers");
        answerTitle.setFont(new Font("roboto", Font.PLAIN, 24));
        answerTitle.setForeground(Color.WHITE);
        answerTitle.setBounds(450,190,240,42);
        panel.add(answerTitle);

        // answer container
        JScrollPane v = new ScrollableContainerForAnAnswer();
        v.setBorder(new LineBorder(new Color(38, 78, 54),2,false));
        v.setBounds(75,230,850,150);
        panel.add(v);

        var textArea = new JTextArea();
        textArea.setBounds(75,431,852,122);
        textArea.setFont(new Font("Arial", Font.PLAIN, 15));
        textArea.setBorder(new LineBorder(new Color(38, 78, 54),1,false));
        panel.add(textArea);

        var iBold = new ImageIcon("src/resources/bold_20px.png");
        var iBBold= new JButton(iBold);
        iBBold.setBackground(new Color(255, 255, 255));
        iBBold.setVerticalTextPosition(SwingConstants.CENTER);
        iBBold.setContentAreaFilled(true);
        iBBold.setFocusPainted(false);
        iBBold.setBorder(new LineBorder(new Color(38, 78, 54),1,false));
        iBBold.setBounds(75,400,32,32);
        panel.add(iBBold);

        var iItalic = new ImageIcon("src/resources/italic_20px.png");
        var iBItalic= new JButton(iItalic);
        iBItalic.setBackground(new Color(255, 255, 255));
        iBItalic.setVerticalTextPosition(SwingConstants.CENTER);
        iBItalic.setContentAreaFilled(true);
        iBItalic.setFocusPainted(false);
        iBItalic.setBorder(new LineBorder(new Color(38, 78, 54),1,false));
        iBItalic.setBounds(107,400,32,32);
        panel.add(iBItalic);

        var iUnderline = new ImageIcon("src/resources/underline_20px.png");
        var iBUnderline= new JButton(iUnderline);
        iBUnderline.setBackground(new Color(255, 255, 255));
        iBUnderline.setVerticalTextPosition(SwingConstants.CENTER);
        iBUnderline.setContentAreaFilled(true);
        iBUnderline.setFocusPainted(false);
        iBUnderline.setBorder(new LineBorder(new Color(38, 78, 54),1,false));
        iBUnderline.setBounds(139 ,400,32,32);
        panel.add(iBUnderline);

        var iTextColor = new ImageIcon("src/resources/text_color_20px.png");
        var iBTextColor= new JButton(iTextColor);
        iBTextColor.setBackground(new Color(255, 255, 255));
        iBTextColor.setVerticalTextPosition(SwingConstants.CENTER);
        iBTextColor.setContentAreaFilled(true);
        iBTextColor.setFocusPainted(false);
        iBTextColor.setBorder(new LineBorder(new Color(38, 78, 54),1,false));
        iBTextColor.setBounds(171 ,400,32,32);
        panel.add(iBTextColor);

        var iLink = new ImageIcon("src/resources/link_20px.png");
        var iBLink= new JButton(iLink);
        iBLink.setBackground(new Color(255, 255, 255));
        iBLink.setVerticalTextPosition(SwingConstants.CENTER);
        iBLink.setContentAreaFilled(true);
        iBLink.setFocusPainted(false);
        iBLink.setBorder(new LineBorder(new Color(38, 78, 54),1,false));
        iBLink.setBounds(203 ,400,32,32);
        panel.add(iBLink);

        var iPicture = new ImageIcon("src/resources/Picture_20px.png");
        var iBPicture= new JButton(iPicture);
        iBPicture.setBackground(new Color(255, 255, 255));
        iBPicture.setVerticalTextPosition(SwingConstants.CENTER);
        iBPicture.setContentAreaFilled(true);
        iBPicture.setFocusPainted(false);
        iBPicture.setBorder(new LineBorder(new Color(38, 78, 54),1,false));
        iBPicture.setBounds(235 ,400,32,32);
        panel.add(iBPicture);

        var iLeftAligne = new ImageIcon("src/resources/align_left_20px.png");
        var iBLeftAligne= new JButton(iLeftAligne);
        iBLeftAligne.setBackground(new Color(255, 255, 255));
        iBLeftAligne.setVerticalTextPosition(SwingConstants.CENTER);
        iBLeftAligne.setContentAreaFilled(true);
        iBLeftAligne.setFocusPainted(false);
        iBLeftAligne.setBorder(new LineBorder(new Color(38, 78, 54),1,false));
        iBLeftAligne.setBounds(267 ,400,32,32);
        panel.add(iBLeftAligne);

        var iRightAligne = new ImageIcon("src/resources/align_right_20px.png");
        var iBRightAligne= new JButton(iRightAligne);
        iBRightAligne.setBackground(new Color(255, 255, 255));
        iBRightAligne.setVerticalTextPosition(SwingConstants.CENTER);
        iBRightAligne.setContentAreaFilled(true);
        iBRightAligne.setFocusPainted(false);
        iBRightAligne.setBorder(new LineBorder(new Color(38, 78, 54),1,false));
        iBRightAligne.setBounds(299 ,400,32,32);
        panel.add(iBRightAligne);

        var iCenter = new ImageIcon("src/resources/align_center_20px.png");
        var iBCenter= new JButton(iCenter);
        iBCenter.setBackground(new Color(255, 255, 255));
        iBCenter.setVerticalTextPosition(SwingConstants.CENTER);
        iBCenter.setContentAreaFilled(true);
        iBCenter.setFocusPainted(false);
        iBCenter.setBorder(new LineBorder(new Color(38, 78, 54),1,false));
        iBCenter.setBounds(331 ,400,32,32);
        panel.add(iBCenter);

        var iJustify = new ImageIcon("src/resources/align_justify_20px.png");
        var iBJustify= new JButton(iJustify);
        iBJustify.setBackground(new Color(255, 255, 255));
        iBJustify.setVerticalTextPosition(SwingConstants.CENTER);
        iBJustify.setContentAreaFilled(true);
        iBJustify.setFocusPainted(false);
        iBJustify.setBorder(new LineBorder(new Color(38, 78, 54),1,false));
        iBJustify.setBounds(363,400,32,32);
        panel.add(iBJustify);

        var iNumList = new ImageIcon("src/resources/numbered_list_20px.png");
        var iBNumList= new JButton(iNumList);
        iBNumList.setBackground(new Color(255, 255, 255));
        iBNumList.setVerticalTextPosition(SwingConstants.CENTER);
        iBNumList.setContentAreaFilled(true);
        iBNumList.setFocusPainted(false);
        iBNumList.setBorder(new LineBorder(new Color(38, 78, 54),1,false));
        iBNumList.setBounds(395,400,32,32);
        panel.add(iBNumList);

        var iBullList = new ImageIcon("src/resources/bulleted_list_20px.png");
        var iBBullList= new JButton(iBullList);
        iBBullList.setBackground(new Color(255, 255, 255));
        iBBullList.setVerticalTextPosition(SwingConstants.CENTER);
        iBBullList.setContentAreaFilled(true);
        iBBullList.setFocusPainted(false);
        iBBullList.setBorder(new LineBorder(new Color(38, 78, 54),1,false));
        iBBullList.setBounds(427,400,32,32);
        panel.add(iBBullList);

        var iPost = new ImageIcon("src/resources/add_32px.png");
        var iBPost = new JButton("Post an Answer",iPost);
        iBPost.setVerticalTextPosition(SwingConstants.CENTER);
        iBPost.setContentAreaFilled(true);
        iBPost.setFocusPainted(false);
        iBPost.setForeground(Color.WHITE);
        iBPost.setFont(new Font("Arial",Font.BOLD,14));
        iBPost.setBackground(new Color(38, 78, 54));
        iBPost.setBorder(new LineBorder(new Color(255, 255, 255),1,false));
        iBPost.setBounds(745,390,180,32);
        panel.add(iBPost);
    }
}