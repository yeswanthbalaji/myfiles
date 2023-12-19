package arraylist;
import java.util.*;
public class map {
public static void main(String args[])
{
	Map<Integer,String>map=new HashMap<Integer,String>();
	map.put(12,"java");
	map.put(13,"sap");
	map.put(14,"sfdc");
	map.put(15,"hybris");
	map.put(16,null);
	map.put(17,null);
	for(Map.Entry m1:map.entrySet()) {
		System.out.println(m1.getKey()+" "+m1.getValue());
	}
}
}
