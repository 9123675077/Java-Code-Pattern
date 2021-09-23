// Hello this is Asif 
// in this code i make n=5
//1
//21
//321
//4321
//54321



import java.util.Scanner;
public class reverseprintgivennumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i<=n){
            int j = 1;
            int counter = i;
            while(j<=i){
                System.out.print(counter);
                counter--;
                j++;
            }
            System.out.println();
        	i++;
        }

	}

}
