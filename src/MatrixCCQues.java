import java.awt.Point;
import java.util.ArrayList;

/*
 * this question involves the backtracing and its a famous interview question.
 */
public class MatrixCCQues {

	
	static int a[][] = {{1,1,1},{1,0,1},{0,1,1}};
	static boolean isvisit[][]={{false,false,false},{false,false,false},{false,false,false}};
	static ArrayList<Point> answer = new ArrayList<Point>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Point> path = new ArrayList<Point>();
		int l=0;
		System.out.println("before dfs size"+ answer.size());
		dfs(0,0,path,0,3,3);
	    System.out.println("after dfs size"+ answer.size());
		for(int i=0;i<answer.size();i++)
			//cout << ans[i].first << ' ' << ans[i].second << endl;
		System.out.println("X:"+answer.get(i).x+"Y: "+ answer.get(i).y);
		

	}
	
	static void dfs(int l, int r, ArrayList<Point> path, int len, int m, int n){
		if(l<0 || r<0 || l>=m || r>=n || isvisit[l][r]==true || a[l][r]==0)
			return ;

		//path.push_back(make_pair(l,r));
		path.add(new Point(l, r));
        System.out.println("path before" + path);
		len++;
		isvisit[l][r] = true;
		if(l==m-1 && r==n-1){
			if(answer.size()==0 || answer.size()>path.size()){
				System.out.println("answer size"+ answer.size());
				//answer=path;
				answer = (ArrayList<Point>) path.clone();
				System.out.println("answer" + answer);
				System.out.println("answer size after assinging size"+ answer.size());
			}
		}
		dfs(l-1,r,path,len,m,n);
		dfs(l,r-1,path,len,m,n);
		dfs(l+1,r,path,len,m,n);
		dfs(l,r+1,path,len,m,n);
		isvisit[l][r]=false;
		//path.pop_back();
		path.remove(path.size()-1);
		System.out.println("path after" + path);
	}

}
