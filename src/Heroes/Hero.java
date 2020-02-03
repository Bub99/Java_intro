package Heroes;

public abstract class Hero {
    protected String name;
    protected int hp;
    protected int mana;

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", mana=" + mana +
                '}';
    }

    public Hero(String name, int hp, int mana) {
        this.name = name;
        this.hp = hp;
        this.mana = mana;
    }

    public abstract void firePrimary();
    public abstract void fireSecondary();
    public abstract void receiveHit();





}
