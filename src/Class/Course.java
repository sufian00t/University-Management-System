
package Class;

   

class Course implements CourseTransactions
{
	private int courseNumber ;
	private int credit ;
	Course()
	{}
	public void setCourseNumber(int courseNumber)
	{
		this.courseNumber = courseNumber ;
	}
	public void setCredit(int credit)
	{
		this.credit = credit ;
	}
	public int getCourseNumber()
	{
		return courseNumber ;
	}
	public int getCredit()
	{
		return credit ;
	}
	void showinfo()
	{
	   System.out.println("Course Number : "+getCourseNumber()) ;
           System.out.println("Credit : "+getCredit()) ;
	}
        
	public void adding(int quantity) 
	{
	     if(quantity>=0){
			System.out.println("Added Course : "+quantity);
			credit=quantity*credit ;
			System.out.println("Added Credit : "+credit);
		}
		else{
			System.out.println("Unable to add any courses");
		}
	}
	public void dropping(int quantity)
	{
	   if(quantity>0 && quantity<=credit){
			System.out.println("Dropped Courses :"+quantity);
			 credit = credit/quantity ;
			System.out.println("Remained Course :"+credit);
		}
		else{
			System.out.println("Unable to drop any course");
		}
	}	 
}