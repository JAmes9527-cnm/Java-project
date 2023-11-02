/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomerMenu;

/**
 *
 * @author james
 */
public class TimeClient {

  public static void main(String[] args)throws InterruptedException {
    // Create a Time object.
    Time time = new Time();

    // Display the hour, minute, and second using the get methods.
    System.out.println("Hour: " + time.getHour());
    System.out.println("Minute: " + time.getMinute());
    System.out.println("Second: " + time.getSecond());
    
    Time[] timeArray = new Time[60/5];
        for (int i = 0; i < timeArray.length; i++) {
            timeArray[i] = new Time();
            System.out.println(timeArray[i].toString());
            Thread.sleep(5000); // Sleep for 5 seconds
        }
  }
}
