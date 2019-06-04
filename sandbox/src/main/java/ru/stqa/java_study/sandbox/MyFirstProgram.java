package ru.stqa.java_study.sandbox;

public class MyFirstProgram {
	public static void main(String[] args) {
		hello("world");
		hello("user");
		hello("Anastasia");

		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(4, 6); //Будут передаваться в качестве параметров в конструктор
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());


	}
	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");

	}



}