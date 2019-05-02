package com.stackroute.domain;

public class Movie {

	Actor actor1=new Actor();
	Actor actor2=new Actor();

	public Movie(Actor actor) {
		this.actor1 = actor;
	}

	public Actor getActor() {
		return actor1;
	}
	public Movie(Actor actor1,Actor actor2) {
		this.actor1 = actor1;
		this.actor2=actor2;
	}

	@Override
	public String toString() {
		return "Movie [actor=" + actor1 + "]";
	}

	public void setActor(Actor actor) {
		this.actor1 = actor;
	}	
}
