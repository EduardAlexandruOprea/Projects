package GUI;



  import java.sql.*;
import javax.swing.JOptionPane;
public class Connect {

    Connection con=null;
   
        public static Connection ConnectDB(){
            
         // String dbURL = "jdbc:localhost:3306/project";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaProject1","root",""); 
            return con;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
    
    }      
    
        }
}