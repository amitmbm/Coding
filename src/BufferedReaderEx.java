import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BufferedReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 System.out.println("Name: ");
		  try{
		     BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		     String inputString = bufferRead.readLine();
		      String arr[] = inputString.split(" ");
		     System.out.println("Name entered : " + arr[0] + "surname"+ arr[1]);
		 }
		 catch(IOException ex)
		 {
		    ex.printStackTrace();
		 }
		  
	}

}
