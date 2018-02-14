package com.liu.newmapelito.domain.objects;


public class MapObject {
	
	private ObjectType objectType;
	private int posX;
	private int posY;
	
	public MapObject(ObjectType objectType, int posX, int posY) {
		this.objectType = objectType;
		this.posX = posX;
		this.posY = posY;
	}
	
	
	
	public ObjectType getObjectType() {
		return objectType;
	}
	public void setObjectType(ObjectType objectType) {
		this.objectType = objectType;
	}
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}

	
}
