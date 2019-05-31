package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class EmptyAndNullDuplicateCheck {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Manohar", "", "Sambali", "Hello", "World", "", null);
		List<String> filtered = list.stream().filter(s -> s != null && (!s.isEmpty() || !s.equals("Manohar"))).collect(Collectors.toList());
		System.out.println(filtered);
		long count = list.stream().filter(s -> s != null && !s.isEmpty() && !s.equals("Manohar")).count();
		System.out.println(count);
		
		List<String> list2 = new ArrayList<>();
		list2.add("jdhfd");
		list2.add("dffd");
		list2.add(null);
		list2.add(null);
		list2.add("dkfjdkf");
		System.out.println("---------------");
		for (String string : list2) {
			System.out.println(string);
		}
		
		
		
		Set<String> set = new HashSet<>();
		set.add("jdhfd");
		set.add("dffd");
		set.add(null);
		set.add(null);
		set.add("dkfjdkf");
		System.out.println("-------hghgh--------");
		for (String string : set) {
			System.out.println(string);
		}
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "3");
		map.put(null, "null_1");
		map.put(null, "null_2");
		map.put("1", "14");
		System.out.println("------ssssss---------");
		Set<String> keySet = map.keySet();
		for (String string : keySet) {
			System.out.println(string+" -> "+map.get(string));
		}
		System.out.println("99999999999999999990000000000000000000");
		Set<Entry<String,String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey()+" -> "+entry.getValue());
		}
	}
}
