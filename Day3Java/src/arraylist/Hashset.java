package arraylist;
import java.util.*;
public class Hashset {
	public static void main(String args[]) {
           HashSet<String>hashset=new LinkedHashSet<>();
           hashset.add("sring");
           hashset.add("springboot");
           hashset.add("hibernete");
           hashset.add("microservices");
           hashset.add("rest api");
           hashset.add(null);
           hashset.add("api");
           System.out.println(hashset);
           hashset.remove(null);
           System.out.println(hashset);
	}
}
