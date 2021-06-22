package shooterGame.weapon;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public abstract class Weapon implements Reloadable, Shootable {

    Image calm;
    Image shoot;
    Image reload;
    private int damage;
    private int loadedBullets;
    private int maxBullets;
    private int ammo;
    private int maxAmmo;
    private File fireSound;
    private int fireTime;
    private File reloadSound;
    private int reloadTime;
    private ImageView fireImage;
    private final File emptySound = new File("resource/sound/emptyWeapon.mp3");

    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getLoadedBullets() {
        return loadedBullets;
    }
    public void setLoadedBullets(int loadedBullets) {
        this.loadedBullets = loadedBullets;
    }

    public int getMaxBullets() {
        return maxBullets;
    }
    public void setMaxBullets(int maxBullets) {
        this.maxBullets = maxBullets;
    }

    public int getAmmo() {
        return ammo;
    }
    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }
    public void setMaxAmmo(int maxAmmo) {
        this.maxAmmo = maxAmmo;
    }

    public File getFireSound() {
        return fireSound;
    }
    public void setFireSound(File fireSound) {
        this.fireSound = fireSound;
    }

    public File getReloadSound() {
        return reloadSound;
    }
    public void setReloadSound(File reloadSound) {
        this.reloadSound = reloadSound;
    }

    public ImageView getFireImage() {
        return fireImage;
    }
    public void setFireImage(ImageView fireImage) {
        this.fireImage = fireImage;
    }

    public File getEmptySound() {
        return emptySound;
    }

    public int getFireTime() {
        return fireTime;
    }
    public void setFireTime(int fireTime) {
        this.fireTime = fireTime;
    }

    public int getReloadTime() {
        return reloadTime;
    }
    public void setReloadTime(int reloadTime) {
        this.reloadTime = reloadTime;
    }

    public Image getCalm() {
        return calm;
    }

    public void setCalm(Image calm) {
        this.calm = calm;
    }

    public Image getShoot() {
        return shoot;
    }

    public void setShoot(Image shoot) {
        this.shoot = shoot;
    }

    public Image getReload() {
        return reload;
    }

    public void setReload(Image reload) {
        this.reload = reload;
    }
}
