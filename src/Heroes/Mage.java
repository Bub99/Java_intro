package Heroes;

public class Mage extends Hero {
    public Mage(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    @Override
    public void firePrimary() {
        mana -= 15;
    }

    @Override
    public void fireSecondary() {
        mana -=40;
    }

    @Override
    public void receiveHit() {
        hp -= 30;
    }
}
