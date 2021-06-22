package shooterGame.weapon;

public abstract class Weapon implements Reloadable, Shootable {
    private int damage;
    private int loadedBullets;
    private int maxBullets;
    private int ammo;
    private int maxAmmo;

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
}
