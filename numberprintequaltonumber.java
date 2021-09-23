// Hello this is Asif 
// in this code i make n=4
// print pattern like
//n=4
//1111
//2222
//3333
//4444



import java.util.Scanner;

public class numberprintequaltonumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i =1;
		while(i<=n) {
			int j =1;
			while(j<=n) {
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}
		

	}

}
