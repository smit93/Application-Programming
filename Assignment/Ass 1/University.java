import java.util.*;
import java.text.*;
public class University{
    public static void main(String[] args){
        
        new University().use();
    }
    
    private LinkedList<Subject> subjects = new LinkedList<Subject>();
    private LinkedList<Student> students = new LinkedList<Student>();
    
    public University(){
       
        subjects.add(new Subject(48024,"Application Programming"));
        //Subject subject = new Subject(48024,"Application Programming");
            subjects.get(0).addActivity("Lec1",1,"Wed",18,1,"CB11.00.405",200);
            subjects.get(0).addActivity("Cmp1",1,"Wed",19,2,"CB11.B1.403",2);
            subjects.get(0).addActivity("Cmp1",2,"Wed",19,2,"CB11.B1.401",2);
            subjects.get(0).addActivity("Cmp1",3,"Wed",19,2,"CB11.B1.402",2);
        subjects.add(new Subject(31284,"Web Service Development"));
     
          subjects.get(1).addActivity("Lec1",1,"Tue",16,1,"CB02.03.002",160);
          subjects.get(1).addActivity("Cmp1",1,"Tue",9,2,"CB11.B1.102",30);
          subjects.get(1).addActivity("Cmp1",2,"Tue",9,2,"CB11.B1.103",30);
          subjects.get(1).addActivity("Cmp1",3,"Tue",14,2,"CB11.B1.102",30);
          subjects.get(1).addActivity("Cmp1",4,"Tue",14,2,"CB11.B1.103",30);
        
         
}
    public void use(){
        char choice;
        while((choice = uniReadChoice())!='x'){
            switch(choice){
               case 'a': add();break;
               case 'r': remove();break;
               case 'v': view();break;
               case 'l': login();break;
               default: uniHelp();break;  
            }
            
        }
        
    }
    
    private void add(){
        int count = 0;
        String number = readNumber();
        for(Student student : students)
          if(student.getNumber().equals(number)){
              System.out.println("Student number already exists");
            }
            else
                count++;
                    if(count == students.size()){
                            String name = readName();
                            students.add(new Student(number,name));
            }
        
        
    }

      
    private void remove(){
        int count = 0;
        String number = readNumber();
        for(Student student : students)
         if(student.getNumber().equals(number))
         {
              students.remove(student);   
              count = 0;
              break;
            }
            else
            count++;
                
            if(count==students.size()){
                 System.out.println("No such student");
                 
                }
    }
      
    private void view(){
        for(Student student : students)
        System.out.println(student.toString());
        
    }
      
    private void login(){
            int count = 0;
        String number = readNumber();
        for(Student student : students)
          if(student.getNumber().equals(number)){
              student.stuMenu();
            }
            else
                count++;
             if(count==students.size()){
                 System.out.println("No such student");
                 
                }
            
    }
    
    private void uniHelp(){
        System.out.println("University menu options");
        System.out.println("a = add a student");
        System.out.println("r = remove a student");
        System.out.println("v = view all students");
        System.out.println("l = login");
        System.out.println("x = exit");
    }
      private char uniReadChoice(){
        System.out.print("Choice (a/r/v/l/x): ");
        return In.nextChar();
    }
    private String readNumber(){
        System.out.print("Number: ");
        return In.nextLine();
    }
    private String readName(){
        System.out.print("Name: ");
        return In.nextLine();
    }
 
}