// Written By Asif Hossain 28th SEP 2021.
//Print the following pattern for given number of rows.
//Input format :
//Integer N (Total number of rows)
//Output Format :
//Pattern in N lines
//Sample Input :
//   5
//Sample Output :
// 5432*
// 543*1
// 54*21
// 5*321
// *4321






import java.util.Scanner;
public class testexam3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int i =1;
        int y=n;
         for(i=1;i<=y;i++){
            int k= n;
            int z=n; 
            for(int j=1;j<=k;j++){
                if(i==z){
                    System.out.print("*");
                    z--;

                }else{
                    System.out.print(z);
                    z--;

                }
            }
            System.out.println();
			
        }


	}

}
