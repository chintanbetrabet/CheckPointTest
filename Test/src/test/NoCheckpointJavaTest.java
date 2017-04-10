/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author chintan
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package edu.bitsgoa.xx.yy.Test;


  
import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NoCheckpointJavaTest{  

public void move(String s,String s1)
{
    
    //System.out.println("OLD");
}
@SuppressWarnings("empty-statement")
public static void main(String args[]){
    System.out.println("Driver Program Started");
try{  
Class.forName("com.mysql.jdbc.Driver");  
}
catch(Exception e)
{
    
}
Connection con = null;
String URL="jdbc:mysql://localhost:3306/LARGE";
    try {
        /*if (!URL.contains("autoReconnect"))
        {
        if(URL.contains("?"))
        {
        URL=URL+"&&autoReconnect=true";
        }
        else
        {
        URL=URL+"?&&autoReconnect=true";
        }
        }*/
        con=DriverManager.getConnection( URL,"root","J!4192chb");
    } catch (SQLException ex) {
        Logger.getLogger(NoCheckpointJavaTest.class.getName()).log(Level.SEVERE, null, ex);
    }
  
// System.out.println("URL is finally:"+URL);
Scanner sc=null;
try{sc=new Scanner(new File("/home/chintan/Downloads/SOP/FinalProjectStructure/Test/query_file"));}
catch (IOException e){}
int i=1;
while(sc.hasNext() && i<4)
{
    try {
       DriverManager.getConnection( URL,"root","J!4192chb");
       String query ;
       query=sc.nextLine();
       String command_called=query.split(" ")[0];
       System.out.println("Your query was : "+query+"\nYour command was :"+command_called.toLowerCase());
       if(command_called.toLowerCase().equals("update"))
       {
       DriverManager.getConnection( URL,"root","J!4192chb");
       PreparedStatement preparedStmt = con.prepareStatement(query);
       
      /* try
                         {
                          System.out.println("I want a CHKPT after ");
                         String command = "/home/chintan/Downloads/SOP/FinalProjectStructure/JavaCheckpointingTool/libs/dmtcp/test/plugin/chkptplugin";
                         Process process = Runtime.getRuntime().exec(command);
                 java.io.BufferedReader buffer = new java.io.BufferedReader(new java.io.InputStreamReader(process.getInputStream()));
                 String line="";
                 			while((line=buffer.readLine())!=null)
                 			{
                 				System.out.println(line);
                 			}
                         } catch (java.io.IOException ex) {
                             System.out.println("Glitch");
                         }
*/
        
        //con=DriverManager.getConnection( URL,"root","J!4192chb");
        preparedStmt.executeUpdate();
       // preparedStmt.setURL(0, URL);  
         /* System.out.println("I want a CHKPT after ");String str3 = "/home/chintan/Downloads/SOP/FinalProjectStructure/JavaCheckpointingTool/libs/dmtcp/test/plugin/chkptplugin";
          try { Process localProcess = Runtime.getRuntime().exec(str3); localProcess.waitFor();} catch (IOException localIOException1) { System.out.println("Glitch");
          } catch (InterruptedException ex) {
                Logger.getLogger(NoCheckpointJavaTest.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        
        //preparedStmt = con.prepareStatement("select 1;");
       // ResultSet executeQuery = preparedStmt.executeQuery();
       //preparedStmt.executeUpdate();
       }
       else
       {
       	System.out.println("Command was **"+command_called.toLowerCase()+"**  instead of update");
        DriverManager.getConnection( URL,"root","J!4192chb");
       	Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(query);
        while(rs.next())
        System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(7));
        
        }
       System.out.println("Executing i="+i+"");
       i++;
       } catch (SQLException ex) {
           System.out.println("Exception");
            ex.printStackTrace();
        }
    //Parasite.move();
    
}
sc.close();


}
}  
 
