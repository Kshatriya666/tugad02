import connect.Database;
import campud.Teacher;
import campud.Student;
import campud.Subject;

public class Main{
 public static void main(String [] args){
  System.out.println("Main Program");
  Database.connecting();
  Teacher.showInfo();
  Student.showInfo();
  Subject.showInfo();
 }
}
