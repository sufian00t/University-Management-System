package Class;


import java.util.* ;




class Main

{
   
      
	public static void main(String[]args)
                
	{   Faculty f1 = new Faculty() ;
            University u1 = new University() ;
            while(true)
            {  
                  System.out.println("1 . Faculty Management\n2 . Student Management\n3 . Course Transactions\n4 . Exit") ;
		   
		   Scanner input=new Scanner(System.in);
		   int num ;
                  
		   num = input.nextInt();
		   switch(num)
                   {
                       case 1:
                       {
		            System.out.print("1 . Insert New Faculty\t 2 . Remove Existing faculty\t 3 . Show All Faculty\t 4 . Going Back\t") ;
		            Scanner i =new Scanner(System.in);
		            int n ;
		            n = i.nextInt();
		            if(n == 1)
		             {
			       try{
                                   Scanner in = new Scanner(System.in);
                                   
                                     int j ;
                                    for( j = 0 ; j<2 ; j++)
                                { 
                                 System.out.print("Enter Name : ");
			         String name=in.nextLine();
                                 f1.setName(name);
                                 System.out.print("Enter id : ");
		                 String fid = in.nextLine();
		                 f1.setFid(fid);
		                 System.out.print("Enter salary : ");
                                 double s = in.nextDouble() ;
		                 f1.setSalary(s) ;
                                 in.nextLine() ;
                                  System.out.println("Insert Successful");
                                /* u1.setFaculty(f1) ;
                                   u1.insertFaculty(f1);*/
                               }
                               }
                               catch(Exception e)
                               {
                                   System.out.println("Invalid Input! Try again");
                               }
                                
                             }
                            
                            else if(n==2)
                            {
                                System.out.println("Press number for remove faculty : ");
                               
                            }
                            else if(n==3)
                            {
                                System.out.println("Existing Faculties : \n");
                               
                                for(int y = 0 ; y<2 ; y++)
                                {
                                    System.out.println("Faculty Id : "+f1.getFid());
                              
                                }
                                
                            }
                            else if(n==4)
                            {

                            }
                              break ;   
                       }
                       
                       case 2:
                        {
		               System.out.print("1 . Insert New Student\t 2 . Remove Existing Student\t 3 . Show All Students\t 4. Going Back" ) ;
                               Scanner a =new Scanner(System.in);
		               int x ;
		               x = a.nextInt();
		               if(x==1)
                               {
		                Scanner b = new Scanner(System.in);
			        String name ;
			        Student s1 = new Student() ;
                                System.out.print("Enter Name : ");
			        name=b.nextLine();
                                s1.setName(name);	 
                                System.out.print("Enter id : ");
                                int sid=b.nextInt();
		                s1.setSid(sid);
                              
                                u1.setStudent(s1) ;
                                u1.insertStudent(s1);
		              }
                               else if(x==2)
                               {
                                  
                                   
                               }
                               else if(x==3)
                               {
                                System.out.println("Existing Students : \n");
                               
                                u1.showAllStudents() ;
                                 
                               }
                               else if(x==4)
                               {
                                   
                               }
                               
                               
                               break ;
                        }
                       case 3:
                       {
                           System.out.print("1 . Adding Course\t 2 . Dropping Course\t 3 . Going Back\t") ;
		            Scanner i =new Scanner(System.in);
		            int n ;
		            n = i.nextInt();
                            if(n==1)
                            {
                                Scanner in = new Scanner(System.in);
			        int c , d = 3 ;
			        Course c1 = new Course() ;
			        System.out.print("Enter Course Number : ");
			        c=in.nextInt();
		                c1.setCourseNumber(c) ;
                                c1.setCredit(d);
                                Student s1 = new Student() ;
                                s1.insertCourse(c1) ;
                                
                                
                            }
                            else if(n==2)
                            {
                                
                            
                            }
                            else if(n==3)
                            {
                            
                            }
                            break ;
                            
                           
                       }
                       case 4 :
                       {
                           System.out.println("Exit Successful");
                           break ;
                       }
                       default :
                               {
                                   System.out.println("An unexpected Erorr occured");
                                   break ;
                               }
                   }
        }
       
}
}

			  	 
                   
                   