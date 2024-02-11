package day11_practice_task_clas_objects_part2;

public class CarpetClients {

    public static void main(String[] args) {

        Carpet carpet = new Carpet();
        carpet.width = 10.5;
        carpet.length = 15.0;
        carpet.isPersian = true;
        carpet.unitPrice = 3.0;
        System.out.println(carpet);
        Carpet carpet2 = new Carpet();
        carpet2.width = 10.5;
        carpet2.length = 15.0;
        carpet2.isPersian = false;
        carpet2.unitPrice = 3.0;
        System.out.println(carpet2);
    }
}


