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
    public String getGroup(){
        return group;
    }
    public int getNumber(){
        return number;
    }

    public boolean canEnrol(int i){
        return capacity>=i;
    }
    
    public boolean matches(String g,String n){
        boolean i = false;
        boolean j = false;
        if(g.equals(getGroup()))
        i = true;
        if(n.equals(""+getNumber()))
        j =true;
        if(i&&j)
        return true;
        else
        return false;
}
    public Activity selected(){
        return this;
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