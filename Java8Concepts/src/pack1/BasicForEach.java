package pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BasicForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> data = Arrays.asList("John", "Miller", "Gorge", "Gowtham");
		for (String name : data) {
			System.out.println(name);
		}

		System.out.println("=============in java8===================");

		data.forEach(item -> System.out.println(item));
		data.forEach(System.out::println);

		System.out
				.println("================writing conditions in java7======================");

		List<String> filterData = filterData(data, "Gorge");
		for (String string : filterData) {
			System.out.println(string);
		}
		System.out
				.println("=========================java8=====================");

		List<String> collect = data.stream()
				.filter(item -> !"Gorge".equals(item))
				.collect(Collectors.toList());
		System.out.println(collect);
	}

	private static List<String> filterData(List<String> data, String inputName) {
		// TODO Auto-generated method stub
		List<String> result = new ArrayList<String>();
		for (String name : data) {
			if (!inputName.equals(name))
				result.add(name);
		}
		return result;
	}

}
