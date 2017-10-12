import java.util.*;
import java.text.*;
public class Student{
    
    private String name;
    private String number;
    
    private LinkedList<Activity> activities = new LinkedList<Activity>();   
    public Student(String number,String name){
        this.name = name;
        this.number = number;
        //this.activities = activities;
    }
    public String getNumber(){
        return number;
    }
    
    public void stuMenu(){
        char choice;
        while((choice = ReadChoice())!='x'){
            switch(choice){
               case 'v': stuView();break;
               case 'e': stuEnrol();break;
               case 'w': stuWithdraw();break;
               default: stuHelp();break;  
            }
            
        }
    }
       
      private void stuView(){
        for(Activity activity : activities)
        System.out.println(activity.getSubject());
    }
      private void stuEnrol(){
        System.out.println("Select a subject");
        System.out.println("48024 Applications Programming");
        System.out.println("31284 Web Services Development");
        System.out.println(activities.size());
        int n = readNumber();
          for(Activity activity : activities)
        
            System.out.println(activity.getSubject());
        
    }
      private void stuWithdraw(){
        
    }
    private void stuHelp(){
        System.out.println("Student menu options");
        System.out.println("v = view my activities");
        System.out.println("e = enrol in an activity");
        System.out.println("w = withdraw from an activity");
        System.out.println("x = exit");
    }
     
    private char ReadChoice(){
        System.out.print("Choice (v/e/w/x): ");
        
        return In.nextChar();
    }
    private int readNumber(){
        System.out.print("Subject number: ");
        return In.nextInt();
    }
     @Override
    public String toString(){
        return number + " " + name;
    }
}