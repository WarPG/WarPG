import java.sql.*;

public class Character {

    public static void main(String [] args){
        try {
            Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/warpg","postgres","ridahab");
        PreparedStatement stmt = con.prepareStatement("SELECT * FROM Character");
            ResultSet Rs = stmt.executeQuery();
            while(true){
                System.out.println("lol");
            }
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
