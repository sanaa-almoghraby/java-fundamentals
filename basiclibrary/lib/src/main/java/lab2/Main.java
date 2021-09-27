package lab2;

public class Main {
    public static void main(String[] args) {

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[] arr = {1, 2, 3, 4, 5, 6};

        Library demo = new Library();
        demo.roll(5);
        System.out.println(demo.containsDuplicates(arr));
        System.out.println(demo.Average(arr));
        System.out.println(demo.arraysLowestAav(weeklyMonthTemperatures));
    }


}
