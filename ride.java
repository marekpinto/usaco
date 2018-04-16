
/*
ID: marek.p1
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;
public class ride {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("ride.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
        String comet = br.readLine();
        String group = br.readLine();
        int cometProduct = 1;
        int groupProduct = 1;
        for(int i = 0; i<comet.length(); i++){
            char letter = comet.charAt(i);
            int pos = letter - 'A' + 1;
            cometProduct = cometProduct * pos;
            
            
            
        }
        for(int i = 0; i<group.length(); i++){
            char letter = group.charAt(i);
            int pos = letter - 'A' + 1;
            groupProduct = groupProduct * pos;
            
            
            
        }
        
        if(groupProduct%47 == cometProduct%47){
            out.println("GO");
        }
        else{
            out.println("STAY");
        }
        out.close();
    }
}
