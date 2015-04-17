/*
 * Infoedge coding round question. task is just to figure out if there is any abusive
 * word present in the query and as soon as we find it we will return true
 */
public class InfoEdgeSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a[] = { "asshh", "assi", "honey", "si", "su" };
		String query = "fasshhonsi";
		System.out.println(" res" + isMatching(query, a));
	}

	public static boolean isMatching(String str, String a[]) {
		int i = 0;
		while (i < str.length()) {
			
			for (int j = 0; j < a.length; j++) {
				int prev = i;
				boolean flag = false;
				if (str.charAt(i) == a[j].charAt(0)) {
					int k = 1;
					while (k < a[j].length()) {
						if (str.charAt(++i) != a[j].charAt(k++)) {
							flag = true;
							break;
						}
					}
					if (flag) {
						i = prev;
					}
					else if (k == a[j].length())
					{
						System.out.println("ending index of matching first abusive word"+i);
						return true;
					}
						
				}
				
			}
			 
				i++;
		}
		return false;
	}

}
