package javaclasses.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MapTest {
	
	private class Employee{
		
		private Employee(int id, String name){
			this.id = id;
			this.name = name;
		}
		int id;
		String name;
		private int getId(){
			return id;
		}
		
		private String getName(){
			return name;
		}
		
		private void setId(int id){
			this.id = id;
		}
		
		private void setName(String name){
			this.name = name;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return String.format("[%s,%s]", id, name);
		}
	}
	
	Map<String,Employee> m = new HashMap<>();
	@Before
	public  void createMap(){
		m.put("ravi", new Employee(1, "ravi"));
		m.put("suresh", new Employee(2, "suresh"));
	}
	
	@Test
	public void putAllTest(){
		Map<String,Employee> mall = new TreeMap<>();
		mall.putAll(m);
		mall.put("kishore", new Employee(3,"kishore"));
		System.out.println("size of map is: "+mall.size());
		Set<Entry<String,Employee>> se = mall.entrySet();
		for (Entry<String,Employee> e:se){
			System.out.print("key: "+e.getKey());
			System.out.print(" value: "+e.getValue());
			System.out.println();
		}
		
	}

}