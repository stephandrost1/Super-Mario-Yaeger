package org.example.entities.characters;

import com.github.hanyaeger.api.Coordinate2D;

public class Mario extends Character {

    public final String NAME = "Mario";
    public final int HEALTH = 100;
    public final int SPEED = 5;
    public final int JUMP_HEIGHT = 10;

    public Mario(Coordinate2D location) {
        super(getSpritePath(), location);
    }

    public static String getSpritePath() {
        return "sprites/characters/mario.png";
    }
}
