
package Class;
import java.io.*;

class fileOperation 
{
        private File f1  , f2 ;				
	private FileWriter w1 , w2 ;		
	private FileReader r1 , r2 ;		
	private BufferedReader bfr1 , bfr2 ;		

  
	
	
	public void writeInFile(String s,String i , double g)
	{
		
		try
		{
			f1 = new File("RecordFaculty.txt");			
			f1.createNewFile();					
			w1 = new FileWriter(f1, true);	
			w1.write("Name : " +s+"\r"+"\n") ;
                        w1.write("Faculty Id : " +i+"\r"+"\n") ;
                        w1.write("Salary : " +g+"\r"+"\n") ;
                        System.out.println("\n");
                        w1.flush();							
			w1.close();						
		}
		catch(IOException ioe1)
		{
			ioe1.printStackTrace();
		}
	}
        
	public void writeInFile1(String s)
	{
		
		try
		{
			f2 = new File("RecordStudent.txt");			
			f2.createNewFile();					
			w2 = new FileWriter(f1, true);	
			w2.write("1.Name : " +s+"\r"+"\n") ;
                        w2.flush();							
			w2.close();						
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public void readFromFile()
	{
		
		try
		{
			r1 = new FileReader(f1);
			bfr1 = new BufferedReader(r1);		
			String text="", temp;				
			
			while((temp=bfr1.readLine())!=null)		
			{
				text=text+temp+"\n"+"\r";			
			}
			
			System.out.print(text);   				
			r1.close();						
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
		
		
		
	}