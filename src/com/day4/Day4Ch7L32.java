package com.day4;

import org.jetbrains.annotations.NotNull;

public class Day4Ch7L32 {
	public static void main(String[] args){
		System.out.println("Hello World welcome to method overloading!");
		//foo();
		foo(7,8,9);
		foo(4,3);
		foo(5,6);
		foo(1,2,3,4,5);
	}

	static void foo(int a, int b, int @NotNull ...varArg){//method to take variable arguments
		System.out.println("integers passed as arguments:");
		for (int i : varArg) {
			System.out.println(i);
		}
	}
/*
	//method overloading
	static int foo(float f){
		System.out.println("in int foo(float)");
		return (int) f;
	}

	static void foo(int i, int i1) {//foo() is overloaded here
		System.out.println("in foo(int,int):i:"+i+" , i1:"+i1);
	}

	static void foo(int i) {//foo() is overloaded here
		System.out.println("in foo(int):"+i);
	}

	static void foo(){//by default the access specifier is 'default' access specifier if we don't specify it
		System.out.println("in foo()");
	}
*/
}




















