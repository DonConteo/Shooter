package shooterGame.weapon;

import javafx.scene.image.Image;

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

    @Override
    public void shoot() {
        if (loadedBullets > 0) {
            loadedBullets--;
        }
    }
}