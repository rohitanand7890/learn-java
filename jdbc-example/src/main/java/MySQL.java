import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import java.sql.*;

public class MySQL {
    public static void main(String[] args) {
        Config config = ConfigFactory.load();
        Config mysqlConfig = config.getConfig("mysql");
        String host = mysqlConfig.getString("host");
        int port =mysqlConfig.getInt("port");
        String username = mysqlConfig.getString("username");
        String password = mysqlConfig.getString("password");


        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://"+host+":"+port+"/sql12245454",username,password);
            // todo Prepared Stratement
            // todo create statement
            // todo database stored proc.
            // todo transactions stored proc , rollback, savepoint
            // todo trigger
            // Statement stmt=con.createStatement();
            PreparedStatement p  =con.prepareStatement("SELECT name, money FROM Person where name = ? ");
            p.setString(1,"ram");
            ResultSet rs=p.executeQuery();
            while(rs.next()) {
                System.out.println(rs.getString("name") + "  " + rs.getString("money"));
            }
            con.close();
        }catch(Exception e){ System.out.println(e);}

    }
}
