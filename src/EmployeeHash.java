import java.util.HashMap;
import java.util.Map;

//import com.ami.collection.Person;

class Person
{
	private final String name ;
	private final int age;
	
	public String getName() {
		return name;
	}
	
	/*public void setName(String name) {
		this.name = name;
	}*/
	public int getAge() {
		return age;
	}
/*	public void setAge(int age) {
		this.age = age;
	}*/
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + "]";
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
}

class PersonChild extends Person
{
    String childname;
	public PersonChild(String name, int age , String childName) {
		super(name, age);
		this.childname = childName;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PersonChild [childname=" + childname + "]";
	}
	
	
}

class EmployeeHash 
{
	public static void main(String args[])
	{
		
		Person p1 = new Person("AK",27);
		Person p2 = new Person("GS",30);
		PersonChild pc = new PersonChild("GS", 30, "GSC");
		
		Map<String,Person> hashmap = new HashMap<String,Person>();
		
		hashmap.put(p1.getName(), p1);
		hashmap.put(p2.getName(), p2);
		hashmap.put(pc.getName(), pc);
		
		
		System.out.println("printing the hashmap");
		
		for(String str : hashmap.keySet())
		{
			System.out.println("key::"+str+"  value::"+hashmap.get(str));
		}
		
		//p1.setName("AMITK");
		
		System.out.println("get the obj for p1"+hashmap.get(p2.getName()));
		//System.out.println("person obj is" + p1);
		//System.out.println("person obj is" + p2);
	}
}
