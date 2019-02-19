/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasetest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
/**
 *
 * @author Carmen
 */
public class getJSONData {
    
  




    

         
        Connection conn = null;
        
        try {
            /* Identify the Server */
            
            String server = ("jdbc:mysql://localhost/p2_test");
            String username = "root";
            String password = "CS310";
            System.out.println("Connecting to " + server + "...");
            
                /* Load the MySQL JDBC Driver */
                
                Class.forName("com.mysql.jdbc.Driver").newInstance();
           
            
            /* Open Connection */

            conn = DriverManager.getConnection(server, username, password);

            /* Test Connection */
            
            if (conn.isValid(0)) {
                
                /* Connection Open! */
                
                System.out.println("Connected Successfully!");
                
                JSONObject jsonobject = new JSONObject();
                JSONArray jsonarray = new JSONArray();
                
                query = "SELECT * FROM people";
                pstSelect = conn.prepareStatement(query);
                
                String[] headings = 
                
                
            }
            conn.close();
        }
        catch (Exception e) {
            System.err.println(e.toString());
        }
}
