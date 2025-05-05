package org.example.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;
import org.example.SuperMarioYaeger;
import org.example.entities.buttons.OptionsButton;
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
        setBackgroundAudio("audio/title-scene.mp3");
        setBackgroundImage("backgrounds/title-scene.png");
    }

    @Override
    public void setupEntities() {
        var baseX = 40;
        var baseY = getHeight() / 2 - baseX * 1.5 + 5;
        var spacing = 67.5;

        // StartGameButton
        var startGameButton = new StartButton(new Coordinate2D(baseX, baseY), superMarioYaeger);
        startGameButton.setAnchorPoint(AnchorPoint.TOP_LEFT);
        addEntity(startGameButton);

        // OptionsButton
        var optionsButton = new OptionsButton(new Coordinate2D(baseX, baseY + spacing), superMarioYaeger);
        optionsButton.setAnchorPoint(AnchorPoint.TOP_LEFT);
        addEntity(optionsButton);

        // QuitGameButton
        var quitGameButton = new QuitButton(new Coordinate2D(baseX, baseY + spacing * 2), superMarioYaeger);
        quitGameButton.setAnchorPoint(AnchorPoint.TOP_LEFT);
        addEntity(quitGameButton);

        // TotalCoinsText
        var totalCoinsText = new TotalCoinsText(new Coordinate2D(baseX + 25, baseY + spacing * 3));
        totalCoinsText.setAnchorPoint(AnchorPoint.TOP_LEFT);
        addEntity(totalCoinsText);
    }

    // TODO: Build a switch to select the correct character in superMarioYaeger (selectedCharacter, selectedCharacterLives)
}
