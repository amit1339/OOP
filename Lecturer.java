package exercise1.OOP;

import java.util.Scanner;

public class Lecturer
{
    private String name;
    private int numOfTimesPenFalls;
    private String favoriteIceCream;
    private static int idCounter=1000;
    private int id;

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getNumOfTimesPenFalls()
    {
        return this.numOfTimesPenFalls;
    }

    public void setNumOfTimesPenFalls(int numOfTimesPenFalls)
    {
        this.numOfTimesPenFalls = numOfTimesPenFalls;
    }

    public String getFavoriteIceCream()
    {
        return this.favoriteIceCream;
    }

    public void setFavoriteIceCream(String favoriteIceCream)
    {
        this.favoriteIceCream = favoriteIceCream;
    }

    public int getId()
    {
        return this.id;
    }

    public Lecturer(String name,int numOfTimesPenFalls,String favoriteIceCream)
    {
        this.name=name;
        this.numOfTimesPenFalls=numOfTimesPenFalls;
        this.favoriteIceCream=favoriteIceCream;
        id=idCounter++;
    }

    public Lecturer (Lecturer other)
    {
        this(other.name,other.numOfTimesPenFalls,other.favoriteIceCream);
    }

    public Lecturer ()
    {

    }

    public String toString()
    {
        StringBuffer stringLecturer=new StringBuffer( "ID: " + id  + ", Name: " + name + ", Favorite Ice-Cream: " + favoriteIceCream + ", Number of times pen fell: " + numOfTimesPenFalls);
        return stringLecturer.toString();
    }

    public Lecturer(Scanner s)
    {


        this.name = s.nextLine();
        this.numOfTimesPenFalls = Integer.parseInt(s.nextLine());
        this.favoriteIceCream = s.nextLine();
        this.id  =Integer.parseInt(s.nextLine()) ;
    }
}