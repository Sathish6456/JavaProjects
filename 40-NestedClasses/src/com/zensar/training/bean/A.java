package com.zensar.training.bean;

public class A {
	private int x;
	private static int y;
	
	void test() {
		B obj=new B(8);
		System.out.println(obj.a);
	}
	
	public class B{
		private int a;
	
		public B(int a) {
			super();
			this.a = a;
		}

		void m1() {
			System.out.println(x);
			System.out.println(y);
		}
	}
	
	public static class C{
		void m2() {
			System.out.println(y);
		}
	}
	
	public void calc() {
		class Calculator {
			int sum(int a, int b) {
				System.out.println(x);
				System.out.println(y);
				return a+b;
			}
			int subtract(int a, int b) {
				return a-b;
			}
			int multiply(int a, int b) {
				return a*b;
			}
			int divide(int a, int b) {
				return a/b;
			}
			
		}
		
		Calculator calculator=new Calculator();
	}

}
