/*
 * 2
wcyuogmlrdfphitxjakqvzbnes
jcdokai
miruqopsxthzdcnvkfbglwayje
wgfsyvno
Sample Output(Plaintext Link)
 codijak first test
osnvfgwy // second test

Answer is working , hence proved
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DiffSort {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String w= br.readLine();
		char arr[] = new char[26];
		int i=0,j=0;
		char ch[]=new char[26];
		for(i=0;i<26;i++)
			 arr[i]='1';
		i=0;
		char c;
		while(i<w.length())
		{
			c=w.charAt(i);
			j=str.indexOf(c);
			System.out.println("value of c and j"+c+": "+j);
			arr[j]=c;
			i++;
		}
		i=0;j=0;
		while(i<26)
		{
			if(arr[i]!='1')
				ch[j++]=arr[i];
			i++;
		}
		//j='\0';
		System.out.println("print the array" + String.valueOf(arr));
		System.out.println("printing the sorted str "+ String.valueOf(ch));
	}

}
