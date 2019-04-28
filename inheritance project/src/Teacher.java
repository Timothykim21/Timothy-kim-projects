import java.util.ArrayList;

public class Teacher extends Person {
    private static int eID = 1;
    private int tempID;
    ArrayList<Course> teach = new ArrayList<>();

    Teacher(int age, String Fname, String Lname){
        super(age, Fname, Lname);
        this.tempID = eID;
        eID++;
    }

    public int geteID(){
        return tempID;
    }

    public void tList(){
        for(Course c: teach){
            System.out.println(c);
        }
    }

    public void addTCourse(Course c){
        teach.add(c);
    }
    public void removeTCourse(Course c){
        teach.remove(c);
    }
}
