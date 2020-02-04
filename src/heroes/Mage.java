package heroes;

public class Mage extends Hero {
    public Mage(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    @Override
    public void firePrimary(Hero hero) {
        mana -= 15;
        hero.receiveHit(20);
    }

    @Override
    public void fireSecondary(Hero hero) {
        mana -=40;
        hero.receiveHit(50);
    }

    @Override
    public void receiveHit(int power) {
        hp -= 2 * power;


    }
}
