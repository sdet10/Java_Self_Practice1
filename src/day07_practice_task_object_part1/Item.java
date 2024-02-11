package day07_practice_task_object_part1;


public class Item {
    String itemName;
    double unitPrice;
    int quantity;

    public Item() {
    }

    public void calcCost() {
        double cost = (double)this.quantity * this.unitPrice;
        System.out.println("The total cost is : " + cost);
    }

    public String toString() {
        return "Item{name='" + this.itemName + "'' unitPrice=" + this.unitPrice + "' quantity=" + this.quantity + "}";
    }
}
/*
3. Create a custom class named Item with the following attributes and actions:

      Attributes:
            itemName (String): used for storing the name of the item.
            unitPrice (double): used for storing the quantity of the item.
            quantity (int): used for storing the unit price of the item.

      Actions:
            calcCost(): calculates the total cost of the item.
            toString(): returns a string representation of the Item object with the full information of the item,
            including the total cost calculated by calcCost.


      Create another class named ItemClients, create multiple item objects, and test each function of the item object.
 */