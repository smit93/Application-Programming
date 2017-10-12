public class AverageDays {
	public static void main(String[] args) {
		// Copy and write the tutor's solution here
		int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		int sum = 0;
		
		for(int i = 0; i < months.length; i++){
		    sum += months[i];
	}
	double avarage = (double)sum / months.length;
	System.out.println("Average days per month = " + avarage);}
}
