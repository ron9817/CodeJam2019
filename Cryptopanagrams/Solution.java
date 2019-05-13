//prime
import java.lang.Math; 
import java.util.*;
import java.io.*;
class Prime{
	boolean checkPrime(int val){
		for(int i=2; i<=(int)Math.sqrt(val); i++){
			if(val%i==0)
				return false;
		}
		return true;
	}
}

class Decrypt{
	String getD(int n, intl, int[]c){
		Prime p=new Prime();
		int j;
		int []d=new int[l+1];
		
		for(int i=n; i>1; i--){//randomise
			if(p.checkPrime(i)){
				System.arraycopy( c, 0, d, 1, c.length );
				d[0]=i;
				for(j=1;j<=l;j++){
					if(p.checkPrime((int)d[j]/d[j-1])){
						d[j]=(int)d[j]/d[j-1];
					}else{
						break;
					}
				}
				if(j==l+1)
					break;
			}				
		}
		//sort d in e
		int[]e=d.clone();
		java.util.Arrays.sort(e);
		String ans="";
		for(int i=0;i<=l;i++){
			int pos=java.util.Arrays.binarySearch(e,d[i]);
			char vall=(char)(pos+65);
			ans+=vall;
		}
	}
}

class Solution{
	public static void main(String args[]){
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t=in.nextInt();
		String ans;
		for(int tt=1; tt<=t; tt++){
			int n=in.nextInt();
			int l=in.nextInt();
			int []c=new int[l];
			for(int input=0; input<l; input++){
				c[input]=in.nextInt();
			}
			ans=new Decrypt.getD(n,l);
			System.out.println("Case #" + tt + ": " + ans);
		}
	}
}

/*class Solution{
	public static void main(String args[]){
		Prime p=new Prime();
		int c=0;
		for(int i=10000; i>1; i--){
			if(p.checkPrime(i)){
				c++;
				System.out.println(c+":- "+i);
			}
		}
	}
}*/