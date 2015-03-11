package DS;

public class HikeezeeMatrix {
	
	static int [][] arr= {{0,1,1,1},{1,0,0,1},{1,1,0,1},{1,0,1,1}};
	static int [][] isvisited = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         // considering row and column is 4.
		int n=4;
		System.out.println("printing the input matrix");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
    		   
    		   for(int i=0;i<n;i++){
    				dfs(0,i,n);
    			}
    			for(int i=1;i<n;i++){
    				dfs(i,0,n);
    			}
    			for(int i=1;i<n;i++){
    				dfs(i,n-1,n);
    			}
    			for(int i=1;i<n-1;i++){
    				dfs(n-1,i,n);
    			}
           System.out.println("printing the output matrix");
    			for(int i=0;i<n;i++){
    				for(int j=0;j<n;j++){
    					if(isvisited[i][j]==0 && arr[i][j]==0)
    						arr[i][j]=1;
    					System.out.print(arr[i][j]+" ");
    				}
    				System.out.println();
    			}
	}
       
     static void dfs(int i, int j, int n){
    		if(i<0 || j<0 || i>=n || j>=n || isvisited[i][j]==1 )
    			return;
    		isvisited[i][j]=1;
    		if(arr[i][j]==1)
    			return;
    		dfs(i+1,j,n);
    		dfs(i-1,j,n);
    		dfs(i,j+1,n);
    		dfs(i,j-1,n);
    	}

}
