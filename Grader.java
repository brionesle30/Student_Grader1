import java.util.Scanner;

public class Grader {
	
		int studentCounter; //assigning field variable
	
		public Grader(int n) {
			studentCounter = n;
		}	
			public int stuNo (int intX) {
		
				int num = intX;
				return num;
			}	
				public void grades(int mark) { // code to determine grade
			
					if (mark >=85)
						System.out.println("HD");
					else if (mark >=75)
						System.out.println("D");
					else if (mark >=65)
						System.out.println("C");
					else if (mark >=50)
						System.out.println("P");
					else
						System.out.println("F");
				}
				public boolean pass (int failed) {
				    if (failed<=49){
				        return true;
				    }
				    else
				    {
				        return false;
				    }
				}
						
					public static void main (String[] args)
					{
						// local variables declarations
						int pass = 0;
						int fail = 0;
						int max = 0;
						int min = Integer.MAX_VALUE;
						double total = 0;
						
			//welcome display		
			System.out.printf("Please enter only whole number and press enter!%n"); 
			
			//Creating new object for Grader
			Grader grObj = new Grader(10);
			int gradeCounter = grObj.stuNo(0);
			Scanner input = new Scanner(System.in);
			
			while (gradeCounter <= 9) //setting the loop counter to 10
			{
				
				gradeCounter++; //increment counter
				System.out.printf("%nMark for Student "+gradeCounter+": "); 
				int grading = input.nextInt(); //input and read grade
					
				// Convert the mark to letter Grade
				int mark = grading; 
				Grader grOb = new Grader(20);
				System.out.print("Grade Student "+gradeCounter+": ");
				grOb.grades(mark);
				
				// Calculate the number of student who passed and failed
				int failed = grading;
				Grader pasOb = new Grader(30);
				pasOb.pass(failed);
				
				if (failed<=49)	
						fail = fail + 1;
					else	
						pass = pass + 1;
				
				// Calculate the minimum and maximum input
				 if(grading > max)
					 max = grading;
	             if(grading < min)
	            	 min = grading;
	                
	         //declare total is equal to every grading inputs and them each
	         total = total + grading; 
		} 
			double average = total / 10;
			
			//display summary
			System.out.printf("%n*************** Summary Report*********************%n%n");
			System.out.printf("Lowest mark is: %d%n",  min);
        	System.out.printf("Highest mark is: %d%n",  max);
        	System.out.printf("Average Mark: %.2f%n", average);
			System.out.printf("Number passed: %d%nNumber failed:  %d%n", pass, fail);
			
			//display exit message
			System.out.printf("%nThis is the summary for 10 students.");
			
		}
		
		
} // Public class Grader end
