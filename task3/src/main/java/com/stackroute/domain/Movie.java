package com.stackroute.domain;

public class Movie {
	
    Actor actor = new Actor();
    public Movie(){}

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

}
