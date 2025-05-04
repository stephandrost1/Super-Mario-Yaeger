package org.example.entities.texts.titleScene;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import javafx.scene.paint.Color;
import org.example.utils.FileManager;
import org.example.utils.FontManager;

public class TotalCoinsText extends TextEntity {
    public TotalCoinsText(final Coordinate2D initialPosition) {
        super(initialPosition);

        setFont(FontManager.getPressStartFont(16));
        setFill(Color.WHITE);
        setText();
    }

    public void setText() { setText(getTotalCoins()); }

    public String getTotalCoins() {
        return FileManager.read("coins", "0");
    }
}
