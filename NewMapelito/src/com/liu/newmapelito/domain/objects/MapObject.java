package com.liu.newmapelito.domain.objects;

public class MapObject {
	
	ObjectType type = null;

	public MapObject(ObjectType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return type.toString();
	}
	
	
}
