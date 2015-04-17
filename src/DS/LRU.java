package DS;

import java.util.LinkedHashMap;

public class LRU {
	
	public static final int  MAX_ENTRY =3;
	
	LinkedHashMap<Integer,String> mp = new LinkedHashMap<Integer, String>(MAX_ENTRY);
	
	public String get(Integer i)
	{
		String s=null;
		if(mp.containsKey(i))
		{
			s=mp.remove(i);
			mp.put(i, s);
		}
		return s;
	}
	
	public void set(Integer k , String v)
	{
		if(mp.size()< MAX_ENTRY)
		{
			mp.put(k, v);
		}
		else
		{
			Integer key = mp.keySet().iterator().next();
			mp.remove(key);
			mp.put(k, v);
		}
		
	}
	
	public void printLRU()
	{
		System.out.println(""+mp);
	}
	
	public static void main(String args[])
	{
		LRU lru = new LRU();
		lru.set(1, "one");
		lru.set(2, "two");
		lru.set(3, "three");
		lru.get(3);
		lru.get(1);
		lru.set(4, "four");
		System.out.println("content of LRU" );
		lru.printLRU();
	}

}
