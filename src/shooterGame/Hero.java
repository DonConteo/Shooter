package shooterGame;

import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class Hero extends Pane {

    ImageView imageView;

    public Hero(ImageView imageView) {
        this.imageView = imageView;
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
