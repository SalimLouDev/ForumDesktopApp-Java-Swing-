import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class OpenPdfFiles {


    public OpenPdfFiles(String path) throws IOException {

        Desktop desktop = Desktop.getDesktop();
        //let's try to open PDF file
        path = path.replace("\\","/");
        File file;
        file = new File(path);
        if(file.exists()) desktop.open(file);
    }
}