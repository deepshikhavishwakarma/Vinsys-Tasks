import java.util.Scanner;

public class avg {
    public static void average() {
	Scanner sc = new Scanner(System.in);
	 System.out.println("Enter your value a");
	 float a = sc.nextFloat();
	 System.out.println("Enter your value b");
	 float b = sc.nextFloat();
	 System.out.println("Enter your value c");
	 float c = sc.nextFloat();
	 
	 System.out.println("Total average is : "+((a+b+c)/3));
     sc.close();
	}
	
 public static void main(String[] args) {
	 
	 avg.average();
 }
}
