package DS;



public class HikeEzeePS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double d = (double)3000/210;
	String st =  String.valueOf(d);
	int n = st.indexOf('.');
	int m = st.charAt(500);
	
	String str[] = st.split(".");
	System.out.println(st.substring(0,n)+st.substring(n, n+4));
	//BigDecimal bg = new BigDecimal(f);
	//bg.setScale(3);
//	int st = 
	System.out.println("bg"+ st+"m"+m);
		

	}

}
