import java.io.*;
import java.util.*;

public class String_token {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if(!scan.hasNext())
        {
            System.out.println(0);
            return;
        }
        String s = scan.nextLine().trim();
        if(s.isEmpty())
        {
            System.out.println(0);
            return;
        }
        
        String [] res=s.split("[^A-Za-z]+");
        int n=res.length;
        System.out.println(n);
        
        for(String token:res)
        {
            System.out.println(token);
        }
        // Write your code here.
        scan.close();
    }
}

