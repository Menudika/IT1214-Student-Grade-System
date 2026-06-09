import java.util.Scanner;
class Student{
    private int studentID;
    private String studentName;
    private double marks;

    Student(int studentID,String studentName,double marks){
        this.studentID=studentID;
        this.studentName=studentName;
        this.marks=marks;
    }

    
    public int getStudentID(){
        return studentID;
    }

    public String getStudentName(){
        return studentName;
    }

    public double getMarks(){
        return marks;
    }

    
    public void setStudentID(int studentID){
        this.studentID=studentID;
    }

    public void setStudentName(String studentName){
        this.studentName=studentName;
    }

    public void setMarks(double marks){
        this.marks=marks;
    }


}

public class Main {
    public static void main (String arg[]){
    System.out.println("Welcome to Student Grade Management System!");

    ArrayList<Student> studentList=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    Scanner sc1=new Scanner(System.in);

    int choice;

    do{
        System.out.println("\n================= Student Grade Management System =========================");
        
        System.out.println("1.Add New Student Recode");
        System.out.println("2.View All Student Records");
        System.out.println("3.Search Student by ID");
        System.out.println("4.Calculate Average Marks");
        System.out.println("5.Exit");

        System.out.println("\nEnter your choice 1-5 :");
        choice= sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("");
                System.out.println("1.Add New Student Recode");
                System.out.println("Enter Student ID : ");
                int id = sc1.nextInt();   

                sc1.nextLine();

                System.out.println("Enter Student Name : ");
                String name=sc1.nextLine();

                System.out.println("Enter Student Marks : ");
                double marks=sc1.nextDouble();

                Student st = new Student(id,name,marks);
                studentList.add(st);

                System.out.println("Student record added successfully!");
                break;

            case 2:
               
			   
            case 3:
                
				
            case 4:
                
            
            case 5:
                   
        }

    }while(choice !=5);


    }
}