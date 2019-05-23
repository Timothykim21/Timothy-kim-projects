public class Main {
    public static void main(String[] args) {
        Teacher kyle = new Teacher(30, "Kyle","Tan");
        Student tim = new Student(16,"Timothy","Kim");
        Course c = new Course("Chem",0);
        Course e = new Course("Programming",12);

        tim.addSCourse(c);
        tim.addSCourse(e);
        tim.removeSCourse(c);
        System.out.println(tim.getName());
        System.out.println(tim.getsID());

        kyle.addTCourse(c);
        kyle.addTCourse(e);
        kyle.removeTCourse(c);
        kyle.tList();
        System.out.println(kyle.getName());
        System.out.println(kyle.geteID());

    }
}
