/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomerMenu;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

/**
 *
 * @author james
 */
public class customerfile {
    public static void main(String[] args) {
    try {
      File myObj = new File("Customer.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
