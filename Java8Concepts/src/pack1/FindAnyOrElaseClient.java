package pack1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAnyOrElaseClient {

	public static void main(String[] args) {

		List<Person> personList = Arrays.asList(new Person(1, "Raja"), new Person(2, "Ravi"), new Person(
				3, "Bhimal"), new Person(4, "Kallesh"));
		
		
		Person filterObjects = filterObjects(personList,"Raja");
		System.out.println(filterObjects);
		System.out.println("***********************java8****************************");
		
		Person person1 = personList.stream().filter(person->"Raja".equals(person.getName())).findAny().orElse(null);
		System.out.println(person1);
		
		List<String> collect = personList.stream().map(Person::getName).collect(Collectors.toList());
		collect.forEach(System.out::println);
		
		
	}

	private static Person filterObjects(List<Person> personList, String input) {
		// TODO Auto-generated method stub
		Person result = null;
		for (Person person : personList) {
			if(input.equals(person.getName()))
				result = person;
		}
		
		return result;
	}

}
