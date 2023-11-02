/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomerMenu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author james
 */
public class FileCopier {
    public static void FileCopy(String sourceFileName, String destinationFileName){
        sourceFileName = CurrentCustomer.getCartPath();
        destinationFileName = "Order"+ Time.getOrderTime() +".txt";

        try {
            // Create input stream for the source file
            FileInputStream fileInputStream = new FileInputStream(sourceFileName);

            // Create output stream for the destination file
            FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName,true);

            // Create a buffer to hold the data while transferring
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read data from the source file and write it to the destination file
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
            }

            // Close the streams
            fileInputStream.close();
            fileOutputStream.close();

            System.out.println("File duplicated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
