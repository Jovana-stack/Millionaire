<<<<<<< HEAD
package gui_Assignment;

import java.io.FileWriter;
import java.io.IOException;

public class user {

    private String name;
    private int money;
    private int userNumber;

    public user() {
        this.money = 0;
         this.userNumber = 1; // Initialize user number to 1
        generateName();
        
    }

    private void generateName() {
        this.name = "user" + userNumber;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void saveUserDataToFile() {
        try {
            try (FileWriter writer = new FileWriter("C:\\Users\\jovan\\Downloads\\gui_assignment_0.7\\gui_assignment_0.2\\gui_assignment_0.2\\test\\user_data", true)) {
                writer.write(name + " " + money + System.lineSeparator());
            }

            System.out.println("User data saved to user_data.txt");
        } catch (IOException e) {
            System.err.println("Error saving user data to the file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Creating a user
        user myUser = new user();
        myUser.setName("user1");
        myUser.setMoney(100);    

       
        myUser.saveUserDataToFile();

      
    }
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui_Assignment;

public class user {

	String name;
	int money;

	public user(String name) {
		this.name = name;
		this.money = 0;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

>>>>>>> origin/main
}
