package com.zensar.training.bean;

import org.springframework.stereotype.Component;

@Component(value="sqr")
public class Square implements Shape{
		int size;

		public Square(int size) {
			super();
			this.size = size;
		}

		public Square() {
			super();
		}

		public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
		}

		@Override
		public String toString() {
			return "Square [size=" + size + "]";
		}
		
		public double getArea() {
			return this.size*this.size;
		}

		@Override
		public double computeArea() {
			return this.getArea();
		}
}
