
package midtermexampartc;

import java.util.Scanner;

/**
 * The code to be used as the starting point for midterm exam 
 * Part C. Please add your name as a modifier before submitting
 * to the DropBox if you edit this file.
 * 
 * An application that allows a user to see
 * the status of their Pizza Order when they
 * enter in a pizza ID number.
 * @author dancye
 */
public class PizzaStatus 
{

   
    public static void main(String[] args) 
    {
        System.out.println("Welcome to The Pizza Status Menu");
        Pizza p = new Pizza();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your pizza ID");
        String givenId = sc.nextLine();
        p.pizzaId = givenId;//set the pizza id
        //display the status by looking up
        //the pizza ID in the orderList.
        //this part of the logic is intentionally omitted
        System.out.println("cehcking status....");
        System.out.println("please check back after the midterm to see the status of your pizza");
        
       
        
    }
    
}