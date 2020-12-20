package abstractclass.gamecharacter;

import java.util.Random;

public class Archer extends Character {

    private int numberArrow;
    Random random = new Random();

    public Archer(Point position) {
        super(position);
        this.numberArrow = 100;
    }

    public int getNumberArrow() {
        return numberArrow;
    }

    private int getActualSecondaryDamage() {
        return random.nextInt(5) + 1;
    }

    private void shootingAnArrow(Character enemy) {
        numberArrow--;
        hit(enemy, getActualSecondaryDamage());
    }

    @Override
    public void secondaryAttack(Character enemy) {
        //  if (getPosition().distance(enemy.getPosition()) < 2) {
        hit(enemy, getActualSecondaryDamage());
    }

}
