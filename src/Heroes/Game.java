package Heroes;

public class Game {

    public static void main(String[] args) {

        Goku hero1 = new Goku("Goku", 400, 200);
        Mage hero2 = new Mage("China",200 ,800);
        Superman hero3 = new Superman("Gigi",500 ,300);

        hero1.firePrimary();
        hero2.receiveHit();
        hero3.receiveHit();

        hero2.fireSecondary();
        hero1.receiveHit();
        hero1.receiveHit();
        hero3.receiveHit();
        hero3.receiveHit();

        System.out.println(hero1.toString());
        System.out.println(hero2.toString());
        System.out.println(hero3.toString());
    }

}
