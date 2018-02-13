package com.liu.newmapelito.domain;


import com.liu.newmapelito.ui.swing.MapWindow;

public class Mapelito implements Subject{
	
	private static Mapelito instance;
	private int state = 1;
	private Observer observer;

	
	private MapWindow map;
	
	public Mapelito() {
		attachObserver(MapelitoObserver.getInstance());
		MapelitoObserver.getInstance().setSubject(this);
	}
	
	public static synchronized Mapelito getInstance(){
        if(instance == null){
            instance = new Mapelito();
        }
        return instance;
    }

	public int getState() {
		return state;
	}

	public void setState(int state) {
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
		observer = MapelitoObserver.getInstance();
		MapelitoObserver.getInstance().setSubject(this);
	}

	@Override
	public void detachObserver(Observer o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObserver() {
            observer.update();		
	}

	@Override
	public Object getUpdate(Observer o) {
		// TODO Auto-generated method stub
		return null;
	}

		

}
