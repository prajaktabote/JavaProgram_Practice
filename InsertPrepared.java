//how to insert data in table using jdbc in java program
import java.sql.*;
class InsertPreapared
{
    public static void main(String args[])
    {
        try{

    Class.forName("oracle.jdbc.driver.OracleDriver");
    connection con = DriverManager.getConnection("jdbc.oracle:thin:@loaclhost:1521:xe" ,"system","oracle");
    PreparedStatement stmt=con.preparedStatement("insert into Emp values(?,?)");
    stmt.setInt(1,101);
    stmt.setString(2,"Ratan");
    int i = stmt.executeUpdate();
    System.out.println(i+"record inserted");
    con.close();
    }catch(Exception e)
    {
        System.out.println(e);
    }
    }
}