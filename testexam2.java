// Written By Asif Hossain 28th SEP 2021.
// Written By Asif Hossain.
//Print the following pattern
//Pattern for N = 4
//*000*000*
//0*00*00*0
//00*0*0*00
//000***000
//Input Format :
//N (Total no. of rows)
//Output Format :
//Pattern in N lines
//Sample Input 1 :
//3
//Sample Output 1 :
//*00*00*
//0*0*0*0
//00***00
//Sample Input 2 :
//5
//Sample Output 2 :
//*0000*0000*
//0*000*000*0
//00*00*00*00
//000*0*0*000
//0000***0000
import java.util.Scanner;

public class testexam2 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int i = 1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				if(j==i) {
				System.out.print("*");
				j++;
			}else {
				System.out.print(0);
				j++;
			}
			}
			j=1;
			while(j<=n-i) {
				System.out.print(0);
				j++;
			}
			if(i==i) {
				System.out.print("*");
				
			}
			j=1;
			while(j<=n-i) {
				System.out.print(0);
				j++;
			}
			j=1;
			while(j<=i) {
				if(j==i) {
				System.out.print("*");
				j++;
			}else {
				
				j++;
			}
			}
			j=2;
			while(j<=i) {
				System.out.print(0);
				j++;
			}
			i++;
			System.out.println();
		}

	}

}
