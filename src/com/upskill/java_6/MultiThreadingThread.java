package com.upskill.java_6;

public class MultiThreadingThread{

public static void main(String[] args) {
	
	int n = 4;
	for(int i = 0; i < n; i++) {
		MultiThreadingThread obj = MultiThreadingThread();
		obj.start();
	}
