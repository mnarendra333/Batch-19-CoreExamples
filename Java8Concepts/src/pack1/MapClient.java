package pack1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("John", 101);
		map.put("Miller", 109);
		map.put("Duster", 111);
		map.put("Smith", 105);
		map.put("Adams", 44);

		for (Entry<String, Integer> entryObj : map.entrySet()) {
			System.out.println("Name is : " + entryObj.getKey() + " Id is :"
					+ entryObj.getValue());
		}

		System.out.println("================java8=================");

		map.forEach((k, v) -> System.out.println("Name is :" + k + " Id is: "
				+ v));

		map.forEach((k, v) -> {
			if ("Adams".equals(k))
				System.out.println("Welcome " + k);
		});
		
		

	}

}
