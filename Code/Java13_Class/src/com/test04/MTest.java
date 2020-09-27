package com.test04;

public class MTest {
	public static void main(String[] args) {
		
		Car sportscar = new SportsCar();
		sportscar.accelPedal();
		sportscar.accelPedal();
		System.out.println(sportscar);
		
		sportscar.breakPedal();
		sportscar.breakPedal();
		sportscar.breakPedal();
		System.out.println(sportscar);
		
		
		Car truck = new Truck("파란색");
		truck.accelPedal();
		truck.accelPedal();
		truck.accelPedal();
		System.out.println(truck);
		truck.breakPedal();
		truck.breakPedal();
		truck.breakPedal();
		System.out.println(truck); 
		//=System.out.println(truck.toString());
		
		
		
		
	}

}
