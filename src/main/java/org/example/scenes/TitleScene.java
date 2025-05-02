package org.example.scenes;

import com.github.hanyaeger.api.scenes.StaticScene;
import org.example.SuperMarioYaeger;

public class TitleScene extends StaticScene {

    private SuperMarioYaeger superMarioYaeger;

    public TitleScene(SuperMarioYaeger superMarioYaeger) {
        this.superMarioYaeger = superMarioYaeger;
    }

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/title-screen.mp3");
        setBackgroundImage("backgrounds/title-screen.png");
    }

    @Override
    public void setupEntities() {
        //
    }
}
