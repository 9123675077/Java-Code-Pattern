//// Hello this is Asif 
// in this code i make n=4
//4
//
//1 
//23 
//345 
//4567 


package pattern;

import java.util.Scanner;
public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int i=1;
		while(i<=n) {
			int j = i;
			while(j<=i+(i-1)) {
			System.out.print(j);
			j = j+1;
			}
			System.out.println(" ");
			i=i+1;
		}
		
	}

}
