import java.util.*;
import java.io.*;
public class Solution {
	public static void main(String args[]){
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
		for(int casee=1; casee<=t; casee++){
			int n=in.nextInt();
			in.nextLine();
			if(n>1){
				String []words= new String[n];
				int last[]=new int[n];
				for(int i=0; i<n; i++){
					words[i]=in.nextLine();
					char a=words[i].charAt((words[i].length())-1);
					last[i]=(int)a;
					
				}
				java.util.Arrays.sort(last);
				int c=1;
				int max=0;
				int checkValue=last[0];
				for(int i=1; i<n; i++){
					if(last[i]==checkValue)
						c++;
					else{
						checkValue=last[i];
						if(c>max){
							max=c;
						}
						c=1;
					}
				}
				if(c>max)
					max=c;
				if(max==1)
					System.out.println("Case #" + casee + ": " + 0);
				else
					System.out.println("Case #" + casee + ": " + max);
			}else{
				for(int i=0; i<n; i++){
					in.nextLine();
					System.out.println("Case #" + casee + ": " + 0);
				}
			}
		}
	}
}