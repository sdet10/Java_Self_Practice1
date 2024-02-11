package day07_practice_task_object_part1;

public class Rectangle {


        public double width;
        public double length;
        public double area;
        public double perimeter;

        public Rectangle() {
        }

        public double calculateArea() {
            this.area = this.length * this.width;
            System.out.println("Area = " + this.area);
            return this.area;
        }

        public double calculatePerimeter() {
            this.perimeter = (this.length + this.width) * 2.0;
            System.out.println("Perimeter = " + this.perimeter);
            return this.perimeter;
        }

        public String toString() {
            return "Rectangle{width=" + this.width + ", length=" + this.length + "}";
        }
    }


/*
2. Create a custom class named Rectangle with the following attributes and actions:

      Attributes:
            width (double): used for storing the width of the rectangle.
            length (double): used for storing the length of the rectangle.

      Actions:
            calculateArea(): calculates the area of the rectangle, and returns it as a double.
            calculatePerimeter(): calculates the perimeter of the rectangle, and returns it.
            toString(): returns a string representation of the rectangle object.


      Create another class named RectangleClients, create multiple rectangle objects, and test each function of the rectangle object.
 */