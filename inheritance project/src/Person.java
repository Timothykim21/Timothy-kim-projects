public class Person{
    private int age;
    private String Fname;
    private String Lname;

    public Person() {
        this.age = 0;
        this.Fname = "First";
        this.Lname = "Last";
    }

    public Person(int age, String Fname, String Lname){
        this.age = age;
        this.Fname = Fname;
        this.Lname = Lname;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return Fname + "\t" + Lname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFname(String fName) {
        this.Fname = fName;
    }

    public void setLname(String lName) {
        this.Lname = lName;
    }
}
