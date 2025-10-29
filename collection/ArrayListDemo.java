package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>(); // ArrayList
		fruits.add("Apple");
		fruits.add("Grape");
		fruits.add("Orange");
		fruits.add("Pineaaple");
		fruits.add("Banana");

		LinkedList<Integer> num = new LinkedList<>();
		num.add(8);
		num.add(12);
		num.add(18);
		num.add(20);
		num.add(69);

		HashSet<String> cities = new HashSet<>();
		cities.add("Hydrabad");
		cities.add("chennai");
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Pune");

		LinkedHashSet<String> carbrands = new LinkedHashSet<>();
		carbrands.add("Volvo");
		carbrands.add("BMW");
		carbrands.add("Benz");
		carbrands.add("GMC");
		carbrands.add("Cadilaic");

		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(50);
		numbers.add(10);
		numbers.add(30);
		numbers.add(20);
		numbers.add(40); 

		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, " Apple");
		map.put(2, " Banana");
		map.put(8, " Cherry");
		map.put(9, " Butterfruit");
		map.put(5, " Orange");
		
		LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(1, "Red");
        map1.put(2, "Green");
        map1.put(3, "Blue");
        map1.put(4, "Yellow");
        map1.put(5, "Purple");
        
        TreeMap<Integer, String> map2 = new TreeMap<>();
        map2.put(30, "Dog");
        map2.put(10, "Cat");
        map2.put(50, "Horse");
        map2.put(40, "Cow");
        map2.put(20, "Goat");
        
		System.out.println("List of fruits: " + fruits);
		System.out.println("LinkedList: " + num);
		System.out.println("Hashset of cities: " + cities);
		System.out.println("LinkedHashset of cabrands: " + carbrands);
		System.out.println("Treeset of numbers: " + numbers);
		System.out.println("HasMap of fruits: " + map);
		System.out.println("LinkedHas of  colour: " + map1);
		System.out.println("TressMap Animals: " + map2);
	}

}
