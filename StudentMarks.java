/*Write a program to print below students marks who have scored above 70
	Example- 78,12,89,55,35
	Output-  78,89 */

package iNeuron_Sept.Assignment1;

public class StudentMarks {

	public static void main(String[] args) {
		
		int[] marks= {78,12,89,55,35};

		String [] Studnames= {"Asha","Pallavi","Abhi","Rani","Ravi"};
		
		   
				for(int i=0;i<marks.length;i++)
				{
					
					if (marks[i]>70)
					{
					
						  
					
						  System.out.println(Studnames[i]);
						}
				}
	}
}
					

			

		


