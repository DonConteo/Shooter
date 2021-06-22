package shooterGame;

import javafx.animation.Transition;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class SpriteAnimation extends Transition {

    private ImageView imageView;
    private final int count;
    private final int column;
    private int offsetX;
    private int offsetY;
    private final int width;
    private final int height;

    public SpriteAnimation(ImageView imageView, Duration duration, int count, int column, int offsetX, int offsetY, int width, int height) {
        this.imageView = imageView;
        this.count = count;
        this.column = column;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.width = width;
        this.height = height;
        this.imageView.setViewport(new Rectangle2D(offsetX, offsetY, width, height));
    }

    public void setOffsetX(int offsetX) {
        this.offsetX = offsetX;
    }
    public void setOffsetY(int offsetY) {
        this.offsetY = offsetY;
    }

    public void interpolate(double frac) {
        final int index = Math.min((int) Math.floor(count * frac), count - 1);
        final int x = (index/column) * width + offsetX;
        final int y = (index/column) * height + offsetY;
        imageView.setViewport(new Rectangle2D(x, y, width, height));
    }
}
