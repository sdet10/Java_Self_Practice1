package day11_practice_task_clas_objects_part2;

public class PizzaClients {


    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();
        pizza1.size = "small";
        pizza1.numberOfCheeseTopping = 2;
        pizza1.numberOfPepperoniTopping = 2;
        System.out.println(pizza1);

        Pizza pizza2 = new Pizza();
        pizza2.size = "medium";
        pizza2.numberOfCheeseTopping = 1;
        pizza2.numberOfPepperoniTopping = 4;
        System.out.println(pizza2);

        Pizza pizza3 = new Pizza();
        pizza3.size = "large";
        pizza3.numberOfCheeseTopping = 2;
        pizza3.numberOfPepperoniTopping = 3;
        System.out.println(pizza3);
    }
}


