package com.liu.newmapelito.domain.observer;

import com.liu.newmapelito.domain.Mapelito;
import com.liu.newmapelito.domain.Observer;
import com.liu.newmapelito.domain.State;
import com.liu.newmapelito.domain.Subject;
import com.liu.newmapelito.ui.views.AddMapObjectView;
import com.liu.newmapelito.ui.views.BrowsingView;

public class Presenter implements Observer{
	
	private Subject subject;
	private static Presenter instance;
	
	public static synchronized Presenter getInstance(){
        if(instance == null){
            instance = new Presenter();
        }
        return instance;
    }

	@Override
	public void update() {
		if(Mapelito.getInstance().getState().equals(State.addMapObject));{
			AddMapObjectView.getInstance().show();
		} 
		if(Mapelito.getInstance().getState().equals(State.browsingState)) {
			BrowsingView.getInstance().show();
		}
		
	}

	@Override
	public void setSubject(Subject sub) {
		subject = sub;
		
	}

}
