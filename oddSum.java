import java.util.Scanner;

public class oddSum {
    public static void oddsum(int n) {
		int count=0;
         for(int i=1;  i<=n; i++) {             
			if(i%2 !=0) {
			        count = count + i;    
			}
		}
			System.out.println(count);
			}
	      public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			int n=sc.nextInt();
			oddsum(n);
            sc.close();
		}	
}
