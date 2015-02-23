package DS;

// this can be solved only by two conditions
// modified the code with the correct conditions
// just need to check that initial point of both the lines , comes in b/w the other lines.

public class HousingPropTigerPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int v1=5,v2=10;
       int v3=4,v4=26;
       if((v3>=v1&&v3<=v2)||(v3<=v1&&v4>=v1))
    	   System.out.println("intersection");
       else
    	   System.out.println("false");
	}

}
