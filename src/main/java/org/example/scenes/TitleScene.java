package org.example.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;
import org.example.SuperMarioYaeger;
import org.example.entities.buttons.QuitButton;
import org.example.entities.buttons.StartButton;
import org.example.entities.texts.titleScene.TotalCoinsText;

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
        var entitiesMargin = 20.0;

        // StartGameButton
        var startGameButton = new StartButton(new Coordinate2D(entitiesMargin, getHeight() / 2 - entitiesMargin * 2), superMarioYaeger);
        startGameButton.setAnchorPoint(AnchorPoint.TOP_LEFT);
        addEntity(startGameButton);

        // QuitGameButton
        var quitGameButton = new QuitButton(new Coordinate2D(entitiesMargin, getHeight() / 2), superMarioYaeger);
        quitGameButton.setAnchorPoint(AnchorPoint.TOP_LEFT);
        addEntity(quitGameButton);

        // TotalCoinsText
        var totalCoinsText = new TotalCoinsText(new Coordinate2D(entitiesMargin, getHeight() / 2 + entitiesMargin * 2));
        totalCoinsText.setAnchorPoint(AnchorPoint.TOP_LEFT);
        addEntity(totalCoinsText);
    }

    // TODO: Build a switch to select the correct character in superMarioYaeger (selectedCharacter, selectedCharacterLives)
}
