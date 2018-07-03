import java.sql.*;

// todo exceptions
// todo  sql injection
public class PostgreSqlConnect {
    public static void main(String[] array) {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
             c = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres123");
            System.out.println("connected");
            CallableStatement upperProc = c.prepareCall("{call test_jdbc.add_emp_details( ?, ? ) }");
            upperProc.setString(1, "r");
            upperProc.setInt(2, 50);
            upperProc.execute();
            PreparedStatement p1 = c.prepareStatement("select * from test_jdbc.demo");
            ResultSet rs = p1.executeQuery();
            while(rs.next()) {
                String name = rs.getString("name");
                int salary = rs.getInt("salary") ;
                System.out.println(name+"  "+salary);
            }
            System.out.println();
            p1.close();
            upperProc.close();

        }
        catch(Exception e){ System.out.println(e);}
        finally {
            try {
                if(c != null) {
                    c.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}






























