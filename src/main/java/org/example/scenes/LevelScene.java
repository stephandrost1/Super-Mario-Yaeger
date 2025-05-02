package org.example.scenes;

import com.github.hanyaeger.api.scenes.StaticScene;
import org.example.SuperMarioYaeger;

public class LevelScene extends StaticScene {

    private SuperMarioYaeger superMarioYaeger;

    public LevelScene(SuperMarioYaeger superMarioYaeger) {
        this.superMarioYaeger = superMarioYaeger;
    }

    @Override
    public void setupScene() {
        // Set up the level scene here
    }

    @Override
    public void setupEntities() {
        // Set up entities for the level scene here
    }
}
