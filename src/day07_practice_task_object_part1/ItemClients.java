package day07_practice_task_object_part1;

public class ItemClients {

    public static void main(String[] args) {

        Item item1 = new Item();
        item1.itemName = "Jabuka";
        item1.unitPrice = 50.0;
        item1.quantity = 20;
        item1.calcCost();

        System.out.println(item1);
    }
}


