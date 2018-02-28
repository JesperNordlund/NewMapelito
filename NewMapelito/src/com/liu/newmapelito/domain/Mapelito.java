package com.liu.newmapelito.domain;


import java.util.List;

import com.liu.newmapelito.domain.observer.Presenter;
import com.liu.newmapelito.ui.swing.MapWindow;

public class Mapelito implements Subject{
	
	private static Mapelito instance;
	private State state = State.browsingState;
	private List<Observer> observers;

	
	public Mapelito() {
		attachObserver(Presenter.getInstance());

	}
	
	public static synchronized Mapelito getInstance(){
        if(instance == null){
            instance = new Mapelito();
        }
        return instance;
    }

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
		notifyObserver();
		System.out.println("State changed to" + state);
		
	}
	
	@Override
	public String toString() {
		return "Mapelito is in" + state;
	}


	@Override
	public void attachObserver(Observer o) {
		observers.add(o);
		o.setSubject(this);
		System.out.println("Observer attached");
		
	}

	@Override
	public void detachObserver(Observer o) {
		observers.remove(o);
		
	}

	@Override
	public void notifyObserver() {
		for(Observer o : observers)
            o.update();		
	}

	@Override
	public Object getUpdate(Observer o) {
		// TODO Auto-generated method stub
		return null;
	}
		

}
