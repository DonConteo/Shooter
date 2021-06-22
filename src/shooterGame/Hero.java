package shooterGame;

import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.transform.Rotate;
import shooterGame.weapon.Weapon;

import java.util.Set;

public class Hero extends Pane {

    ImageView imageView;
    private Weapon armedWeapon;
    private Set<Weapon> weapons;

    public Hero(ImageView imageView, Weapon armedWeapon, Set<Weapon> weapons) {
        this.imageView = imageView;
        this.armedWeapon = armedWeapon;
        this.weapons = weapons;
        getChildren().addAll(imageView);
    }

    public void moveX(int x) {
        boolean right = x > 0;
        for (int i = 0; i < Math.abs(x); i++) {
            if (right) {
                this.setTranslateX(this.getTranslateX() + 1);
            } else {
                this.setTranslateX(this.getTranslateX() - 1);
            }
        }
    }

    public void moveY(int y) {
        boolean down = y > 0;
        for (int i = 0; i < Math.abs(y); i++) {
            if (down) {
                this.setTranslateY(this.getTranslateY() + 1);
            } else {
                this.setTranslateY(this.getTranslateY() - 1);
            }
        }
    }

    public void rotateHero(double mouseX, double mouseY, double heroX, double heroY) {
        double deltaX = mouseX - (heroX+55);
        double deltaY = mouseY - (heroY+55);
        int angle = (int) ((360 + Math.toDegrees(Math.atan2(deltaY, deltaX))) % 360);
        this.setRotate(angle);
    }
}
