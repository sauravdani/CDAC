package Assignment8;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class articleCollection {
	Set<Article> articleSet = new HashSet<Article>();
	
	public articleCollection() {
		Article a1 = new Article(LocalDate.of(2020, 11, 23), "Chemestry", Type.covid);
		Article a2 = new Article(LocalDate.of(2019, 12, 05), "physics", Type.healthcare);
		Article a4 = new Article(LocalDate.of(2023, 1, 12), "Hindi", Type.covid);
		Article a3 = new Article(LocalDate.of(2016, 9, 14), "Maths", Type.children_health);
		Article a5 = new Article(LocalDate.of(2024, 4, 15), "Chemestry", Type.covid);
		
		articleSet.add(a1);
		articleSet.add(a2);
		articleSet.add(a3);
		articleSet.add(a4);
		articleSet.add(a5);
	}
	
	
	
	
}
