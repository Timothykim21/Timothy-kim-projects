package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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

    public void writeToFile() throws IOException{
        FileWriter fw = new FileWriter("friend.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(username +", \r");
        bw.write(firstName+", \r");
        bw.write(lastName+"\r");
        bw.write("; \r");
        bw.close();

    }
}
