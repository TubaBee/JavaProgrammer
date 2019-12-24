package com.class36;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


//create a casr class that will have variables, methods and constructor
	
//create a map taht hold car number and car objects store in it 
class Car{
	String make,model;
	Car(String make, String model){
		this.make=make;
		this.model=model;
	}
	public void display() {
		System.out.println(make+" "+model);
	}
}
	
public class CarTest {	
	public static void main(String[] args) {
		Map<Integer, Car> mapCar=new LinkedHashMap<>();
		mapCar.put(1, new Car("BMW","X5"));
		mapCar.put(2, new Car("Tesla","S"));
		mapCar.put(3, new Car("Mercedes","S5"));
		mapCar.put(4, new Car("Toyota","Rav4"));
		mapCar.put(5, new Car("Honda","Civic"));
		mapCar.put(6, new Car("Lincoln","Mkc"));
		
		//display only values objects
		Collection<Car> coll=mapCar.values();
		for (Car c : coll) {
			System.out.println(c.make+"--"+c.model);
			c.display();
		}
		
		System.out.println(mapCar.size());
		//map key to its corresponding values (entrySet)
		Set<Entry<Integer, Car>> set=mapCar.entrySet();
		for(Entry<Integer, Car> ent:set) {
//			Integer i=ent.getKey();
//			Car c=ent.getValue();			boylede yapilabilirdi
			
			System.out.println("Key "+ent.getKey()+" is associated with value of "+ent.getValue().make+" "+ent.getValue().model);
		}
		
		//using keyset to map keys to values
		Set<Integer> keyset=mapCar.keySet();
		for(int key:keyset) {
			//				  Integer+ map object --->value object(car type)
		//	System.out.println(key+"="+mapCar.get(key).make+"_"+mapCar.get(key).model);
			Car car=mapCar.get(key);
			String carDetail=car.make+"-"+car.model;
			System.out.println(key+"="+carDetail);
		}
		
		//use Iterator to iterate through values, keySet, entrySet 
		Iterator<Entry<Integer,Car>> it=mapCar.entrySet().iterator();
				while(it.hasNext()) {
			
		//	System.out.println(it.next().getKey()+"~~"+it.next().getValue().make+"~~"+it.next().getValue().model.up);
		}
		
	}

}
