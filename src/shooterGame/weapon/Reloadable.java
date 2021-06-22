package shooterGame.weapon;

public interface Reloadable {

    default void Reload(Weapon weapon) {
        if (weapon.getAmmo() > 0 && weapon.getLoadedBullets() < weapon.getMaxBullets()) {
            int bulletsToReload = weapon.getMaxBullets() - weapon.getLoadedBullets();
            if (weapon.getAmmo() > bulletsToReload) {
                weapon.setLoadedBullets(weapon.getMaxBullets());
                weapon.setAmmo(weapon.getAmmo() - bulletsToReload);

            } else {
                weapon.setLoadedBullets(weapon.getLoadedBullets() + weapon.getAmmo());
                weapon.setAmmo(0);
            }
        }
    }
}
