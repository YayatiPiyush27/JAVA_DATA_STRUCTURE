package yayati;
import java.util.*;
//Using InBuilt HashMap
/*
		map.put(Key,Value);
T value=map.get(Key);
		map.remove(Key);
		map.remove(Value);
		map.replace(Key,Value1,Value2);
Boolean result=map.isEmpty();
Boolean result=map.containsKey();
Boolean result=map.containsValue();
Set<T> set=map.keySet();
Collection<T>=map.values();
			  map.clear();
 */
public class HashMapUse {
	public static HashMap<String,Integer> wordFrequency(String[] arr)
	{
		HashMap<String,Integer> map=new HashMap<>();
		for(String str:arr)
			if(map.containsKey(str))
				map.put(str, map.get(str)+1);
			else
				map.put(str, 1);
		return map;
		
	}
	public static HashMap<Integer,Integer> pairSumTo0(int[] arr)
	{
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i:arr)
			if(map.containsKey(i))
				map.put(i, map.get(i)+1);
			else
				map.put(i, 1);
		for(Integer i:map.keySet())
		{
			if(map.containsKey(-i))
			{
				int val=map.get(i);
				while(val--!=0)
					System.out.println(-i+" "+i);
				map.put(i, val);
			}
		}
		return map;
	}
	public static void main(String[] arg)
	{
		/*String[] arr= {"piyush","yayati","shubham","yayati","piyush","yadav"};
		HashMap<String,Integer> map=wordFrequency(arr);
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());*/
		int[] arr= {2,-2,1,2,-2,-6,3,6};
		HashMap<Integer,Integer> map=pairSumTo0(arr);
		System.out.print(map);
		
	}
}
