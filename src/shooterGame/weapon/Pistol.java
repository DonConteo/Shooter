package shooterGame.weapon;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class Pistol extends Weapon {

    Image calm = new Image(String.valueOf(getClass().getResource("resource/image/HeroPistol.png")));
    Image shoot = new Image(String.valueOf(getClass().getResource("resource/image/HeroPistolShooting.png")));
    Image reload = new Image(String.valueOf(getClass().getResource("resource/image/HeroPistolReloading.png")));
    private final int damage = 1;
    private int loadedBullets = 15;
    private final int maxBullets = 15;
    private int ammo = 0;
    private final int maxAmmo = 200;
    private File fireSound = new File("resource/sound/pistolShoot.mp3");
    private int fireTime = 1000;
    private File reloadSound = new File("resource/sound/pistolReload.mp3");
    private int reloadTime = 2000;
    ImageView imageView = new ImageView(calm);

    @Override
    public Image getCalm() {
        return calm;
    }
    @Override
    public void setCalm(Image calm) {
        this.calm = calm;
    }

    @Override
    public Image getShoot() {
        return shoot;
    }
    @Override
    public void setShoot(Image shoot) {
        this.shoot = shoot;
    }

    @Override
    public Image getReload() {
        return reload;
    }
    @Override
    public void setReload(Image reload) {
        this.reload = reload;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public int getLoadedBullets() {
        return loadedBullets;
    }
    @Override
    public void setLoadedBullets(int loadedBullets) {
        this.loadedBullets = loadedBullets;
    }

    @Override
    public int getMaxBullets() {
        return maxBullets;
    }

    @Override
    public int getAmmo() {
        return ammo;
    }
    @Override
    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    @Override
    public int getMaxAmmo() {
        return maxAmmo;
    }

    @Override
    public File getFireSound() {
        return fireSound;
    }
    @Override
    public void setFireSound(File fireSound) {
        this.fireSound = fireSound;
    }

    @Override
    public int getFireTime() {
        return fireTime;
    }
    @Override
    public void setFireTime(int fireTime) {
        this.fireTime = fireTime;
    }

    @Override
    public File getReloadSound() {
        return reloadSound;
    }
    @Override
    public void setReloadSound(File reloadSound) {
        this.reloadSound = reloadSound;
    }

    @Override
    public int getReloadTime() {
        return reloadTime;
    }
    @Override
    public void setReloadTime(int reloadTime) {
        this.reloadTime = reloadTime;
    }

    @Override
    public ImageView getImageView() {
        return imageView;
    }
    @Override
    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    @Override
    public void shoot(){
        imageView.setImage(shoot);
        imageView.setImage(calm);
    }
}