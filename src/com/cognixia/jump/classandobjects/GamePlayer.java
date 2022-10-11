package com.cognixia.jump.classandobjects;

public interface GamePlayer {

	//a variable in an interface is public, static, and final, ALWAYS
	// same as public static final PLAYER_NUMBER = 1;
	int PLAYER_NUMBER = 1;
	
	
	
	//public abstract void checkGameStatus(); is the same as below,
	//all methods are public, and abstract
	void checkGameStatus();
	
}
