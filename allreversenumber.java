// print pattern 
// n=4
//4321
//4321
//4321
//4321


import java.util.Scanner;

public class allreversenumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i =1;
		while(i<=n) {
			int j =1;
			while(j<=n) {
				int val = (n-j) +1;
				System.out.print(val);
				j++;
			}
			System.out.println();
			i++;
		}
		

	}

}
