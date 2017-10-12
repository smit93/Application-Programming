public class MiddleAverage {
    public static void main(String[] args) {
        // write your solution here
        int value = 0;
        //int count = 0;
        int min = 99999;
        int max = 0;
        int sum = 0;
        System.out.print("Value: ");
        value = In.nextInt();
        int count = 1;
          if (value != -1){
              if (value < min){
                  min = value;
              }
          }
        
        while (value != -1){        
            sum += value;
            System.out.print("Value: ");
            value = In.nextInt();
            if (value > -1){
                count++;
              }
              if (value > max){
                  max = value;
              }
              if (value != -1){
              if (value < min){
                  min = value;
              }
          }
        }
		 if(count > 2){
		  double average = ((((double)sum-min-max)/(count-2)));
		  System.out.println("Middle average = " + average);
		 

}
}
}

		  