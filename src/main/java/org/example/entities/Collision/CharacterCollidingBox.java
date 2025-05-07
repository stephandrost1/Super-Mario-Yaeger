package org.example.entities.Collision;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;
import javafx.scene.paint.Color;


public abstract class CharacterCollidingBox extends RectangleEntity implements Collider {
	
	public static final double OPACITY = 0;
    private static final Color COLOR = Color.RED;

    public CharacterCollidingBox(final Coordinate2D initialLocation, final Size size) {
        super(initialLocation, size);
        setAnchorPoint(AnchorPoint.BOTTOM_LEFT);
        setFill(COLOR);
       // setOpacity(OPACITY);
    }
}

