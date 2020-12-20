package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {
    private Point position;
    private int hitpoint=100;
    private Random random = new Random();

    public Character(Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public boolean isAlive(){
        if (hitpoint>0) {
            return true;
        }
        return false;
    }

    protected int  getActualPrimaryDamage(){
        return random.nextInt(10)+1;
    }

    private int getActualDefence(){
        return random.nextInt(5)+1;
    }

    protected void hit(Character enemy, int damage){
        if (getActualDefence()<damage){
            decreaseHitPoint(hitpoint-damage);
        }

    }

    public void primaryAttack(Character enemy){
        hit(enemy,getActualPrimaryDamage());
    }

    private void decreaseHitPoint(int diff){
        hitpoint=hitpoint-diff;
    }

    abstract public void secondaryAttack(Character enemy);

}
