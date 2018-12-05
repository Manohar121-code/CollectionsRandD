package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmptyCheck {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Manohar", "", "Sambali", "Hello", "World", "", null);
		List<String> filtered = list.stream().filter(s -> s != null && (!s.isEmpty() || !s.equals("Manohar"))).collect(Collectors.toList());
		System.out.println(filtered);
		long count = list.stream().filter(s -> s != null && !s.isEmpty() && !s.equals("Manohar")).count();
		System.out.println(count);
	}
}
