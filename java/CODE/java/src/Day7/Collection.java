package Day7;

import java.util.ArrayList;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		ArrayList lst = new ArrayList();
		lst.add(100);
		lst.add(45.5f);
		lst.add(true);
		lst.add(456.89);
		lst.add(100);
		
		for(Object l : lst) {
			System.out.println(l);
			
		}
		Object obj = lst.get(3);
		String s = (String)obj;
		s.toUpperCase();
		
	
	}

}
