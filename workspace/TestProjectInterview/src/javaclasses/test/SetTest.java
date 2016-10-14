package javaclasses.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class SetTest {

	@Test
	public void addValuesTest(){
		Set<Integer> values = new HashSet<Integer>();
		//only unique values are added to set
		values.add(2);
		values.add(3);
		values.add(2);
		System.out.println(values.size());
		
	}
	
	@Test
	public void orderTest(){
		Set<Integer> values = new TreeSet<Integer>();
		//values get ordered
		values.add(12);
		values.add(8);
		values.add(6);
		values.add(3);
		for (Integer i:values)
		System.out.println(i);
		
	}
	
	@Test
	public void addorderRetainedTest(){
		Set<Integer> values = new LinkedHashSet<Integer>();
		//values get ordered
		values.add(12);
		values.add(8);
		values.add(8);
		values.add(6);
		values.add(6);
		values.add(3);
		for (Integer i:values)
		System.out.println(i);
		
	}
	
	@Test
	public void getuniqueChars(){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Set<Character> setc = new LinkedHashSet<Character>();
		for (int i=0; i<s.length(); i++){
			setc.add(s.charAt(i));
		}
		
		for (Character c:setc){
			System.out.print(c);
		}
		System.out.println("\ntotal unique characters: "+setc.size());
		
		
	}

	@Test
	public void containsAllTest1(){
		String[] sa = {"ravi","suresh"};
		Set<String> sets = new HashSet<>();
		//converted aray to set
		Collections.addAll(sets, sa);
		System.out.println("initial size "+sets.size());
		//converted array to list
		if (sets.containsAll(Arrays.asList(sa)))
			System.out.println("all found");
		sets.clear();
		System.out.println("size after clear "+sets.size());
	}
	
	@Test
	public void containsAllTest2(){
		String[] sa = {"ravi","suresh"};
		Set<String> sets = new HashSet<>();
		//converted aray to set
		Collections.addAll(sets, sa);
		System.out.println("initial size "+sets.size());
		//converted array to list
		if (sets.containsAll(Arrays.asList("ravi", "kishore")))
			System.out.println("all found");
		else System.out.println("some not found");

	}
	
	@Test
	public void containsAllTest3(){
		//list elements which are not found

		Set<String> sets = new HashSet<>();
		//added array to set using comma separated values
		Collections.addAll(sets, "ravi", "suresh");
		System.out.println("initial size "+sets.size());
		//converted array to list using comma separated values
		if (sets.containsAll(Arrays.asList("ravi", "kishore")))
			System.out.println("all found");
		else {
			
			System.out.println("following elements not found");
			for (String s:Arrays.asList("ravi", "kishore")){
				if (!sets.contains(s)){
					System.out.println(s);
				}
			}
			
		}
	}
	@Test
	public void removeAllTest1(){
		String[] sa = {"ravi","suresh"};
		Set<String> sets = new LinkedHashSet<>();
		//converted aray to set
		Collections.addAll(sets, sa);
		System.out.println("initial size "+sets.size());
		//converted array to list, using constructor as the list created by method is immutable
		List<String> ls = new ArrayList<>(Arrays.asList(sa));
		ls.add("another string");
		List<String> ls1 = new ArrayList<>();
		ls1.add("another one");
		sets.add("new string");
		
		//remove all removes the values present in the collection, if any of them is not present ignores it
		//and removes others which are present and returns true, if none removed it returns false
		if (sets.removeAll(ls1))
			System.out.println("all removed");
		else System.out.println("none removed");
		System.out.println("size after remove "+sets.size());
		System.out.println(sets.iterator().next());
	}

	@Test
	public void removeAllTest2(){
		String[] sa = {"ravi","suresh"};
		Set<String> sets = new LinkedHashSet<>();
		//converted aray to set
		Collections.addAll(sets, sa);
		System.out.println("initial size "+sets.size());
		//converted array to list, using constructor as the list created by method is immutable
		//list created using comma separated values
		List<String> ls = new ArrayList<>(Arrays.asList("ravi","suresh","pink"));
		ls.add("another string");

		sets.add("new string");
		
		//remove all removes the values present in the collection, if any of them is not present ignores it
		//and removes others which are present and returns true, if none removed it returns false
		if (sets.removeAll(ls))
			System.out.println("all removed");
		else System.out.println("none removed");
		System.out.println("size after remove "+sets.size());
		System.out.println(sets.iterator().next());
	}
}
