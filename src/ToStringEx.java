class ToStringEx1 {
	private String name;
	private String address;
	private int number;

	public String toString() // what is this function doing
	{
		return name + " " + address + " " + number;
	}

	public ToStringEx1(String name, String address, int number) {
		System.out.println("Constructing an Employee");
		this.name = name;
		this.address = address;
		this.number = number;
	}


}

public class ToStringEx {
	public static void main(String args[]) {
		ToStringEx1 toStringEx11 = new ToStringEx1("amit", "Hyderabad",
				500000000);
		System.out.println("value of object is" + toStringEx11);

	}
}