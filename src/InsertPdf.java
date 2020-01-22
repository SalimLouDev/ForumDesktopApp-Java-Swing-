import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPdf {


    public InsertPdf(String path , String pdfName) throws SQLException, ClassNotFoundException, IOException {
        // Initialize the database
        Connection con = DatabaseConnection.initializeDatabase();

        // Create a SQL query to insert data into demo table
        // demo table consists of two columns, so two '?' is used
        PreparedStatement st = con.prepareStatement("insert into pdfFiles values(?, ?)");
        path = path.replace("\\", "/");
        File pdfFile = new File(path);
        byte[] pdfData = new byte[(int) pdfFile.length()];
        DataInputStream dis = new DataInputStream(new FileInputStream(pdfFile));
        dis.readFully(pdfData);  // read from file into byte[] array
        dis.close();
        // For the first parameter,
        // sets the data to st pointer
        st.setString(1,pdfName);

        // Same for second parameter
        st.setBytes(2,pdfData);

        // Execute the insert command using executeUpdate()
        // to make changes in database
        st.executeUpdate();

        // Close all the connections
        st.close();
        con.close();
    }
}