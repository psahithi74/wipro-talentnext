package java_fundamentals;
import java.util.*;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number>0) {
			System.out.println(number +" is a positive number ");
		}
		else if(number <0) {
				System.out.println(number +" is a negative number");
		}
		else {
			System.out.println("number is zero");
		}

	}

}
