package main;

import java.util.ArrayList;
import java.util.List;


public class MainClass {

	public static void main(String[] args) {
		
		//Stream API demonstration
		List<Integer> mylist = new ArrayList<>();
		mylist.add(2);
		mylist.add(5);
		mylist.add(6);
		mylist.add(8);
		mylist.add(10);
		mylist.add(9);
		
		//filter : to find even numbers in the list
		mylist.stream().filter(a -> a%2==0).forEach(System.out::println);
		
		//reduce : to find maximum number
		Integer maxNum = mylist.stream().reduce((a1,a2) -> a1>a2 ?a1 :a2).get();
		System.out.println("max number is - " + maxNum);
		
		//reduce : to find sum of all elements in the list
		Integer sum = mylist.stream().reduce((a,b) -> a + b).get();
		System.out.println("sum of all elements - " + sum);
		
		
		
		

	}

}
