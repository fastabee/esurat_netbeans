/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.surat;

import java.sql.DriverManager;

/**
 *
 * @author fastabee
 */
public class koneksi {
    
    private static java.sql.Connection koneksi;

public static java.sql.Connection getKoneksi(){
if(koneksi == null){
try{
String url = "jdbc:mysql://localhost:3306/esurat";
String user = "root";
String pass = "";
DriverManager.registerDriver(new com.mysql.jdbc.Driver());
koneksi = DriverManager.getConnection(url, user, pass);
System.out.println("berhasil terhubung");

}catch(Exception e){
    System.out.println("error");
}
}
return koneksi;
}

public static void main(String args[]){
getKoneksi();
}
    
}


