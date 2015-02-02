
/**
 * 
 * @author KH1871 (below class will show , how to override the equal method)
 * 
 * use Car example with a unique VID number , which will help us to create a hashmap .
 * without the need of having the two object represents the same Obj .
 * and in hashmap we have to override both equals and hashcode() , as java returns virtually unique hashcode for each 
 * Object.
 * Hashmap<carVID , humanObj>
 *
 */
public class EqualsOverride {
	
	int a ;
	int b;
	public EqualsOverride(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	// necc Object is the param of equals method
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsOverride other = (EqualsOverride) obj;
		if (a != other.a && b != other.b)
			return false;
		return true;
	}
	
	

}
