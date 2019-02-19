package sample;

public class Friend {
    public String username;
    public String firstName;
    public String lastName;

    Friend(String username, String FN, String LN){
        firstName = FN;
        lastName = LN;
        this.username = username;
    }

public String getFirstName(){
        return firstName;
}
public String getLastName(){
        return lastName;
}
public String getUsername(){
        return this.username;
}
public String toString(){
        return username;
}
}
