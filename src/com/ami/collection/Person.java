package com.ami.collection;

public class Person implements Comparable<Person>{
	
	String name;
	String companyName;
	String nationality ;
	
	
	public Person(String name, String companyName, String nationality) {
		this.name = name;
		this.companyName = companyName;
		this.nationality = nationality;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	@Override
	public boolean equals(Object object) {
		boolean result = false;
		if (object == null || object.getClass() != getClass()) {
			result = false;
		} else {
			Person person = (Person) object;
			if (this.name == person.getName()
					&& this.nationality == person.getNationality()) {
				result = true;
			}
		}
		return result;
	}

	// just omitted null checks
	@Override
	public int hashCode() {
		int hash = 3;
		hash = 7 * hash + this.name.hashCode();
		hash = 7 * hash + this.nationality.hashCode();
		return hash;
	}

	@Override
	public int compareTo(Person object) {
		// TODO Auto-generated method stub
		 //this optimization is usually worthwhile, and can
	    //always be added
	    if (this == object) return 0;

	    return this.nationality.compareTo(object.nationality);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", companyName=" + companyName
				+ ", nationality=" + nationality + "]";
	}
	
	

}
