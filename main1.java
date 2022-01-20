package exercise1.OOP;
import java.util.Scanner;

public class main1
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        College c1=new College("College Gurion", 2);

        // (name,numOfTimesPenFalls,favoriteIceCream)
        c1.addLecturer(new Lecturer("Amit", 6,"Vanilla"));
        c1.addLecturer(new Lecturer("Almog", 4, "Chocolate"));

        System.out.println(c1.toString());

        c1.sortByNumOfTimesPenFalls();
        System.out.println("After sorting " + c1.getName() + "'s lecturers by the number of times their pen fell: \n");

        System.out.println(c1.toString());
    }
}
