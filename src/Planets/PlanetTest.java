package Planets;

import java.util.Scanner;

import static Planets.Planet.EARTH;

public class PlanetTest {
    public static void main(String[] args) {
        System.out.println("weight on earth?");
        Scanner reader = new Scanner(System.in);
        double earthWeight = reader.nextDouble();
        double mass = earthWeight / EARTH.surfaceGravity();
        for (Planet p : Planet.values()) {
            System.out.println("Your weight on " + p + " is " + p.surfaceWeight(mass));
        }
    }
}
