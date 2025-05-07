package org.example.entities.Collision;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;


public class Floor extends CharacterCollidingBox {

	public Floor(Coordinate2D initialLocation, Size size) {
        super(initialLocation, size);
	}
}
