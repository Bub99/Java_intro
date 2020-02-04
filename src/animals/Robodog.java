package animals;

public class Robodog implements Animal, Pet, Robot {

protected int baterie = 50;

    @Override
    public void makeNoise() {
        System.out.println("*roboot noises*");
    }

    @Override
    public void Play() {
        System.out.println("*jetpack*");

    }

    @Override
    public void Recharge() {
        baterie = 100;
    }
}
