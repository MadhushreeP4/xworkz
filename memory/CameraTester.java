package com.xworkz.memory;

import com.xworkz.memory.camera.Camera;

public class CameraTester {

	public static void main(String[] args) {
		
		System.out.println(Camera.thing);
		System.out.println(Camera.startingPrice);

		Camera camera1 = new Camera();
		camera1.brand = "Canon";
		camera1.type = "DSLR";
		camera1.price = "252995";
		camera1.color = "Black";
		camera1.quality = "50.6MP";
		System.out.println(camera1.brand + " " + camera1.type + " " + camera1.price + " " + camera1.color + " " + camera1.quality);
		
		Camera camera2 = new Camera();
		camera2.brand = "Nikon";
		camera2.type = "COMPACT";
		camera2.price = "29999";
		camera2.color = "Silver";
		camera2.quality = "16MP";
		System.out.println(camera2.brand + " " + camera2.type + " " + camera2.price + " " + camera2.color + " " + camera2.quality);
		
		Camera camera3 = new Camera();
		camera3.brand = "Fujifilm";
		camera3.type = "InstaxMini";
		camera3.price = "5735";
		camera3.color = "Blue";
		camera3.quality = "18MP";
		System.out.println(camera3.brand + " " + camera3.type + " " + camera3.price + " " + camera3.color + " " + camera3.quality);
	}

}
