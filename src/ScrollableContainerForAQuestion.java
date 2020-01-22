import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class ScrollableContainerForAQuestion extends JScrollPane
{
    ScrollableContainerForAQuestion()
    {
        setMaximumSize(new Dimension(1800,200));
        setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        getVerticalScrollBar().setUnitIncrement(20);
        setComponentZOrder(this.getVerticalScrollBar(), 0);
        setComponentZOrder(this.getViewport(), 1);
        getVerticalScrollBar().setOpaque(false);
        setLayout(new ScrollPaneLayout() {
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
        getVerticalScrollBar().setUI(new MyScrollBarUI(new Color(38, 78, 54)));
        UIManager.put("ScrollBarUI", "my.package.MyScrollBarUI");
        setBorder(new LineBorder(new Color(255, 255, 255),1,false));
        setBounds(5,70,465,450);
        getVerticalScrollBar().setBackground(new Color(38, 78, 54));
        setViewportView(new ContainerForAQuestion());
    }
}