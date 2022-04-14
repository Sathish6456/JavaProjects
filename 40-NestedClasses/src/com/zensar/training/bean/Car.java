package com.zensar.training.bean;

import java.util.Arrays;

public class Car {
	Engine engine;
	Wheel[] wheels=new Wheel[4];
	
	public Car() {
		this.engine=new Engine();
		this.wheels=new Wheel[] {new Wheel(), new Wheel(), new Wheel(), new Wheel()};
	}
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Wheel[] getWheels() {
		return wheels;
	}
	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}
	@Override
	public String toString() {
		return "Car [engine=" + engine + ", wheels=" + Arrays.toString(wheels) + "]";
	}
	
	
	private class Engine {

		@Override
		public String toString() {
			return "Engine []";
		}

		
		
	}
	
	
	private class Wheel {

		@Override
		public String toString() {
			return "Wheel []";
		}

	}
	
	
}
