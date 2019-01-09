package list;

import java.util.List;
import java.util.Vector;

public class VectorSampleCheck {
	public static void main(String[] args) {
		List<Integer> list = new Vector<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
}
