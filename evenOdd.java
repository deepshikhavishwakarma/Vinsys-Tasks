import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter any number");
	  int n= sc.nextInt();
	  if(n%2==0) {
		  System.out.println("Number is even"); //2,4,6,8,10 are all even numbers
	  }else {
		  System.out.println("Number is odd");//1,3,5,7,9,11 are all odd numbers
	  }
      sc.close();
  }
}
