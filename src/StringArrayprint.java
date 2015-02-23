import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class StringArrayprint {

	public static void main(String args[])
	{
		String[] Arr = new String[3];
		char a[]={'a','b','c'};
		Integer ia[] = {1,2,3};
		System.out.println("print"+ia.toString());
		String b = new String(a);
		System.out.println("printing the char array"+ b );
		Arr[0]="Amit";
		Arr[1]="Khandelwal";
		Arr[2]="hyderabad";
		List<String> list = new ArrayList<String>();
		list.add("Ami");
		list.add("guddu");
		list.add("amitsa");
		list.add("popda");
		//System.out.println("collection printing in a single statement ::" + list);
		System.out.println("value of Arry is"+ Arrays.toString(Arr));
		System.out.println("string array length is"+ Arr.length);
		System.out.println("Array-length" + Arr[0].length());
		
	}
}
