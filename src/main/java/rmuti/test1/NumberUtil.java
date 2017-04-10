package rmuti.test1;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberUtil {
	private ArrayList arrlist;

	public NumberUtil() {
		arrlist = new ArrayList();
	}

	public void addDiv3(Object e) {
		int number = (Integer) e;
		if (number % 3 == 0) {
			arrlist.add(e);
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return arrlist.toString();
	}
}
