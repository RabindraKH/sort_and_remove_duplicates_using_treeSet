package com.sort_and_remove_duplicates_using_treeSet;
import java.util.Scanner;
import java.util.TreeSet;
public class A {

	public static void main(String args[]) {
		//Scanner class used for user input and the TreeSet used for sort and unique numbers
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=scan.nextInt();
		int [] array = new int[size];
		
		
		System.out.println("Enter the elements of array:");
		for(int i=0;i<size;i++) {
			int num=scan.nextInt();
			array[i]=num;
		}
		
		TreeSet <Integer> ts= new TreeSet();
		for(int i=0;i<size;i++) {
			ts.add(array[i]);
		}
		System.out.println("Below is your sorted and deplicates removed array:");
		System.out.println(ts);
	}
}
