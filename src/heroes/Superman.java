package heroes;

public class Superman extends Hero {
    public Superman(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    @Override
    public void firePrimary(Hero hero) {
        mana -= 10;
        hp++;
        hero.receiveHit(20);
    }

    @Override
    public void fireSecondary(Hero hero) {
        mana -= 30;
        hp += 3;
        hero.receiveHit(60);
    }

    @Override
    public void receiveHit(int power) {
        if (power < 25) {
            mana += 50;
        } else {
            hp -= power / 3;

        }
    }
}
