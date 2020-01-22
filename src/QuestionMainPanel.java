import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class QuestionMainPanel extends JPanel
{
    Home h;
    QuestionMainPanel(Home home)
    {

        setBackground(new Color(38, 78, 54));
        setLayout(null);
        var iSearchBar = new ImageIcon("src/resources/search_32px.png");
        var iBSearchBar= new JButton(iSearchBar);
        iBSearchBar.setBackground(new Color(255, 255, 255));
        iBSearchBar.setVerticalTextPosition(SwingConstants.CENTER);
        iBSearchBar.setContentAreaFilled(true);
        iBSearchBar.setFocusPainted(false);
        iBSearchBar.setBorder(new LineBorder(new Color(255, 255, 255),1,false));
        iBSearchBar.setBounds(5,30,32,32);
        var searchBar  = new JTextField("search a question");
        searchBar.setBounds(37,30,200,32);
        searchBar.setFont(new Font("Arial", Font.PLAIN, 15));
        searchBar.setBorder(new LineBorder(new Color(255, 255, 255),5,false));
        add(searchBar);
        add(iBSearchBar);

        ///////////////////////// LIST VIEW BUTTON //////////////////////////////

        var iListView = new ImageIcon("src/resources/list_32px.png");
        var iBListView = new JButton("List View",iListView);
        iBListView.setVerticalTextPosition(SwingConstants.CENTER);
        iBListView.setContentAreaFilled(true);
        iBListView.setFocusPainted(false);
        iBListView.setForeground(Color.WHITE);
        iBListView.addActionListener(e -> h=new Home(new ListViewForAListViewQuestion(h),home));
        iBListView.setFont(new Font("Arial",Font.BOLD,14));
        iBListView.setBackground(new Color(38, 78, 54));
        iBListView.setBorder(new LineBorder(new Color(255, 255, 255),1,false));
        iBListView.setBounds(350,30,120,32);
        add(iBListView);

        var questionContainer = new JPanel();
        questionContainer.setLayout(new BoxLayout(questionContainer, BoxLayout.Y_AXIS));
        questionContainer.setBackground(new Color(38, 78, 54));
        questionContainer.setBorder(new LineBorder(new Color(255, 255, 255),1,false));
        for (int i = 0; i < 50; i++) {
            questionContainer.add(new ButtonForAQuestion());
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
        scrollPane.setBounds(5,70,465,450);
        scrollPane.getVerticalScrollBar().setBackground(new Color(38, 78, 54));
        add(scrollPane);

        var titleField  = new JTextField("your title here");
        titleField.setBounds(580,70,370,32);
        titleField.setFont(new Font("Arial", Font.PLAIN, 15));
        titleField.setBorder(new LineBorder(new Color(255, 255, 255),5,false));
        add(titleField);

        var textTitle = new JLabel("Title :");
        textTitle.setForeground(Color.WHITE);
        textTitle.setFont(new Font("Arial",Font.PLAIN,24));
        textTitle.setBounds(500,70,350,32);
        add(textTitle);

        var textArea = new JTextArea();
        textArea.setBounds(500,110,450,310);
        textArea.setFont(new Font("Arial", Font.PLAIN, 15));
        textArea.setBorder(new LineBorder(new Color(255, 255, 255),5,false));
        add(textArea);

        var iBold = new ImageIcon("src/resources/bold_20px.png");
        var iBBold= new JButton(iBold);
        iBBold.setBackground(new Color(255, 255, 255));
        iBBold.setVerticalTextPosition(SwingConstants.CENTER);
        iBBold.setContentAreaFilled(true);
        iBBold.setFocusPainted(false);
        iBBold.setBorder(new LineBorder(new Color(38, 78, 54),1,false));
        iBBold.setBounds(499,421,32,32);
        add(iBBold);

        var iItalic = new ImageIcon("src/resources/italic_20px.png");
        var iBItalic= new JButton(iItalic);
        iBItalic.setBackground(new Color(255, 255, 255));
        iBItalic.setVerticalTextPosition(SwingConstants.CENTER);
        iBItalic.setContentAreaFilled(true);
        iBItalic.setFocusPainted(false);
        iBItalic.setBorder(new LineBorder(new Color(38, 78, 54),1,false));
        iBItalic.setBounds(531,421,32,32);
        add(iBItalic);

        var iUnderline = new ImageIcon("src/resources/underline_20px.png");
        var iBUnderline= new JButton(iUnderline);
        iBUnderline.setBackground(new Color(255, 255, 255));
        iBUnderline.setVerticalTextPosition(SwingConstants.CENTER);
        iBUnderline.setContentAreaFilled(true);
        iBUnderline.setFocusPainted(false);
        iBUnderline.setBorder(new LineBorder(new Color(38, 78, 54),1,false));
        iBUnderline.setBounds(563 ,421,32,32);
        add(iBUnderline);

        var iTextColor = new ImageIcon("src/resources/text_color_20px.png");
        var iBTextColor= new JButton(iTextColor);
        iBTextColor.setBackground(new Color(255, 255, 255));
        iBTextColor.setVerticalTextPosition(SwingConstants.CENTER);
        iBTextColor.setContentAreaFilled(true);
        iBTextColor.setFocusPainted(false);
        iBTextColor.setBorder(new LineBorder(new Color(38, 78, 54),1,false));
        iBTextColor.setBounds(595 ,421,32,32);
        add(iBTextColor);

        var iLink = new ImageIcon("src/resources/link_20px.png");
        var iBLink= new JButton(iLink);
        iBLink.setBackground(new Color(255, 255, 255));
        iBLink.setVerticalTextPosition(SwingConstants.CENTER);
        iBLink.setContentAreaFilled(true);
        iBLink.setFocusPainted(false);
        iBLink.setBorder(new LineBorder(new Color(38, 78, 54),1,false));
        iBLink.setBounds(627 ,421,32,32);
        add(iBLink);

        var iPicture = new ImageIcon("src/resources/Picture_20px.png");
        var iBPicture= new JButton(iPicture);
        iBPicture.setBackground(new Color(255, 255, 255));
        iBPicture.setVerticalTextPosition(SwingConstants.CENTER);
        iBPicture.setContentAreaFilled(true);
        iBPicture.setFocusPainted(false);
        iBPicture.setBorder(new LineBorder(new Color(38, 78, 54),1,false));
        iBPicture.setBounds(659 ,421,32,32);
        add(iBPicture);

        var iLeftAligne = new ImageIcon("src/resources/align_left_20px.png");
        var iBLeftAligne= new JButton(iLeftAligne);
        iBLeftAligne.setBackground(new Color(255, 255, 255));
        iBLeftAligne.setVerticalTextPosition(SwingConstants.CENTER);
        iBLeftAligne.setContentAreaFilled(true);
        iBLeftAligne.setFocusPainted(false);
        iBLeftAligne.setBorder(new LineBorder(new Color(38, 78, 54),1,false));
        iBLeftAligne.setBounds(691 ,421,32,32);
        add(iBLeftAligne);

        var iRightAligne = new ImageIcon("src/resources/align_right_20px.png");
        var iBRightAligne= new JButton(iRightAligne);
        iBRightAligne.setBackground(new Color(255, 255, 255));
        iBRightAligne.setVerticalTextPosition(SwingConstants.CENTER);
        iBRightAligne.setContentAreaFilled(true);
        iBRightAligne.setFocusPainted(false);
        iBRightAligne.setBorder(new LineBorder(new Color(38, 78, 54),1,false));
        iBRightAligne.setBounds(723 ,421,32,32);
        add(iBRightAligne);

        var iCenter = new ImageIcon("src/resources/align_center_20px.png");
        var iBCenter= new JButton(iCenter);
        iBCenter.setBackground(new Color(255, 255, 255));
        iBCenter.setVerticalTextPosition(SwingConstants.CENTER);
        iBCenter.setContentAreaFilled(true);
        iBCenter.setFocusPainted(false);
        iBCenter.setBorder(new LineBorder(new Color(38, 78, 54),1,false));
        iBCenter.setBounds(755 ,421,32,32);
        add(iBCenter);

        var iJustify = new ImageIcon("src/resources/align_justify_20px.png");
        var iBJustify= new JButton(iJustify);
        iBJustify.setBackground(new Color(255, 255, 255));
        iBJustify.setVerticalTextPosition(SwingConstants.CENTER);
        iBJustify.setContentAreaFilled(true);
        iBJustify.setFocusPainted(false);
        iBJustify.setBorder(new LineBorder(new Color(38, 78, 54),1,false));
        iBJustify.setBounds(787,421,32,32);
        add(iBJustify);

        var iNumList = new ImageIcon("src/resources/numbered_list_20px.png");
        var iBNumList= new JButton(iNumList);
        iBNumList.setBackground(new Color(255, 255, 255));
        iBNumList.setVerticalTextPosition(SwingConstants.CENTER);
        iBNumList.setContentAreaFilled(true);
        iBNumList.setFocusPainted(false);
        iBNumList.setBorder(new LineBorder(new Color(38, 78, 54),1,false));
        iBNumList.setBounds(819,421,32,32);
        add(iBNumList);

        var iBullList = new ImageIcon("src/resources/bulleted_list_20px.png");
        var iBBullList= new JButton(iBullList);
        iBBullList.setBackground(new Color(255, 255, 255));
        iBBullList.setVerticalTextPosition(SwingConstants.CENTER);
        iBBullList.setContentAreaFilled(true);
        iBBullList.setFocusPainted(false);
        iBBullList.setBorder(new LineBorder(new Color(38, 78, 54),1,false));
        iBBullList.setBounds(851,421,32,32);
        add(iBBullList);

        var iClearF = new ImageIcon("src/resources/clear_formatting_20px.png");
        var iBClearF= new JButton(iClearF);
        iBClearF.setBackground(new Color(255, 255, 255));
        iBClearF.setVerticalTextPosition(SwingConstants.CENTER);
        iBClearF.setContentAreaFilled(true);
        iBClearF.setFocusPainted(false);
        iBClearF.setBorder(new LineBorder(new Color(38, 78, 54),1,false));
        iBClearF.setBounds(883,421,68,32);
        add(iBClearF);

        var tagField  = new JTextField("your tags here");
        tagField.setBounds(580,470,280,32);
        tagField.setFont(new Font("Arial", Font.PLAIN, 15));
        tagField.setBorder(new LineBorder(new Color(255, 255, 255),5,false));
        add(tagField);

        var tagTitle = new JLabel("Tags :");
        tagTitle.setForeground(Color.WHITE);
        tagTitle.setFont(new Font("Arial",Font.PLAIN,24));
        tagTitle.setBounds(500,470,350,32);
        add(tagTitle);

        var iPost = new ImageIcon("src/resources/add_32px.png");
        var iBPost = new JButton("Post",iPost);
        iBPost.setVerticalTextPosition(SwingConstants.CENTER);
        iBPost.setContentAreaFilled(false);
        iBPost.setFocusPainted(false);
        iBPost.setForeground(Color.WHITE);
        iBPost.setFont(new Font("Arial",Font.BOLD,14));
        iBPost.setBackground(new Color(38, 78, 54));
        iBPost.setBorder(new LineBorder(new Color(255, 255, 255),1,false));
        iBPost.setBounds(865,470,85,32);
        add(iBPost);
    }
}