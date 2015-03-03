package DS;


public class HeathKartMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        long res = 0;
        int m=3,n=4;
       /*  formula for number of ways , i can reach from 0,0 to m,n is below
         (m+n-2)!/((m-1)!(n-1)!)  as we to reach at the end we will move m-1 in down direction and n-1 in right 
         direction , hence for ex : m=3 and n=4 , we will have MMNNN kind of moves , and to calculate in how many ways 
         we can reshuffle this arrangement is 5!/(2!*3!) as M and N is repeting 2 and 3 times . */
        
        res= fact(m+n-2)/(fact(m-1)*fact(n-1));
        System.out.println("total number of ways are"+ res);
              
	}
	
	static long fact (int n)
	{
		if(n==1)
			return 1;
		else
			return n*fact(n-1);
	}

}
