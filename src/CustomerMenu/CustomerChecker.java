/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomerMenu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author james
 */
public class CustomerChecker {
    public static boolean doesCustomerIDExist(String CustomerID) {
    try (BufferedReader reader = new BufferedReader(new FileReader("Customer.txt"))) {
        String line;

        while ((line = reader.readLine()) != null) {
            String[] Data = line.split(",");
            if (Data.length == 4) {
                String customerID = Data[0].trim(); // Trim any leading/trailing spaces
                if (customerID.equals(CustomerID)) {
                    // The FoodID exists in the "menu.txt" file
                    return true;
                }
            }
        }
    } catch (IOException ex) {
        ex.printStackTrace();
    }
    return false;
    }
    
    public static String findCustomerPassword(String CustomerID) {
         try (BufferedReader reader = new BufferedReader(new FileReader("Customer.txt"))) {
            String line;
    
            while ((line = reader.readLine()) != null) {
                String[] Data = line.split(",");
                if (Data.length == 4) {
                    String customerID = Data[0].trim(); // Trim any leading/trailing spaces
                    if (customerID.equals(CustomerID)) {
                        // The FoodID exists, return the price
                        String password = Data[2].trim(); // Assuming the price is in the third position
                        return password;
                    }
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
         
         return "0";
    }
    
    public static double findCustomerCredit(String CustomerID) {
        try (BufferedReader reader = new BufferedReader(new FileReader("Customer.txt"))) {
            String line;
    
            while ((line = reader.readLine()) != null) {
                String[] Data = line.split(",");
                if (Data.length == 4) {
                    String customerID = Data[0].trim(); // Trim any leading/trailing spaces
                    if (customerID.equals(CustomerID)) {
                        // The FoodID exists, return the price
                        double credit = Double.parseDouble(Data[3].trim()); // Assuming the price is in the third position
                        return credit;
                    }
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
         
         return 0;
    }
    
    public static void deductCustomerCredit(double credit){
        String customerID = CustomerLogin.customerID;
    String filename = "Customer.txt";

    // Create a temporary file to write updated data
    String tempFilename = "tempCustomer.txt";

    try (BufferedReader reader = new BufferedReader(new FileReader(filename));
         BufferedWriter writer = new BufferedWriter(new FileWriter(tempFilename))) {

        String line;
        boolean customerFound = false;

        while ((line = reader.readLine()) != null) {
            String[] Data = line.split(",");
            if (Data.length == 4) {
                String existingCustomerID = Data[0].trim();
                if (existingCustomerID.equals(customerID)) {
                    customerFound = true;
                    double existingCredit = Double.parseDouble(Data[3].trim());
                    if (existingCredit >= credit) {
                        existingCredit -= credit;
                    } else {
                        System.out.println("Insufficient credit");
                        // You may want to handle the case of insufficient credit here
                    }
                    line = String.join(",", Data[0], Data[1], Data[2], String.valueOf(existingCredit));
                }
            }
            writer.write(line);
            writer.newLine();
        }

        // If the customer was not found, you may want to handle this case too
        if (!customerFound) {
            System.out.println("Customer not found");
        }
    } catch (IOException ex) {
        ex.printStackTrace();
    }

    // Rename the temporary file to the original filename
    File originalFile = new File(filename);
    originalFile.delete();
    File tempFile = new File(tempFilename);
    if (tempFile.renameTo(originalFile)) {
        System.out.println("Credit deduction successful");
    } else {
        System.out.println("Failed to update credit");
    }
}
}
