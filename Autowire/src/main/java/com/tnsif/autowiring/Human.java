package com.tnsif.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	private Heart heart; //creating reference of heart class in human 

	public Human() {
		super();
	}

	public Human(Heart heart) {
		super();
		this.heart = heart;
	}

	public Heart getHeart() {
		return heart;
	}
	@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void startPumping() {
		if(heart!=null) {
			heart.pump();
		}
		else {
			System.out.println("DEAD");

		}
	}
}
