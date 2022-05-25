package upeu.edu.pe.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


    public class Conexion {
    private static final String URL="jdbc:postgresql://ec2-54-211-255-161.compute-1.amazonaws.com:5432/d3er3fgkobdfp8";
    private static final String DRIVER ="org.postgresql.Driver";
    private static final String PASS="913ca8a84d7ad53c9f2f2755453e0b4e5e176ce71ea06e58813e331a80687bf9";
    private static final String USER="fbmgibcfavkcnh";
    private static Connection cx = null;
    public static Connection getConex(){
        try {
            Class.forName(DRIVER);
            if(cx==null){
                cx = DriverManager.getConnection(URL, USER, PASS);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error:"+e);
        }
    return cx;
    }
        public static void main(String[] args) {
            if(Conexion.getConex()!=null){
            System.out.println("Conectado");
        }else{
            System.out.println("No conectado");
        }

        }
}

