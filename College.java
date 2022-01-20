package exercise1.OOP;

import java.util.Scanner;

public class College
{
    private String name;
    private int numOfLecturers;
    private Lecturer[] allLecturers;
    private int maxLecturers;

    public College(String name,int maxLecturers)
    {
        setName(name);
        numOfLecturers=0;
        allLecturers=new Lecturer[maxLecturers];
    }

    public College(College other)
    {
        this.name = other.name;
        this.numOfLecturers = other.numOfLecturers;
        this.allLecturers = other.allLecturers;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getNumOfLecturers()
    {
        return this.numOfLecturers;
    }

    public void setNumOfLecturers(int numOfLecturers)
    {
        this.numOfLecturers = numOfLecturers;
    }

    public void SetallLecture(Lecturer []  allLecturers, int MaxL)
    {
        if(allLecturers != null)
        {
            if(allLecturers != this.allLecturers)
            {

                this.allLecturers = null;
                this.allLecturers = allLecturers;
                this.numOfLecturers = 0;
                this.maxLecturers = MaxL;
            }
        }
    }

    public int getMaxLecturers()
    {
        return allLecturers.length;
    }

    public Lecturer [] GetArrayallLecturers()
    {
        return this.allLecturers;
    }

    public College(Scanner s)
    {
        this.name = s.nextLine();
        int lengtharr = s.nextInt();
        this.numOfLecturers = lengtharr;
        this.allLecturers = new Lecturer[lengtharr];
        s.nextLine();
        for(int i = 0 ; i<=this.allLecturers.length-1;i++)
        {
            this.allLecturers[i] = new Lecturer(s);
        }
    }

    public String toString()
    {
        StringBuffer stringCollege = new StringBuffer("Name of college: " + name + ", Number of lecturers: " + numOfLecturers + ". \n");
        stringCollege.append("These are the details of lecturers in " + getName() + ": \n");
        for (int i = 0; i < numOfLecturers; i++) {
            stringCollege.append( (i+1) + ") " + allLecturers[i].toString() + ". \n");
        }
        return stringCollege.toString();
    }

    public boolean addLecturer(Lecturer lct)
    {
        if(lct != null)
        {
            for(int i = 0 ; i<=this.allLecturers.length-1; i++)
            {
                if(this.allLecturers[i] == null)
                {
                    this.allLecturers[i] = lct;
                    this.numOfLecturers++;
                    System.out.println("Adding Lecturer Succesfully");
                    return true;
                }
            }
            System.out.println("dont have empty space in college");
            return false;
        }
        else
        {
            System.out.println("dont have empty space in college");
            return false;
        }
    }

    public void swap(Lecturer[] allLecturers, int a, int b)
    {
        Lecturer tempLecturer=allLecturers[a];
        allLecturers[a]=allLecturers[b];
        allLecturers[b]=tempLecturer;
    }

    public void sortByNumOfTimesPenFalls()
    {
        for (int i = 0; i < numOfLecturers; i++)
        {
            for (int j = 0; j < numOfLecturers-1; j++)
            {
                if (allLecturers[j].getNumOfTimesPenFalls() > allLecturers[j+1].getNumOfTimesPenFalls())
                    swap(allLecturers, j, j+1);
            }
        }
    }
}