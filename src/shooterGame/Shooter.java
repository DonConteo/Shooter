package shooterGame;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import shooterGame.weapon.Pistol;
import shooterGame.weapon.Weapon;

import java.util.HashMap;

public class Shooter extends Application {

    private HashMap<KeyCode, Boolean> keys = new HashMap<>();
    Pane root = new Pane();
    Image calm = new Image(String.valueOf(getClass().getResource("resource/image/HeroPistol.png")));
    Weapon weapon = new Pistol();
    ImageView imageView = new ImageView(weapon.getCalm());
    Hero hero = new Hero(imageView);

    public void update() {
        moveHero();
    }

    public void moveHero() {
        if (isPressed(KeyCode.W)) {
            hero.moveY(-5);
        } else if (isPressed(KeyCode.S)) {
            hero.moveY(5);
        } else if (isPressed(KeyCode.A)) {
            hero.moveX(-5);
        } else if (isPressed(KeyCode.D)) {
            hero.moveX(5);
        }
        if (isPressed(KeyCode.R)) {

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
