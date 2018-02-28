package com.liu.newmapelito.domain.objects;

public class MapObjectFactory {
	
	private static MapObjectFactory instance;
	
    public static synchronized MapObjectFactory getInstance(){
        if(instance == null){
            instance = new MapObjectFactory();
        }
        return instance;
    }
	
    /**
     * Returns a map object of chosen type
     * @param objectType
     * @param posX
     * @param posY
     * @return
     */
	public MapObject createObject(ObjectType objectType, int posX, int posY) {
		
		if(objectType == null) {
			return null;
		}
		
		if(objectType == ObjectType.TOILET) {
			return new Toilet(posX, posY);
		}
		if(objectType == ObjectType.FOUNTAIN) {
			return new Fountain(posX, posY);
		}
		if(objectType == ObjectType.MONUMENT) {
			return new Monument(posX, posY);
		}
		if(objectType == ObjectType.HANDICAP_TOILET) {
			return new HandicapToilet(posX, posY);
		}
		if(objectType == ObjectType.PARKBENCH) {
			return new Parkbench(posX, posY);
		}
		
		return null;
				
	}
	


}
