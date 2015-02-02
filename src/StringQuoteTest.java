
public class StringQuoteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Amit";
		// String name_with_quote =
		String content = "{" + "name:'" + name + "'" + ", type:'concurrent'"
				+ ", operations:['app1.op1', 'app2.op2']"
				+ ", preprocessor:'com.kony.abc.Test'" + ", jar:'200'" + "}";
		 System.out.println("value of string with quote" + content);
		 
		 String postAppBody = "{\"baseid\":\"syntrans\",\"types\":\"CRM\" ,\"appid\":\"testsyntran\",\"envguid\":\""
					+ "\",\"displayname\":\"syntranApp\"}";
		 System.out.println("postappbody is" + postAppBody);
		 
		
		/*String payLoad  = 
				"{" +
					"name:'" + orchName + "'" +
					", type:'looping'" +
					", operations:['"+opName+"']" +
					", preprocessor:'" + preProcessor+"'" +
					", jar:'-1'" + // but if i give +ve value then its returning a failure 
					", postprocessor:'" + postProcessor+"'" +
					", maxLoopCount:'" + maxLoopCount  + "'"+
					", inputParamSeperator:'"+ inputParamSeperator+"'"+
					", breakLoopParamName:'"+ breakLoopParamName+"'"+
					", breakLoopParamValue:'"+breakLoopParamValue+"'"+
			    "}";	*/
		//System.out.println("value of payload  is" + );
	}

}
