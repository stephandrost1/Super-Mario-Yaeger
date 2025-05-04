package org.example.entities.characters;

import com.github.hanyaeger.api.Coordinate2D;

public class Luigi extends Character {

    public final String NAME = "Luigi";
    public final int HEALTH = 100;
    public final int SPEED = 5;
    public final int JUMP_HEIGHT = 10;

    public Luigi(Coordinate2D location) {
        super(getSpritePath(), location);
    }

    public static String getSpritePath() {
        return "sprites/characters/luigi.png";
    }
}
