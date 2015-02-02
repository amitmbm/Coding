import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



class Student implements Serializable
{
	int rollno;
	String StudentName;
    static String  SchoolName="MHS";
	public Student(int rollno, String studentName) {
		super();
		this.rollno = rollno;
		StudentName = studentName;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", StudentName=" + StudentName
				+  "schname::"+ SchoolName+"]";
	}
    
    
	
	
}
public class SerializeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student amit = new Student(3,"Amit");
		//BufferedReader br = new BufferedReader( new InputStreamReader(null));
		
		try {
			FileOutputStream fos = new FileOutputStream("amit.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(amit);
			fos.close();
			oos.close();
			
			FileInputStream fis = new FileInputStream("amit.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student st= (Student)ois.readObject();
			Student.SchoolName="MBM";
			System.out.println("st is"+ st);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
