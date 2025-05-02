package org.example.entities.buttons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;
import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import org.example.SuperMarioYaeger;
import org.example.utils.FontManager;

public class StartButton extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {

    private final SuperMarioYaeger superMarioYaeger;

    public StartButton(Coordinate2D initialPosition, SuperMarioYaeger superMarioYaeger) {
        super(initialPosition, "Start game");
        this.superMarioYaeger = superMarioYaeger;

        setFill(Color.WHITE);
        setFont(FontManager.getPressStartFont(16));

        var background = new Rectangle(getWidth(), getHeight(), Color.WHITE);
        background.setOpacity(0.25);
    }

    @Override
    public void onMouseButtonPressed(final MouseButton button, final Coordinate2D coordinate2D) {
         superMarioYaeger.setActiveScene(1);
    }

    @Override
    public void onMouseEntered() {
        setFill(Color.WHITE);
        setCursor(Cursor.HAND);
    }

    @Override
    public void onMouseExited() {
        setFill(Color.WHITE);
        setCursor(Cursor.DEFAULT);
    }
}
