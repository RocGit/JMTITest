package com.hyronjs.mtitest;

public class MainClass {
	public static void main(String[] args) {
		Car car = new Car();
		car.speedUp(20);
		Car car2 = car;
		car2.speedUp(10);
		System.out.println("car のスピードは" + car.getSpeed() + "です。");
		System.out.println("car2 のスピードは" + car2.getSpeed() + "です。");
		
		Car car3 = new Car();
		System.out.println("car==car3\t" + (car==car3));
		car3 = car2;
		car3.speedUp(40);
		System.out.println("car3.getSpeed()\t" + car3.getSpeed());
		System.out.println("car2.getSpeed()\t" + car2.getSpeed());
		System.out.println("car==car3\t" + (car==car3));
		
		//Enum Test
		System.out.println(TestEnum.morning);
		System.out.println(TestEnum.morning.ordinal());
	}
}

class Car {
	private int speed;

	public Car() {
		this.speed = 0;
	}

	public void speedUp(int speed) {
		this.speed += speed;
	}

	public int getSpeed() {
		return this.speed;
	}

}
