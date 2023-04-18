/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytestreams3;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Student
 */
public class LAB2 {
    public static void main(String[] args) {
        try {
            FileOutputStream output = new FileOutputStream("data.dat");
            String s = "Hello World";
            byte[] b = s.getBytes();
            output.write(b);
        } catch (FileNotFoundException ex){
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        try {
            FileInputStream input = new FileInputStream("data.dat");
            int value;
            while((value=input.read()) != -1){
                System.out.println((char)value);
            }
             input.close();
        } catch (FileNotFoundException ex){
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
