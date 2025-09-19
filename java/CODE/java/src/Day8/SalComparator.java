package Day8;

import java.util.Comparator;

public class SalComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getSalary(), o2.getSalary());
	}

}
