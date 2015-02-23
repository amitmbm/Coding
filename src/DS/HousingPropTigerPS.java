package DS;

// this can be solved only by three conditions
public class HousingPropTigerPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int v1=5,v2=10;
       int v3=16,v4=18;
       if((v3>=v1&&v3<=v2)||(v4>=v1&&v4<=v2)||(v3<=v1&&v4>=v1))
    	   System.out.println("intersection");
       else
    	   System.out.println("false");
	}

}
