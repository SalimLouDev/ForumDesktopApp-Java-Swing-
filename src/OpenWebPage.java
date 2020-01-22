import java.awt.*;
import java.net.URL;

public class OpenWebPage
{
    public OpenWebPage(String urlString)
    {
        try {
            Desktop.getDesktop().browse(new URL(urlString).toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}