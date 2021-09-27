import java.time.LocalDateTime;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");


        flipNHeads(2);
        clock();

    }

    public static String pluralize(String anmName, int num) {
        if (num == 0 || num > 1) {
            return anmName + "s";
        }else if (num==1){
             return (anmName);
        }
        return anmName;
    }
    public static void flipNHeads(int n) {

        int count = 0;
        int headsCount= 0;

        while (headsCount <= n) {
            Random random = new Random();
            if (random.nextDouble() < 0.5) {
                System.out.println("Tail");
                count++;
                headsCount = 0;


            } else if((random.nextDouble() > 0.5)){
                System.out.println("Heads");
                count++;
                headsCount++;

            }

        }

        System.out.println("It took " + count + " flips to flip " + headsCount + " heads in a row.");

    }
    public static void clock(){
        while (true){
            LocalDateTime now=LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();
            System.out.println(hour+":"+minute+":"+second);

        }
    }


}