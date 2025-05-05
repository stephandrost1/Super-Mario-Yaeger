package org.example.entities.buttons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;
import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import org.example.SuperMarioYaeger;
import org.example.utils.FontManager;

public class OptionsButton extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {

    private final SuperMarioYaeger superMarioYaeger;

    public OptionsButton(Coordinate2D initialPosition, SuperMarioYaeger superMarioYaeger) {
        super(initialPosition, "Options");
        this.superMarioYaeger = superMarioYaeger;

        setFill(Color.WHITE);
        setFont(FontManager.getPressStartFont(16));
    }

    @Override
    public void onMouseButtonPressed(final MouseButton button, final Coordinate2D coordinate2D) {
         // TODO: Make options scene
    }

    @Override
    public void onMouseEntered() {
        setCursor(Cursor.HAND);
    }

    @Override
    public void onMouseExited() {
        setCursor(Cursor.DEFAULT);
    }
}
