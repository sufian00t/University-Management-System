
package Class;

import java.io.*;



class University implements StudentOperations,FacultyOperations
{
	private Faculty faculties[] = new Faculty[50];
	private Student students [] = new Student [50] ;	
	
	public void setStudent(Student s)
	{
	    Student students = s ;	 
	}	
	public void getStudent(int sid) 
        {
            System.out.println();
	}	
	 public void insertStudent(Student s) 
	{
             int count = 0 ;
             for(int i=0; i<students.length; i++){
			if(students[i] == null){
				students[i] = s ;
				count = 1;
				break;
			}
		}
		if(count == 1)
			System.out.println("Student has been Inserted Successfully");
		else
			System.out.println("Fatal Erorr!");
	}
	public void removeStudent(Student s)
	{
		int count = 0;
		for(int i=0; i<students.length; i++){
			if(students[i] == null){
				students[i] = s ;
				count = 1;
				break;
			}
		}
		if(count == 1)
			System.out.println("Student Inserted Successfully");
		else
			System.out.println("Can Not Insert");
	}
	public void showAllStudents()
	{
	   for(Student s : students){
			System.out.println(s);
		}
	}
	public void setFaculty(Faculty e)
	{
	   Faculty faculties = e ;
	}
	
	public void getFaculty(String fid)
	{
		this.faculties = faculties ;
	}
	public void insertFaculty(Faculty e)
	{
            int count = 0;
		for(int i=0; i<faculties.length; i++){
			if(faculties[i] == null){
				faculties[i] = e ;
				count = 1 ;
				break ;
			}
		}
		if(count == 1)
			System.out.println("Faculty Inserted Successfully");
		else
			System.out.println("Can't make this operation! Try again");
	}
	public void removeFaculty(Faculty e)
	{
		int count = 0;
		for(int i=0; i<faculties.length; i++)
                {
			if(faculties[i] == null)
                        {
				faculties[i] = e ;
				count = 1 ;
				break;
			}
		}
		if(count == 1)
			System.out.println("Faculty Inserted");
		else
			System.out.println("Can Not Insert");
	}
	public void showAllFaculty()
	{
              
		for(Faculty e : faculties){
			System.out.println(e);
		}
               
                
	}

	
}
