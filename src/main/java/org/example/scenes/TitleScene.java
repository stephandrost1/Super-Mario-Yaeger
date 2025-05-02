package org.example.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;
import org.example.SuperMarioYaeger;
import org.example.entities.buttons.QuitButton;
import org.example.entities.buttons.StartButton;

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
        var buttonMargin = 20.0;
        var startGameButton = new StartButton(new Coordinate2D(buttonMargin, getHeight() / 2 - 40), superMarioYaeger);
        startGameButton.setAnchorPoint(AnchorPoint.TOP_LEFT);
        addEntity(startGameButton);

        var quitGameButton = new QuitButton(new Coordinate2D(buttonMargin, getHeight() / 2 + 40), superMarioYaeger);
        quitGameButton.setAnchorPoint(AnchorPoint.TOP_LEFT);
        addEntity(quitGameButton);
    }
}
