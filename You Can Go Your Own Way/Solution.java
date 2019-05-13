import java.util.*;
import java.io.*;
public class Solution {
      public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        int c=1;
		while (--t!=0) {
          long n = in.nextLong();
		  in.nextLine();
		  String p= in.nextLine();
		  String ans="";
		  int j;
		  int length=p.length();
		  for(j=0;j<length;j++){
		      ans+=p.charAt(j)=='E'?"S":"E";
		  }
          System.out.println("Case #" + c + ": " + ans);
          c++;
        }
      }
    }