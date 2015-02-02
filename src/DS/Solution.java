package DS;

class IndexNode{

public int idxrow;
public int idxcol;
public int value;
}

interface MinHeap{

public IndexNode N[size];
public int size;
public IndexNode remove();
public boolean put(IndexNode n);

}

Public Class Solution{

public static voide main(String Args[]) throws Exception{

int[][] A = {{6,9,10,13},{2,4,7,8},{11,14,16,18},{12,15,17,19}};

int row=4,col=4;

SortTheArray(A,row,col);

for (int i=0,i<row,i++)
 for(int j=0,j<col,j++)
  System.out.println(A[i][j]);
}

public void SortTheArray(int[][] A,int row,int col){

MinHeap H=new MinHeap(row);

for(int i=0;i<row;i++)
 H.put(new IndexNode(i,0,A[i][0]));

for(int i=0;i<row-1;i++)
 {
 IndexNode n=H.remove();
 int r=n.idxrow;prevCol=n.idxcol;
 
 while( prevCol < col-1 ){
 H.put(new IndexNode(r,prevCol+1,A[r][prevCol+1]));
 n=H.remove();
 if(n.idxrow==r){
 prevCol++;
 continue;
 }
 else{
 int temp=A[r][prevCol+1];
 A[r][prevCol+1]=A[n.idxrow][n.idxcol];
 A[n.idxrow][n.idxcol]=temp;
 placeIt(A,n.idxrow,n.idxcol); // to insert the new exchanged number in its proper position
 prevCol++
 }
 }
}
ArrangeTheArray(A);// to order all the rows in ascending order

}