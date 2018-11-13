package pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*List<String> list = new ArrayList<>();
		list.add("John");
		list.add("Miller");
		list.add("Gorge");
		list.add("Gowtham");*/
		List<String> result2 = Arrays.asList();
		List<String> data = Arrays.asList("John","Miller","Gorge","Gowtham");
		List<String> filterData = filterData(data,"Miller");
		
		for (String name : filterData) {
			System.out.println(name);
		}
		
		
		System.out.println("================java8==================");
		
		
			
		
	}

	private static List<String> filterData(List<String> data, String string) {
		// TODO Auto-generated method stub
		List<String> result = Arrays.asList();
		for (String name : data) {
			if(!"Miller".equals(name))
				result.add(name);
		}
		
		return result;
	}

}
