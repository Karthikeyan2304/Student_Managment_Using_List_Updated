package package_student_list.com;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
 class Students
 {
 int Stud_id;
String Stud_name;
int Stud_mark;
 
Students(int Stud_id,String Stud_name,int Stud_mark)
{
this.Stud_id=Stud_id;
this.Stud_name=Stud_name;
this.Stud_mark=Stud_mark;
}

public String toString() 
{
return "[" +Stud_id + "," +Stud_name+ "," +Stud_mark+ "]";
}

 }








public class Student_Management_Using_List 
{
	static Scanner sc=new Scanner(System.in);
 	static Collection <Students> al=new LinkedList<Students>();
    static  int  Stud_Num=1; 
   
	public static void main(String[] args)
	{
System.out.println("\n*************************Welcome Student Management App*************************\n");	
		
 
		boolean flag=true;
		while(flag)
		{
		System.out.println("Select Any Option:"
				+ "\n 1:To Add The Students Details"
				+ "\n 2:To Update The Student Details"
				+ "\n 3:To Remove Any Student From The Mark List"
				+ "\n 4:To See All The Students Details"
				+ "\n 5:Exit\n");
		
		
		int option=sc.nextInt();
		switch(option)
		 {
		
                           // Add Students		                      
		case 1:
		System.out.println("\nEnter The ID Of The Student:"+(Stud_Num));
	    int id=sc.nextInt();
		System.out.println("Enter The Name Of The Student:"+(Stud_Num));
		String name=sc.next();
		System.out.println("Enter The Mark Of The Student:"+(Stud_Num));
		int mark=sc.nextInt();    
	    System.out.println("\n**************Record Added Successfully**************\n");
	    al.add(new Students(id, name, mark));
	    Stud_Num=Stud_Num+1;
	    break;
	    
	    
	    
                              // Update The Student Mark	    
		case 2: updateStud(0);	break;	
		
		
		
                            //To Remove The Particular Student
		
		case 3:  RemoveStud(0);break;
		
		
		
                        //To Display All Students Details		                     

		case 4: showStudents();  break;
		
                           
		                    //Exit
		
	   case 5:System.out.println("\n***************Thanks For Using The App******************\n");
		flag=false; break;
		
	default:System.out.println("\n!!!!!!!!!!!!!!Invaild Input!!!!!!!!!!!!!\n");
		 }
		 }
	     }
	
	
                      // Update Method
	
	public static Boolean updateStud(int id) 
	{
		System.out.println("Enter the Student ID You Want To Update");
		id=sc.nextInt();
		
		Iterator<Students> i=al.iterator();	
		
		while(i.hasNext())
		{
		Students S=i.next();
		if(S.Stud_id==id)
		{
		System.out.println("Enter The new  mark");
		S.Stud_mark=sc.nextInt();
		System.out.println("\n*************Updated Successfully*************\n");
		return true;
		}
		}System.out.println("\n!!!!!!!!!!! ID Not Found !!!!!!!!!!!!\n");	return false;
		}
	    
	
                      // Remove Method	                   
	public static Boolean RemoveStud(int id) 
	{
		System.out.println("Enter the Student ID You Want To Remove");
		id=sc.nextInt();
		Iterator<Students> li=al.iterator();
		
		while(li.hasNext()) 
		{
		Students S=li.next();
		if(S.Stud_id==id)
		{
		al.remove(S);
		System.out.println("\n*************Removed Successfully*************\n");
		return true;
        }
		}System.out.println("\n!!!!!!!!!!! ID Not Found !!!!!!!!!!!!\n");return false;
	    }
	
	
                      // Method To Show All The Students Details
	
	public static void showStudents() 
	{
		Iterator<Students> s=al.iterator();
		while(s.hasNext())
		{
		System.out.println("\t"+s.next()+"\n");	
		} 	
	    }
        }



	
        
        
