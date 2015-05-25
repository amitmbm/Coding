/*
 * figuring out the higest version in a string .
 */

public class HighestVersionSearch {
	
	public static void main(String args[])
	{
	// String str[] = {"helloslkhellodjladfjhello","abc","def","ghi"};
	String str1 = "10.0.1";
	String str2 = "10.0";
	 System.out.println("hieghtest version is"+ versionCompare(str1, str2));
	    /*Pattern p = Pattern.compile("hello");
	    Matcher m = p.matcher(str);
	    int count = 0;
	    while (m.find()){
	    	count +=1;
	    }*/
	   // System.out.println(count);
	}
	
	public static int versionCompare(String v1, String v2) {
	    String[] version1 = v1.split("\\.");
	    String[] version2 = v2.split("\\.");
	    System.out.println("version 1 array is" + version1);
	    System.out.println("version 1 array is" + version2);
	    int i;
	    for (i = 0; i < version1.length; i++) {
	     if (!version1[i].equals(version2[i])) {
	        int version1Int = Integer.parseInt(version1[i]);
	        int version2Int = Integer.parseInt(version2[i]);
	        if (version1Int > version2Int) {
	          return 1;
	        } else if (version1Int < version2Int) {
	          return -1;
	        }
	      }
	    }
	    if (version2.length == i)
	      return 0;
	    else if (version2.length == i) 
	        return 1;
	    else
	      return -1;
	  }
}
