//Write a program which will break the current execution if it find number 85
	//Input – [12,34,66,85,900]

package iNeuron_Sept.Assignment1;

public class Task9 {

	public static void main(String[] args) {
   int numbers[]= {12,34,66,85,900};
		
   
   
		for(int i=0;i<numbers.length;i++)
		{
			
			if (numbers[i]==85)
			{
			
				  break;
			}
				  System.out.println(numbers[i]);
				}
		
			
			
		}
		

	}

