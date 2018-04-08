package com.youyisky.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListService extends Thread {
	public static Vector<String> vector = new Vector<String>();
	public String name;

	public ListService(String s) {
		this.name = s;
	}

	public static void arraylistTest() {
		List<String> arraylist = new ArrayList<String>();

		for (int i = 0; i < 100; i++) {

			arraylist.add("" + i);
		}
		System.out.println(arraylist.size());

	}

	public static void vectorTest(String s) {

		for (int i = 0; i < 10; i++) {
			try {
				sleep((int) Math.random() * 10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			vector.add(" " + i + s);
			System.out.println(i + s);
		}

	}

	public void run() {
		vectorTest(name);
	}

	public static void main(String[] args) throws InterruptedException {

		ListService mTh1 = new ListService("A");
		ListService mTh2 = new ListService("B");
		mTh1.start();
		mTh2.start();
		mTh1.isAlive();
//		mTh1.stop();
		/* arraylistTest(); */
		// vectorTest("");

	}

}
