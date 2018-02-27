package com.liu.newmapelito.domain;


import java.util.List;

import com.liu.newmapelito.ui.Presenter;
import com.liu.newmapelito.ui.swing.MapWindow;

public class Mapelito implements Subject{
	
	private static Mapelito instance;
	private State state = State.browsingState;
	private List<Observer> observers;

	
	private MapWindow map;
	
	public Mapelito() {
		attachObserver(MapelitoObserver.getInstance());
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
		
	}
	
	@Override
	public String toString() {
		return "Mapelito is in" + state;
	}

	public MapWindow getMap() {
		return map;
	}

	public void setMap(MapWindow map) {
		this.map = map;
	}

	@Override
	public void attachObserver(Observer o) {
		observers.add(o);
		o.setSubject(this);
		
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
