
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        HashSet<String> word = new HashSet<>();
        FileReader fr = new FileReader("illiad.txt");
        BufferedReader br = new BufferedReader(fr);
        String Sen;
        while((Sen = br.readLine()) != null){
            String [] temp = Sen.split(".,:;\"'()!?-");
            for(String s: temp){
                s = s.toLowerCase();
                if(s.contains("\'")){
                    if(s.indexOf("\'")== 0 ){
                        s = s.substring(1);
                    }
                    if(s.indexOf("\'") == s.length()){
                        s=s.substring(0,s.length()-1);
                    }
                }
                word.add(s);
            }
        }
        for(String s:word){
            System.out.println(s);
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("Number of unique words: " + word.size());
        br.close();
    }
}
