import java.util.Scanner;

public class rank {

    public static void avg() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Five numbers");
		 float a = sc.nextFloat();
		 float b = sc.nextFloat();
		 float c = sc.nextFloat();
		 float d = sc.nextFloat();
		 float e = sc.nextFloat();
		 float avg =(a+b+c+d+e)/5;
		 System.out.println("Avg is: "+avg);
		 
		 if ( avg  >= 75) {
			 System.out.println("Passed with 1st rank");
		 }
		 else if (avg >= 55) {
			 System.out.println("Passed with 2nd rank");  
		 }
		 else {
			 System.out.println("Passed with 3rd rank");  
		 }
         sc.close();
	}
  public static void main(String[] args) {
	  //Scanner sc = new Scanner(System.in);
	   rank.avg();
       
  }
}