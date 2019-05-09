package connessione; 
 
import java.sql.DriverManager; 
import java.sql.SQLException; 
 
import java.sql.*; 
 
public class Connessione { 
  
 Connection c; 
  
 public Connessione(){ 
  this.c = Conn(); 
 } 
  
 public Connection getConn(){ 
  return this.c; 
 } 
  
 public void closeConn(){ 
  try { 
   this.c.close(); 
  } catch (SQLException e) { 
   System.out.println("Chiusura connessione fallita !"); 
   e.printStackTrace(); 
  } 
 } 
  
 private static Connection Conn(){ 
  System.out.println("-------- MySQL JDBC Connection Testing ------------"); 
  
  try { 
   Class.forName("com.mysql.jdbc.Driver"); 
  } catch (ClassNotFoundException e) { 
   System.out.println("Driver Non Trovato"); 
   e.printStackTrace(); 
   return null; 
  } 
  Connection connection = null; 
  
  try { 
 
   connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/localsweets?user=root&password=rootroot"); 
  
  } catch (SQLException e) { 
   e.printStackTrace(); 
   return null; 
  } 
  
  if (connection != null)return connection; 
   
  return connection; 
 } 
 
}