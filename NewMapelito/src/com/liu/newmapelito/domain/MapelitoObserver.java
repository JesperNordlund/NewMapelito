package com.liu.newmapelito.domain;

import com.liu.newmapelito.ui.swing.MenuPanel;

public class MapelitoObserver implements Observer{
	
	private Subject subject;
	
	private static MapelitoObserver instance;
	
    public Subject getSubject() {
		return subject;
	}

	public static synchronized MapelitoObserver getInstance(){
        if(instance == null){
            instance = new MapelitoObserver();
        }
        return instance;
    }

	@Override
	public void update() {
		if(Mapelito.getInstance().getState().equals(State.addMapObject)) {
			MenuPanel.getInstance().initialize();
		}
		
	}

	@Override
	public void setSubject(Subject subject) {
		this.subject = subject;
		
	}

}
