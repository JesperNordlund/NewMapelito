package com.liu.newmapelito.domain;

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
		
			
		}
		
	

	@Override
	public void setSubject(Subject subject) {
		this.subject = subject;
		
	}

}
