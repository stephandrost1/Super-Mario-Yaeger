package org.example.entities.characters;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.Newtonian;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.api.userinput.KeyListener;

import javafx.scene.input.KeyCode;
import com.github.hanyaeger.api.entities.*;
import java.util.HashSet;
import java.util.Set;

import org.example.entities.Collision.CharacterFloorCollisionBox;
import org.example.entities.Collision.Floor;

public class CharacterPlayer extends DynamicSpriteEntity implements KeyListener, SceneBorderTouchingWatcher, Newtonian {
    public boolean touchdown = true;
    private double direction;
    private static final Coordinate2D RIGHT_GROUND_ANCHOR_LOCATION = new Coordinate2D(25, 15);
    private static final Coordinate2D LEFT_GROUND_ANCHOR_LOCATION = new Coordinate2D(40, 15);
    private CharacterFloorCollisionBox verticalCollisionBox;
    
    private Set<KeyCode> latestPressedKeys = new HashSet<>();

    
    public CharacterPlayer(String spritePath, Coordinate2D location) {
        super(spritePath, location, new Size(60, 80), 1, 2);
    }
    
//    protected void setupEntities() {
//    
//    verticalCollisionBox = new CharacterFloorCollisionBox(RIGHT_GROUND_ANCHOR_LOCATION, this);
//    addEntity(verticalCollisionBox);
//    
//    }
  
	@Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
        if(pressedKeys.contains(KeyCode.LEFT)){
            setCurrentFrameIndex(0);
            setMotion(3, Direction.LEFT);
        } else if(pressedKeys.contains(KeyCode.RIGHT)){
            setCurrentFrameIndex(1);
            setMotion(3,Direction.RIGHT);
        } else if(pressedKeys.contains(KeyCode.UP)){
            addToMotion(7, Direction.UP);
            touchdown = false;
        } else {
            setSpeed(0);
        }
    }

    @Override
    public void notifyBoundaryTouching(SceneBorder sceneBorder) {
        setSpeed(0);

        switch(sceneBorder){
            case TOP:
                setAnchorLocationY(1);
                break;
            case BOTTOM:
                setAnchorLocationY(getSceneHeight() - getHeight() - 1);
                break;
            case LEFT:
                setAnchorLocationX(1);
                break;
            case RIGHT:
                setAnchorLocationX(getSceneWidth() - getWidth() - 1);
            default:
                break;
        }
    }
    @Override
    public double getDirection() {
        return direction;
    }
    
    public void handleCollision(final Floor ground) {
        setAnchorLocationY(ground.getBoundingBox().getMinY() + 1);
        nullifySpeedInDirection(Direction.DOWN);
        System.out.println("Collision");  //Temporary collision detection message
        touchdown = true;

        
        onPressedKeysChange(latestPressedKeys);
    }



}
