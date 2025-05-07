package org.example.entities.Collision;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import org.example.entities.characters.CharacterPlayer;


import java.util.List;

public class CharacterCollision extends CharacterCollisionBox {

    public CharacterCollision(final Coordinate2D initialLocation, final CharacterPlayer characterComposition) {
        super(initialLocation, characterComposition, new Size(18, 40));
    }
    @Override
    public void onCollision(final List<Collider> collidingObjects) {
        for (var collider : collidingObjects) {
            if (parent != null && collider instanceof Floor floor) {
                parent.handleCollision(floor);
            }
        }
    }
}


