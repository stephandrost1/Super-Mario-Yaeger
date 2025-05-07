package org.example.entities.Collision;

import org.example.entities.characters.CharacterPlayer;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;
import javafx.scene.paint.Color;

public abstract class CharacterCollisionBox extends RectangleEntity implements Collided {
	
	CharacterPlayer parent;
	
	public CharacterCollisionBox(final Coordinate2D initialLocation, final CharacterPlayer parent, Size size) {
        super(initialLocation, size);
        this.parent = parent;
        setFill(Color.RED);
	}
}
	
