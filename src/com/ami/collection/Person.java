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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((nationality == null) ? 0 : nationality.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		if (companyName == null) {
			if (other.companyName != null) {
				return false;
			}
		} else if (!companyName.equals(other.companyName)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (nationality == null) {
			if (other.nationality != null) {
				return false;
			}
		} else if (!nationality.equals(other.nationality)) {
			return false;
		}
		return true;
	}

	// just omitted null checks
	//@Override
	/*public int hashCode() {
		int hash = 3;
		hash = 7 * hash + this.name.hashCode();
		hash = 7 * hash + this.nationality.hashCode();
		return hash;
	}*/

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
