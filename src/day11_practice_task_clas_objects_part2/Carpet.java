package day11_practice_task_clas_objects_part2;

public class Carpet {

    public double width;
    public double length;
    public double unitPrice;
    public boolean isPersian;

    public Carpet() {
    }

    public String toString() {
        return "Carpet{width=" + this.width + ", length=" + this.length + ", unitPrice=" + this.unitPrice + ", isPersian=" + this.isPersian + "}";
    }

    public double calcCost() {
        double totalPrice;
        if (this.isPersian = true) {
            totalPrice = this.width * this.length * this.unitPrice;
            return totalPrice;
        } else {
            totalPrice = this.width * this.length * this.unitPrice + 200.0;
            return totalPrice;
        }
    }
}


/*
2. Create a custom class named Carpet with the following specifications:

    Attributes:
   			width
   			length
   			unitPrice
   			isPersian (boolean)

    Actions:
		calcCost(): calculate the total cost of the carpet and return it as a double.
   		toString(): display all the info of the carpet, including the total cost of the carpet as calculated by calcCost()

   Price calculation formula:
   		Total price of carpet = (width * length) * unitPrice
   		If the carpet is Persian, add $200 to the totalPrice

    Create another class named CarpetClients, create multiple carpet objects, and test each function of the carpet object.
 */
