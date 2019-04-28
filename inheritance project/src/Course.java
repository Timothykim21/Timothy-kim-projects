public class Course {
    private String name;
    private int grade;

    Course(){
        this.name = "course";
        this.grade = 0;
    }

    Course(String name, int grade){
        this.name = name;
        this.grade = grade;
    }
    public String toString(){
        return name + "\t" + grade;
    }
}
