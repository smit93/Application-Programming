import java.util.*;
import java.text.*; 
public class Subject{
    
    private int number;
    private String name;
    private LinkedList<Activity> activities = new LinkedList<Activity>();


public Subject(int number,String name){
    this.number = number;
    this.name = name;
    
    this.activities = activities;
     /**/
     
}
public void addActivity(String group,int number,String day,int start,int duration,
                    String room,int capacity){
                        activities.add(new Activity(this,group,number,day,start,
                        duration,room,capacity));
                    }
    public int subNumber(){
        return number;
    }
    
    public void selectActivity(){
      String act = readActivity();
      String[] words = act.split(":");
      String number = words[1];
      String group = words[0];
      //Activity a = null;
      int count = 0;
      for(Activity activity : activities){
          if(activity.matches(group,number)){
              //System.out.println("selected");
              //Activity a = activity.selected();
        }
        else count++;
        }
        if(count == activities.size())
            System.out.println("No such activity");
           
    
}
  
    private String readActivity(){
        System.out.print("Activity code (group:activity): ");
    
        return In.nextLine();
    }
    public void showActivity(){
        System.out.println("Select an activity");
        for(Activity activity : activities)
        System.out.println(activity.toString());
    }
 @Override
    public String toString(){
        return number + " " + name;
    }
}
