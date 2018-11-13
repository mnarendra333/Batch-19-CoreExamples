package pack1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MapSortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> mymap = new TreeMap<>();
		mymap.put("arun", 10);
		mymap.put("kallesh", 5);
		mymap.put("barath", 6);
		mymap.put("anil", 20);
		
		//System.out.println(mymap);
		

		System.out.println("Original...");
		System.out.println(mymap);

		// sort by keys, a,b,c..., and return a new LinkedHashMap
		// toMap() will returns HashMap by default, we need LinkedHashMap to
		// keep the order.
		Map<String, Integer> result = mymap
				.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByKey())
				.collect(
						Collectors.toMap(Map.Entry::getKey,
								Map.Entry::getValue,
								(oldValue, newValue) -> oldValue,
								LinkedHashMap::new));

		// Not Recommend, but it works.
		// Alternative way to sort a Map by keys, and put it into the "result"
		// map
		Map<String, Integer> result2 = new LinkedHashMap<>();
		mymap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));

		System.out.println("Sorted...");
		System.out.println(result);
		System.out.println(result2);

	}

}
