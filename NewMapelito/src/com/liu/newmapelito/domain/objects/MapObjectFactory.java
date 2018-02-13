package com.liu.newmapelito.domain.objects;

public class MapObjectFactory {
	
	private static MapObjectFactory instance;
	
    public static synchronized MapObjectFactory getInstance(){
        if(instance == null){
            instance = new MapObjectFactory();
        }
        return instance;
    }
	
	public MapObject getObject(ObjectType type) {
		
		if(type == null) {
			return null;
		}
		
		if(type == ObjectType.TOILET) {
			return new MapObject(type);
		}
		if(type == ObjectType.FOUNTAIN) {
			return new MapObject(type);
		}
		if(type == ObjectType.DRINKING_FOUNTAIN) {
			return new MapObject(type);
		}
		if(type == ObjectType.STATUE) {
			return new MapObject(type);
		}
		if(type == ObjectType.HANDICAP_TOILET) {
			return new MapObject(type);
		}
		if(type == ObjectType.PARKBENCH) {
			return new MapObject(type);
		}
		
		return null;
		
		
	}
	


}
