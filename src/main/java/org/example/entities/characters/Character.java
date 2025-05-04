package org.example.entities.characters;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class Character extends DynamicSpriteEntity {
    public Character(String spritePath, Coordinate2D location) {
        super(spritePath, location);
    }
}
