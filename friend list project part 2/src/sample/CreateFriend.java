package sample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CreateFriend {
    private static username;
    private static firstName;
    private static lastName;
    private static FileReader fr;
    private static BufferedWriter br;
    private static ArrayList<Friend> friends = new ArrayList<>();

    public static ArrayList creatAllProducts(String fileName) throws IOException{
        fr = new FileReader(fileName);
        br = new BufferedReader(fr);
        String line;
        String friendString = "";


    }
}
