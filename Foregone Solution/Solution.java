import java.util.*;
import java.io.*;

import java.lang.Math;
import java.util.Scanner;
class ForegoneSolution{
	boolean checkFour(int val1, int val2){
		while(val1!=0 || val2!=0){
			if(val1%10==4)
				return false;
			if(val2%10==4)
				return false;
			val1=(int)val1/10;
			val2=(int)val2/10;
		}
		return true;
	}
	int [] getSolution(int A, int B){
		if(this.checkFour(A,B)){
			return new int[]{A,B}; 
		}else{
			int random;
			random=(int )(Math.random() * A);
			A-=random;
			B+=random;
			random=(int )(Math.random() * B);
			A+=random;
			B-=random;
			return this.getSolution(A,B);
		}
	}	
}

public class Solution {
      public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
		int [] ans;
		for (int i = 1; i <= t; ++i) {
          int n = in.nextInt();
		  if(n%2==0)
			  ans=new ForegoneSolution().getSolution(n/2,n/2);
		  else
			  ans=new ForegoneSolution().getSolution(n/2,(n/2)+1);
          System.out.println("Case #" + i + ": " + ans[0] + " " + ans[1]);
        }
      }
    }
