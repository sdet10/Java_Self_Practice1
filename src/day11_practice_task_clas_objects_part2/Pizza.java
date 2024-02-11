package day11_practice_task_clas_objects_part2;

public class Pizza {

    String size;
    int numberOfCheeseTopping;
    int numberOfPepperoniTopping;

    public Pizza() {
    }

    public int calcCost() {
        int totalCost;
        if (this.size.equalsIgnoreCase("Small")) {
            totalCost = 10 + 2 * this.numberOfCheeseTopping + 2 * this.numberOfPepperoniTopping;
            return totalCost;
        } else if (this.size.equalsIgnoreCase("Medium")) {
            totalCost = 12 + 2 * this.numberOfCheeseTopping + 2 * this.numberOfPepperoniTopping;
            return totalCost;
        } else if (this.size.equalsIgnoreCase("Large")) {
            totalCost = 14 + 2 * this.numberOfCheeseTopping + 2 * this.numberOfPepperoniTopping;
            return totalCost;
        } else {
            return 0;
        }
    }

    public String toString() {
        String var10000 = this.size;
        return "Pizza{size='" + var10000 + "', numberOfCheeseTopping=" + this.numberOfCheeseTopping + ", numberOfPepperoniTopping=" + this.numberOfPepperoniTopping + ", Total Cost=" + this.calcCost() + "}";
    }
}

/*
1. Create a custom class named Pizza with the following specifications:

    Attributes:
		   size
		   numberOfCheeseTopping
		   numberOfPepperoniTopping

	Actions:
		calcCost(): returns the totalCost of the pizza
		toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

   Pizza cost is determined by:
   		Small: $10 + $2 per topping
   		Medium: $12 + $2 per topping
   		Large: $14 + $2 per topping

    Create another class named PizzaClients, create multiple pizza objects, and test each function of the pizza object.
 */
