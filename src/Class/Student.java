package Class ;




class Student implements CourseOperations
{
	private String name ;
	private int sid ;
	private Course courses[] = new Course[50] ;
        
	public Student()
	{}
	public void setName(String name)
	{
		this.name = name  ;
	}
	public void setSid(int sid)
	{
		this.sid = sid ;
	}
	public String getName()
	{
		return name ;
	}
	public int getSid()
	{
		return sid ;
	}
	public void insertCourse(Course c)
        {
	    int count = 0;
		for(int i=0 ; i<courses.length ; i++){
			if(courses[i] == null){
				courses[i] = c ;
				count = 1;
				break;
			}
		}
		if(count == 1)
			System.out.println("Course Inserted Successfully");
		else
			System.out.println("Fatal Erorr! Can't insert any course");
	}	
        public void removeCourse(Course c)
        {
            
	    int count = 0;
		for(int i=0; i<courses.length; i++){
			if(courses[i] == c ){
				courses[i] = null ;
                                courses[i] = courses[i+1] ;
                                count = 1 ;
				break;
			}
		}
		if(count == 1)
			System.out.println("Course Removed");
		else
			System.out.println("Can Not Remove");
        }
	public Course getCourse(int CourseNumber) 
	{
           Course courses = null;
           return courses ;
	}
	public void showAllCourse() 
	{
            for(Course c : courses)
		{
			if(c != null)
			{
				System.out.println(c);
			}
		}
		
	}
	
}