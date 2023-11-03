/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomerMenu;

/**
 *
 * @author james
 */
public class Person {
    private String ID;
    private String Name;
    private String password;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Person(String ID,String Name, String password){
        this.ID=ID;
        this.Name=Name;
        this.password=password;
    }
    
    @Override
    public String toString() {
        return ID+","+Name+","+password;
    }
}
