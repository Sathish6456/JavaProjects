package com.zensar.training.bean;

public class Person {
		int age;

		public Person(int age) {
			super();
			this.age = age;
		}

		public Person() {
			super();
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Person [age=" + age + "]";
		}
		
}
