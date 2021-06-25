package shooterGame;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import shooterGame.weapon.Pistol;
import shooterGame.weapon.Weapon;

import java.util.HashMap;

public class Shooter extends Application {

//    final BooleanProperty wPressed = new SimpleBooleanProperty(false);
//    final BooleanProperty aPressed = new SimpleBooleanProperty(false);
//    final BooleanProperty sPressed = new SimpleBooleanProperty(false);
//    final BooleanProperty dPressed = new SimpleBooleanProperty(false);
//    final BooleanBinding waPressed = wPressed.and(aPressed);
//    final BooleanBinding asPressed = aPressed.and(sPressed);
//    final BooleanBinding sdPressed = sPressed.and(dPressed);
//    final BooleanBinding dwPressed = dPressed.and(wPressed);

    private HashMap<KeyCode, Boolean> keys = new HashMap<>();
    Pane root = new Pane();
    Weapon weapon = new Pistol();
    ImageView imageView = weapon.getImageView();
    Hero hero = new Hero(imageView, weapon);

    public void update() {
        moveHero();
    }

    public void moveHero() {
        if (isPressed(KeyCode.W) && isPressed(KeyCode.A)) {
            hero.moveXY(-5, -5);
        } else if (isPressed(KeyCode.A) && isPressed(KeyCode.S)) {
            hero.moveXY(-5, 5);
        } else if (isPressed(KeyCode.S) && isPressed(KeyCode.D)) {
            hero.moveXY(5, 5);
        } else if (isPressed(KeyCode.D) && isPressed(KeyCode.W)) {
            hero.moveXY(5, -5);
        } else if (isPressed(KeyCode.W)) {
            hero.moveY(-5);
        } else if (isPressed(KeyCode.S)) {
            hero.moveY(5);
        } else if (isPressed(KeyCode.A)) {
            hero.moveX(-5);
        } else if (isPressed(KeyCode.D)) {
            hero.moveX(5);
        }
    }

    public boolean isPressed(KeyCode keyCode) {
        return keys.getOrDefault(keyCode, false);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        root.setPrefSize(1900, 1080);
        root.getChildren().addAll(hero);
        Scene scene = new Scene(root);
        scene.setOnKeyPressed(event -> keys.put(event.getCode(), true));
        scene.setOnKeyReleased(event -> keys.put(event.getCode(), false));
        AnimationTimer animationTimer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                scene.setOnMouseMoved(event -> hero.rotateHero(event.getX(), event.getY(), hero.getTranslateX(), hero.getTranslateY()));
                scene.setOnMouseClicked(event -> hero.weapon.shoot());
                update();
            }
        };
        animationTimer.start();
        primaryStage.setTitle("Shooter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
