
public class HikeEzeeTest {
	
	static int [][] isvisited = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
	static int [][] arr= {{0,1,1,1},{1,0,0,1},{1,1,0,1},{1,0,1,1}};

	public static void main(String[] args) {

       
       int i=0,j=1;
       int r=4,c=4;
       int cnt=1;
       int n=4;
       // covering the first and last row
    		   while(j<c-1 && i<r)
    		   {
    			   if(arr[i][j]==0)
    			   {
    				   dfs(i,j,n);
    				  // System.out.println("printing the 0's"+arr[i][j]);
    			   }
    			   System.out.println(" "+arr[i][j]);
    			   j++;
    			   if(j==c-1 && cnt==1)
    			   {
    				   j=1;
    				   i=r-1;
    				   cnt++;
    			   }
    		   }
    		   System.out.println("printing the column");
       // covering the first and last column
    		   i=1;j=0;
               cnt=1;    		   
    		   while(i<r-1 )
    		   {
    			   if(arr[i][j]==0)
    			   {
    				   dfs(i,j,n);
    				   //System.out.println("printing the 0's"+arr[i][j]);
    			   }
    			   System.out.println(" "+arr[i][j]);
    			   i++;
    			   if(i==r-1 && cnt==1)
    			   {
    				   j=c-1;
    				   i=1;
    				   cnt++;
    			   }
    		   }
    		   //dfs(1,0,isvisited,arr);
    		  
    		   			
    			for(i=0;i<n;i++){
    				for(j=0;j<n;j++){
    					if(isvisited[i][j]==0 && arr[i][j]==0)
    						arr[i][j]=1;
    					//cout << a[i][j] << ' ';
    					System.out.print(arr[i][j]+" ");
    				}
    				// cout << endl;
    				System.out.println();
    			}
       
	}
       
    /*  static void dfs(int r, int c , int [][] isvisited , int [][] arr ){
    	 // isvisited[r][c] = 1;
    		if(r<0 || c<0 || r>=4 || c>=4 ||  arr[r][c]==1)
    			return ;

    		//path.push_back(make_pair(l,r));

    		//len++;
    		//isvisited[r][c] = 1;
    		if(l==m-1 && r==n-1){
    			if(ans.size()==0 || ans.size()>path.size()){
    				ans=path;
    			}
    		}
    		
    		if((r>0) && (arr[r+1][c]==0 || arr[r-1][c] == 0 || arr[r][c-1]==0 || arr[r][c+1] == 0))
    		{
    			isvisited[r][c] = 1;
    		}
    		
    		dfs(r,c-1,isvisited,arr);
    		dfs(r,c+1,isvisited,arr);
    		dfs(r-1,c,isvisited,arr);
    		dfs(r+1,c,isvisited,arr);
    		visited[l][r]=false;
    		path.pop_back();
    	}*/
      
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
