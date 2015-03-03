package DS;

public class HeathKartString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st1="coding";
		String st2="ngcodi";
		String st4="nigcod";
		String st3= st1.concat(st1);
		// just change the string , which you want to test
		if(st3.contains(st4))
			System.out.println("string is a rotation");
		else
			System.out.println("not a rotation");

	}

}
