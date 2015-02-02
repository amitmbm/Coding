import java.util.Scanner;


public class ChocSplit {

	/*
	 * Complete the function below.
	 */
	static int minSplitNumber(int width, int height, int nTiles) {
        if((long )width*height<nTiles) return -1;
        if((long )width*height==nTiles) return 0;
        if(nTiles%width==0||nTiles%height==0) return 1;
        for(int a=1;a*a<=nTiles;++a) if(nTiles%a==0) {
                int b=nTiles/a;
                if(a<=width&&b<=height||a<=height&&b<=width)
        return 2;
        }
        return -1;
}

///////////////
	        public static void main(String[] args) {
	            Scanner in = new Scanner(System.in);
	            int res;
	            int _width;
	            _width = Integer.parseInt(in.nextLine());
	            
	            int _height;
	            _height = Integer.parseInt(in.nextLine());
	            
	            int _nTiles;
	            _nTiles = Integer.parseInt(in.nextLine());
	            
	            res = minSplitNumber(_width, _height, _nTiles);
	            System.out.println(res);
	            
	        }
}
