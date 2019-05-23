import java.util.ArrayList;

public class Student extends Person{
    int sID;
    ArrayList<Course> learn = new ArrayList<>();

    Student(int age, String Fname, String Lname){
        super(age, Fname, Lname);
        this.sID += 10002;
    }

    public int getsID(){
        return sID;
    }

    public void sList() {
        for(Course c: learn) {
            System.out.println(c);
        }
    }

    public void addSCourse(Course c) {
        learn.add(c);
    }

    public void removeSCourse(Course c) {
        learn.remove(c);
    }
}
