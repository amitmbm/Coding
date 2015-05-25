import java.io.*;
import java.util.*;
public class AirPushTest {
	    
	     public static int evaluateString(String ex)
	    {
	        char[] tokens = ex.toCharArray();
	 
	        Stack<Integer> values = new Stack<Integer>();
	 
	        Stack<Character> ops = new Stack<Character>();
	 
	        for (int i = 0; i < tokens.length; i++)
	        {
	            if (tokens[i] == ' ')
	                continue;
	 
	            if (tokens[i] >= '0' && tokens[i] <= '9')
	            {
	                StringBuffer sbuf = new StringBuffer();
	                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
	                    sbuf.append(tokens[i++]);
	                values.push(Integer.parseInt(sbuf.toString()));
	            }
	 
	            else if (tokens[i] == '(')
	                ops.push(tokens[i]);
	 
	            else if (tokens[i] == ')')
	            {
	                while (ops.peek() != '(')
	                  values.push(applyOp(ops.pop(), values.pop(), values.pop()));
	                ops.pop();
	            }
	 
	            else if (tokens[i] == '+' || tokens[i] == '-' ||
	                     tokens[i] == '*' || tokens[i] == '/')
	            {
	                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek()))
	                  values.push(applyOp(ops.pop(), values.pop(), values.pop()));
	 
	                ops.push(tokens[i]);
	            }
	        }
	 
	       while (!ops.empty())
	            values.push(applyOp(ops.pop(), values.pop(), values.pop()));
	 
	        return values.pop();
	    }
	 
	    
	    public static boolean hasPrecedence(char op1, char op2)
	    {
	        if (op2 == '(' || op2 == ')')
	            return false;
	        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
	            return false;
	        else
	            return true;
	    }
	 
	    public static int applyOp(char op, int b, int a)
	    {
	        switch (op)
	        {
	        case '+':
	            return a + b;
	        case '-':
	            return a - b;
	        case '*':
	            return a * b;
	        case '/':
	            if (b == 0)
	                throw new
	                UnsupportedOperationException("Cannot divide by zero");
	            return a / b;
	        }
	        return 0;
	    }
	 
	    
	    public static void main(String args[] ) throws Exception {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
	         BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			     String inputString = bufferRead.readLine();
	        HashMap<Character, Integer> map = new HashMap<Character,Integer>();
	        String [] arr = inputString.split(" ");
	        for(int i=0;i<arr.length;i++)
	            {
	            if(i%2==1){
	                continue;
	            }
	            for(int j=0;j<arr[i].length();j++){
	                char tmp = arr[i].charAt(j);
	                if(!(tmp>='0' && tmp<='9') && tmp!='^' && tmp!='(' && tmp !=')')
	                   map.put(tmp,0);
	            }
	        }
	        for(int i=0;i<map.size();i++){
			     String inputString1 = bufferRead.readLine();
	             String [] exp = inputString1.split("=");
	            map.put(exp[0].charAt(0), Integer.parseInt(exp[1]));
	            
	        }
	        System.out.println(map);
	        boolean flag=true;
	        for(int i=0;i<arr.length;i++)
	            {
	            if(i%2==1){
	                continue;
	            }
	            flag=true;
	            int k=0;
	            for(int j=0;j<arr[i].length();j++){
	                
	                int tmp = arr[i].charAt(j) - '0';
	                if(flag && tmp<=9 && tmp>=0){
	                    k=k*10+tmp;
	                }
	                
	                else{
	                    flag=false;
	                    
	                }
	            }
	                
	            
	        }
	        System.out.println(map.size());

	    }
	        
	}
	

