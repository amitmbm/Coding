package DS;

/* working code */

public class SolutionStar {

	public static void main(String args[]) {
		int[][] a = { { 1, 0, 1, 0 }, { 0, 1, 0, 1 }, { 1, 0, 1, 1 },{1,1,0,1},
				{ 1, 1, 1, 1 } };
		int i = 1, j = 1;
		for (i = 1; i < 4; i++) {

			for (j = 1; j < 3; j++) {
				if (a[i][j] == 0
						&& ((a[i - 1][j] != 0) && (a[i][j - 1] != 0)
								&& (a[i][j + 1] != 0) && (a[i + 1][j] != 0))) {
					a[i -1][j ] = 2;
					a[i][j - 1] = 2;
					a[i][j+1] = 2;
					a[i+1][j] = 2;

				}

			}

		}
		System.out.println("printing the modified array");
		for( i=0;i<5;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
			
		
	}
}