package com.cognixia.jump.classandobjects;

public class AbstractClassAndInterfaceDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Showing inheritance and ploymorphism in instantiating objects
		BasketBallPlayer bBallPlayer = new BasketBallPlayer();
		TeamSport bBallPlayer2 = new BasketBallPlayer();
		//Limits the methods available depending on how object is called
		//with interfaces, only methods inside interface can be used
		BallPlayer bBallPlayer3 = new BasketBallPlayer();
		GamePlayer bBallPlayer4 = new BasketBallPlayer();
		
		BallPlayer.showClock();
		//as stated above, Ex, this is possible for BallPlayer version
		bBallPlayer3.catchBall();
		//bBallPlayer3.checkGameStatus(); is not possible bc its located in
		//GamePlayer interface, depending on how object is instantiated
		//certain methods can or cannot be used.
		// Class/Interface name = new Instance();
		bBallPlayer4.checkGameStatus();
	
	}

}
