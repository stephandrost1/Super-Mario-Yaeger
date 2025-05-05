package org.example.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import org.example.SuperMarioYaeger;
import org.example.entities.characters.Character;
import org.example.entities.characters.Luigi;
import org.example.entities.characters.Mario;
import org.example.entities.characters.Toad;
import org.example.utils.FileManager;

public class LevelScene extends DynamicScene {

    private SuperMarioYaeger superMarioYaeger;
    private Character currentCharacter;

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
    }

    private Character createCharacter() {
        String characterName = FileManager.read("selectedCharacter", "mario");
        Coordinate2D initialPosition = new Coordinate2D(10, getHeight() - 125);

        return switch (characterName.toLowerCase()) {
            case "luigi" -> new Luigi(initialPosition);
            case "toad" -> new Toad(initialPosition);
            default -> new Mario(initialPosition);
        };
    }
}
