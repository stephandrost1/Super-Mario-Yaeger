package org.example.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.DynamicScene;

import org.example.SuperMarioYaeger;
import org.example.entities.Collision.Floor;
import org.example.entities.characters.CharacterPlayer;
import org.example.entities.characters.Luigi;
import org.example.entities.characters.Mario;
import org.example.entities.characters.Toad;
import org.example.utils.FileManager;

public class LevelScene extends DynamicScene {

    private SuperMarioYaeger superMarioYaeger;
    private CharacterPlayer currentCharacter;

    public LevelScene(SuperMarioYaeger superMarioYaeger) {
        this.superMarioYaeger = superMarioYaeger;
    }

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/level-scene.mp3");
        setBackgroundImage("backgrounds/level-scene.png");
        currentCharacter = createCharacter();
    }

    @Override
    public void setupEntities() {
        addEntity(currentCharacter);
        
        var bottomFloor = new Floor(new Coordinate2D(0, 565), //grass level
                new Size(800, 10));
        addEntity(bottomFloor);
        
        var secondFloor = new Floor(new Coordinate2D(400, 400),
                new Size(150, 10));
        addEntity(secondFloor);

    }

    private CharacterPlayer createCharacter() {
        String characterName = FileManager.read("selectedCharacter", "mario");
        Coordinate2D initialPosition = new Coordinate2D(10, getHeight() - 125);

        return switch (characterName.toLowerCase()) {
            case "luigi" -> new Luigi(initialPosition);
            case "toad" -> new Toad(initialPosition);
            default -> new Mario(initialPosition);
        };
    }
}
