
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class DataConnect {
    public static void main(String ar[]){
       try{
               Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","aman");
            System.err.println("JT");
       if(cn!=null)
               System.out.println("Connected");
           PreparedStatement ps=cn.prepareStatement("select * from admin_login");
           ResultSet rs=ps.executeQuery();
          // System.err.println(rs.next());
           while(rs.next())
           {
               System.err.println("Data:"+rs.getString(1)+"\t"+rs.getString(2));
               System.exit(0);
           }
           System.err.println(rs.next());
           System.err.println("Exit");
    }catch(Exception e){
      e.printStackTrace();
    }
    }
    
}
