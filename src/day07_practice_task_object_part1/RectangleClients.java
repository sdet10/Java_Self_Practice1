package day07_practice_task_object_part1;

public class RectangleClients {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 3.0;
        rectangle1.length = 5.0;
        Rectangle rectangle2 = new Rectangle();
        rectangle2.width = 7.5;
        rectangle2.length = 20.0;
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle2.calculateArea());
    }
}


