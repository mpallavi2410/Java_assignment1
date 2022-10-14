//Write a program which will break the current execution if it find “Selenium”
	//Input – [“Java”,”JavaScript”,”Selenium”,”Python”,”Mukesh”]

package iNeuron_Sept.Assignment1;

public class Task10 {

	public static void main(String[] args) {
		String input[]= {"Java","JavaScript","Selenium","Python","Mukesh"};
		
		   
		   
		for(int i=0;i<input.length;i++)
		{
			
			if (input[i]=="Selenium")
			{
			
				  break;
			}
				  System.out.println(input[i]);
				}
		
			

	}

}
