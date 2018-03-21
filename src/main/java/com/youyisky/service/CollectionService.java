package com.youyisky.service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionService {

	public static void main(String[] args) {
		// CollectionTest();
		ArrayTest();
		System.out.println("2>>3运算的结果是 :"+(64>>5));
	}

	public static void CollectionTest() {
		Collection<Integer> a = new ArrayList<Integer>(109991000);
		// a.add("syteksdjh");
		System.out.println(a.isEmpty());

		for (int i = 1; i < Integer.MAX_VALUE; i++) {

			a.add(i);
			System.out.println(i);
		}
	}

	public static void ArrayTest() {
		int[] a = { 1, 3, 2, 4, 5, 6, 3, 55, 3, 245, 43, 23, 35, 33, 5, 86, 6, 45, 44, 34, 53, 3453, 34, 6, 56, 5, 46,
				98 };
//		List<int[]> as = Arrays.asList(a);
		Arrays.parallelSort(a);
		
		for(int as:a) {
			System.out.println(as);
		}
		
//		System.out.print(as.size());
	};

}
