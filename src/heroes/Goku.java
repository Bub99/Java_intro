package heroes;

public class Goku extends Hero {


    public Goku(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    @Override
    public void firePrimary(Hero hero) {
        mana -= 5;
        hero.receiveHit(5);
    }

    @Override
    public void fireSecondary(Hero hero) {
        mana -= 40;
        hero.receiveHit(30);
    }

    @Override
    public void receiveHit(int power) {
        hp -= power / 2 ;
        mana += 3;

    }
}
