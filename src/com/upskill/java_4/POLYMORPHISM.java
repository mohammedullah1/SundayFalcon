package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class POLYMORPHISM extends MethodType {

	public static void main(String[] args) {
		car(7, "SUV");
	}

	public static void car() {
		System.out.println("my car is Tesla !");
	}

	public static void car(int door) {
		System.out.println("my car is Tesla !, it has door : " + door);
	}

	public static void car(String color) {
		System.out.println("My car is Tesla !, it has color : " + color);

	}

	public static void car(Boolean dualmotor) {
		System.out.println("my car is Tesla !, it has dualmotor : " + dualmotor);
	}

	public static void car(int seat, String bodyType) {
		System.out.println("my car is Tesla !, it has seat : " + seat + "it has bodyType : " + bodyType);

	}

	public static void car(int tire, int wheel) {
		System.out.println("my car is Tesla !, it has tire : " + tire + "it has wheel : " + wheel);

	}

}