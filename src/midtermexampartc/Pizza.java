/*
 * Class that models pizza Objects.
* Also has an order list which keeps track
* of all the pizza orders that are in progress.
* user for midterm exam part C.
* Author: Liz Dancy, 2020
*/
package midtermexampartc;


public class Pizza 
{
    public String state;
    public String pizzaId;
    public Pizza[] orderList = new Pizza[3];
    public String[] possibleStates = {"not started", "in prep", "in oven", "cooking", "completed"};
    
    public Pizza(String givenState, String givenId)
    {
        pizzaId = givenId;
        state =  givenState;
    }
    
    public Pizza()
    {
        orderList[0] = new Pizza("in oven", "1");
        orderList[1] = new Pizza ("not started", "2");
        orderList[2] = new Pizza ("in prep", "3");
    }
   
}
