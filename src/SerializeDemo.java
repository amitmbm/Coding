

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.yaml.snakeyaml.events.SequenceEndEvent;

class Employee implements java.io.Serializable
{
   public String name;
   public String address;
   public transient int SSN;
   public int number;
   public void mailCheck()
   {
      System.out.println("Mailing a check to " + name
                           + " " + address);
   }
}

class NotSE
{
	String s;
}
class SWEmp extends Employee
{
	public String swtech;
    NotSE notSE; 
	public SWEmp(String tech , NotSE notSE ) {
		super();
		this.swtech = tech;
		this.notSE = notSE;
		// TODO Auto-generated constructor stub
	}
	
}


public class SerializeDemo
{
   public static void main(String [] args)
   {
      Employee e = new Employee();
      e.name = "Reyan Ali";
      e.address = "Phokka Kuan, Ambehta Peer";
      e.SSN = 11122333;
      e.number = 101;
      NotSE no = new NotSE();
      SWEmp seEmp = new SWEmp("java", no);
      
      try
      {
         FileOutputStream fileOut =
         new FileOutputStream("./src/sw.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(seEmp);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in /ser/employee.ser");
      }catch(IOException i)
      {
          i.printStackTrace();
      }
   }
}