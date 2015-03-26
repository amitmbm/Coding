
public class AmazonQues {
	

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
        //System.out.println(i+97);
        }
          // c= Character.toChars(i+97);
           
    }

}




}
