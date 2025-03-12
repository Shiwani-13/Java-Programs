package arrayconcept;

public class FindAverage {

	public static void main(String[] args) {
		 int number[]=new int[5];
		 int sum=0;
		 double avg =0;
		 number[0]= 35;
		 number[1]= 40;
		 number[2]= 45;
		 number[3]= 50;
		 number[4]= 55;
		 
		 for(int i =0;i<number.length;i++)
		 {
			 sum =sum + number[i];
		 }
         avg = sum/number.length;
         System.out.println("average of the given numbers is :- " + avg);

	}

}
