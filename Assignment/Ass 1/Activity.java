import java.text.*;
public class Activity{
    
    private Subject subject;
    private String group;
    private int number;
    private String day;
    private int start;
    private int duration;
    private String room;
    private int capacity;
    private int enrolled;
    
    public Activity(Subject subject,String group,int number,String day,int start,int duration,
                    String room,int capacity){
                        
        this.subject = subject;
        this.group = group;
        this.number = number;
        this.day = day;
        this.start = start;
        this.duration = duration;
        this.room = room;
        this.capacity = capacity;
        enrolled = 0;
        
    }
    public String getSubject(){
      
        return "test";
    }
    
        public int subNumber(){
        return subject.subNumber();    
        
    }
    @Override
    public String toString(){
        return subNumber() + " " + group + " " + number +" " + day+ " "+ room + " " + formatted(start)
         +" " + duration + "hrs "+ enrolled + "/" + capacity;
    }
    
    private String formatted(int start){
    
        return new DecimalFormat("00").format(start) + ":00";
    }
   }