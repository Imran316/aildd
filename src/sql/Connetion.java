/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import ttdesign.ProfessorData;

/**
 *
 * @author imran
 */
public class Connetion {
    
        public Connection con = null;
        public Statement st;
        public ResultSet rs;
    public Connetion() {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Timetable", "imran", "Imran@316");
            st = con.createStatement();
            
        }catch(Exception e){
            System.out.println(e.toString());
        }
        System.out.println("Connection Establish");
    }
    
    public void addProfessor(ProfessorData frame, String id, String name, String mob){
        try{
            String query = "INSERT INTO Professor(ID, NAME, MOBILE) VALUES('"+id+"', '"+name+"', '"+mob+"')";
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(frame, "Professor Successfully inserted");
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
