// print character 
// n =4;
//ABCD
//BCDE
//CDEF
//DEFG

import java.util.Scanner;

public class characterpattern1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i<=n){
            int j = 1;
            char counter = (char)('A' +i-1);
            while(j<=n){
                System.out.print(counter);
                counter =(char)(counter+1);
                j++;
            }
            System.out.println();
        	i++;
        }
	}

}
