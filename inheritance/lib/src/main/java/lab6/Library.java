/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab6;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        System.out.println("hiiiiiiiiiiiiiiiiiiiii" + "");

        Restaurant newRest = new Restaurant("sanaa", "$");
        System.out.println(newRest);


        Review visitor= new Review("good","sanaa",5);
        Review visitor1= new Review("good","aaa",5);
        Review visitor2= new Review("good","dddd",5);
        newRest.addRive(visitor);
        newRest.addRive(visitor1);
        newRest.addRive(visitor2);

        System.out.println(newRest);
    }
}
