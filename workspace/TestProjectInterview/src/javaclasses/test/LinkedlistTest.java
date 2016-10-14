package javaclasses.test;

import org.junit.Test;

public class LinkedlistTest {
	
	private class LinkedClass{
		private String getName() {
			return name;
		}
		private void setName(String name) {
			this.name = name;
		}
		private LinkedClass getNext() {
			return next;
		}
		private void setNext(LinkedClass l) {
			this.next = l;
		}
		private String name;
		private LinkedClass next;
		private LinkedClass(String name) {
			this.name= name;
		}
	}
	
	@Test
	public void simpleLinkedListtest(){
		
		//implemented by having same object within the class
		LinkedClass next1 = new LinkedClass("next1");
		LinkedClass next2 = new LinkedClass("next2");
		LinkedClass next3 = new LinkedClass("next3");
		LinkedClass main = new LinkedClass("main");
		next1.setNext(next2);
		next2.setNext(next3);
		main.setNext(next1);
		
		LinkedClass temp = main;

		while (temp != null){
			System.out.println(temp.getName());
			temp = temp.getNext();

		}
	}

}
