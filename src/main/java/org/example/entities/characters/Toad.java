package org.example.entities.characters;

import com.github.hanyaeger.api.Coordinate2D;

public class Toad extends CharacterPlayer {

    public final String NAME = "Toad";
    public final int HEALTH = 100;
    public final int SPEED = 5;
    public final int JUMP_HEIGHT = 10;

    public Toad(Coordinate2D location) {
        super(getSpritePath(), location);
    }

    public static String getSpritePath() {
        return "sprites/characters/toad.png";
    }
}
