
package conexao;


import java.sql.Connection;
import java.sql.DriverManager;


public class Conexao {

    private static Connection conn;
    
    public static Connection get(){
        try{
            if(conn==null || conn.isClosed()){
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zagati", "root", "");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }
    
    
}
