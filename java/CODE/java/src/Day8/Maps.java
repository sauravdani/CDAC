package Day8;

import java.util.HashMap;
import java.util.Set;

public class Maps {
	
	public static void main(String[] args) {
	
	HashMap <String, Integer> map = new HashMap<>();
	
	map.put("one",100);
	map.put("two",1001);
	map.put("three",1002);
	map.put("one",1003);

	System.out.println(map);
	
	Set<String> keys=map.keySet();
	for (String key : keys) {
		System.out.println("keys: "+key+" value: "+map.get(key));
	}
	
	
	
	map.containsValue(100);
	map.containsKey("one");
}
}
