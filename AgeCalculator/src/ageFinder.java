
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class ageFinder {
     static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		//String input="";
//		DateTimeFormatter formater = DateTimeFormatter.ofPattern("d/MM/yyyy");	
//		String birthDate ="11/01/1979";
//		
//		LocalDate today = LocalDate.now();
//		int x= today.getYear();
//		
//	
//		LocalDate localDate = LocalDate.parse(birthDate,formater);
//		
//		int Sv =localDate.getYear();
//		int Age = getTheAge(x,Sv);
//	     System.out.println(Age);
	    int[]arr =new int[3]; 
	   
	   int i = 0;
	   int n =arr.length;
	   boolean done =false;
	   while(!done)
	   {   
		   System.out.println("enter your Birth day: use this format dd/MM/yyyy");
		   String birthDate=sc.nextLine();
		 
		   DateTimeFormatter formater1 = DateTimeFormatter.ofPattern("d/MM/yyyy");
		   LocalDate localDate1 = LocalDate.parse(birthDate,formater1);
		 //  GregorianCalendar gc =new GregorianCalendar(birthDate);
		   
		   int bd =localDate1.getYear();
		   LocalDate today1 = LocalDate.now();
		   int td= today1.getYear();
		   int Age1 = getTheAge(td,bd);
		   //System.out.println(Age1);
		   arr[i]=Age1;
		   i++;
		   if(i>=n)
		   { 
			   done= true;
		   }
		   
	   }
	  
	   Display(arr);

	}
	
	public static int getTheAge(int x,int y)
	{   
		return x-y;
	}
    public static void Display(int[]arr)
    {   for (int i=0;i<arr.length;i++)
       {
    	System.out.print(arr[i]+",");
       }
    }
}