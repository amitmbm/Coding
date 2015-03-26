
public class AmazonQues1 {
	
	Stack s = new Stack(); 
	Node node = root;
	while (node != null)
	{
		s.push(node);
		node = node.left;
	}
    List<Integer> l = new ArrayList<Integer>();
    
	while (s.size() > 0)
	{
		node = (Node)s.pop();
        l.add(node.data);
		if (node.right != null)
		{
			node = node.right;
			while (node != null)
			{
				s.push(node);
				node = node.left;
			}
		}
	}
int n = l.get(l.size()-N);
return n;

}


static void findRepeatCharacters(String a) {

     int ar[] = new int[26];
     
     char c =0 ;
     int n=0;
     for(int i=0;i<a.length();i++)
         {
         n = a.charAt(i) -'a';
         ar[n]= ar[n]+1;
     }
    char ch = 0;
    int j=0;
    for(int i=0;i<ar.length;i++)
        {
        if(ar[i]>1)
            {
             j=i+97;
            ch=0;
            ch= (char)(j);
         System.out.println(ch);
        }
           
    }

}



