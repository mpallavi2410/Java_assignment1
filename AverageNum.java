/*Task 3-  Write a program to print the average of below 5 numbers.
	10,90.78,111,8989,7876*/

package iNeuron_Sept.Assignment1;

public class AverageNum {

	static double a=10,b=90.78,c=111,d=8989,e=7876;
	 
	public static void main(String[] args) {
		
		
		System.out.println("average of five number is " +avg(a,b,c,d,e));
	}
	public static double avg(double a,double b,double c,double d,double e) {
		
		
		return (a+b+c+d+e/5);
	}
	

}
