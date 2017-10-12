public class AverageValue {
	public static void main(String[] args) {
		// write your solution here
		int sum = 0;
		System.out.print("Value: ");
		int value = In.nextInt();
		int count = 1;
		while (value != -1){
		sum += value;
		System.out.print("Value: ");
		value = In.nextInt();
		if (value > -1){
		count++;
	}
	}
	double average = (double)sum / count;
	if(count > 1){
	System.out.println("Average = " + average);}
	}
}
