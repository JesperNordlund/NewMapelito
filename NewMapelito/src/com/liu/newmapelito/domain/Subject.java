package com.liu.newmapelito.domain;

public interface Subject {
	
	public void attachObserver(Observer o);
	public void detachObserver(Observer o);
	public void notifyObserver();
	public Object getUpdate(Observer o);
	
	

}
