package org.example.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import org.example.SuperMarioYaeger;
import org.example.entities.characters.Character;
import org.example.entities.characters.Luigi;
import org.example.entities.characters.Mario;
import org.example.entities.characters.Toad;

public class LevelScene extends DynamicScene {

    private SuperMarioYaeger superMarioYaeger;
//    private Character currentCharacter;

    public LevelScene(SuperMarioYaeger superMarioYaeger) {
        this.superMarioYaeger = superMarioYaeger;

//        String selectedCharacterName = superMarioYaeger.selectedCharacter;
//        currentCharacter = createCharacter(selectedCharacterName);
    }

    @Override
    public void setupScene() {
        // Set up the level scene here
    }

    @Override
    public void setupEntities() {
        // Set up entities for the level scene here
    }

    // TODO: Implement character selection logic
//    private Character createCharacter(String characterName) {
//        return switch (characterName.toLowerCase()) {
//            case "luigi" -> new Luigi(new Coordinate2D(0, 0));
//            case "toad" -> new Toad(new Coordinate2D(0, 0));
//            default -> new Mario(new Coordinate2D(0, 0));
//        };
//    }
}
