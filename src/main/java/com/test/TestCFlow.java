package com.test;

public class TestCFlow {
	public void foo(String s) {
		System.out.println("foo......" + s);
	}

	public void bar(String s) {
		foo("in bar");
		System.out.println("bar........." + s);
	}

	public void testMethod() {
		bar("testMethod");
		foo("testMethod");
	}
}
