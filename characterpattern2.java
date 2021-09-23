// print pattern character and integer
// n=5
//12345
//ABCDE
//23456
//BCDEF
//34567


import java.util.Scanner;
public class characterpattern2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i =1;
		int num=1;
		char character ='A';
		while(i<=n) {
			int j=1;
			char pt = character;
			if(i%2==0) {
			while(j<=n){
				System.out.print(pt);
				pt = (char)(pt+1);
				j++;
			}
			character = (char) (character+1);
			}
			else{
				int valu = num;
				while(j<=n){
					
					System.out.print(valu);
					valu = valu+1;
					j++;
			}
				num = num+1;
			}
			
			System.out.println();
			i++;
		}
	}

}
