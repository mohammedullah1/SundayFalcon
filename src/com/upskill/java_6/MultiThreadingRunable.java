package com.upskill.java_6;

public class MultiThreadingRunable{
	
	
	public void run() {
		
		try{
			System.out.println("Thread Number #" + Thread .currentThread().getId());
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	

}
