package Lab4;

public class JavaExample {
 
   public static void main(String args[]){
	  int num =1234;
	  int reserved = 0;
	  
	  for (; num !=0; num /=10) {
		  int digit = num %10;
		  reserved = reserved *10+digit;
		  	System.out.println(reserved);

	  }
   }
}