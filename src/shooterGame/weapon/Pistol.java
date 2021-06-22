package shooterGame.weapon;

public class Pistol extends Weapon {
    private final int damage = 1;
    private int loadedBullets = 15;
    private final int maxBullets = 15;
    private int ammo = 0;
    private final int maxAmmo = 200;

    @Override
    public void shoot() {
        if (loadedBullets > 0) {
            loadedBullets--;
        }
    }
}