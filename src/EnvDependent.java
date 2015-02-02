import javax.imageio.IIOException;



public class EnvDependent {

	
	public final static String url="ABC in Dev";
	static String appsUrl=null;
	static String scenario=null;
	public static void main(String ...args )throws IIOException {
		if (args.length != 2) {
			System.out.println("Mismatch in arg");
			//printUsage();
			System.exit(1);
		}
		// String env = args[0].toLowerCase();
		scenario = args[0].toLowerCase();
		if(scenario.equalsIgnoreCase("dev"))
		{
			appsUrl = "https://100000768.auth.dev-konycloud.com/api/v1/apps";
			/*public final static String runLoginUrl = "https://100000329.auth.sit-konycloud.com/login?provider=userstore";
			public final static String claimsUrl = "https://100000329.auth.sit-konycloud.com/claims";
			public final static String envguid="0a32e136-e273-490d-81a3-ed45230cc8c0";
		    public final static String appId="apptestsyntran";
		    public static String appKey=null;
		    public static String appSecret=null;*/
		}
		else if(scenario.equalsIgnoreCase("sit"))
		{
			appsUrl="https://100000329.auth.sit-konycloud.com/api/v1/apps";
		}
		else
			appsUrl="https://100000329.auth.qa-konycloud.com/api/v1/apps";
	     
		System.out.println("value of apps URL based on Env. is"+appsUrl);

	}
	
	
	
}
