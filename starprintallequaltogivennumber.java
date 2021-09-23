// Hello this is Asif 
// in this code i make n=5

// print N no of rows and coloums 
// ****
// ****
// ****
// ****



import java.util.Scanner;
public class starprintallequaltogivennumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i =1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print("*");
				j = j+1;
			}
			i = i+1;
			System.out.println();
			
		}
		
		

	}

}
