package Planet;

import java.util.Scanner;

public class Planety {
    public static void main(String[] args) {
        PlanetyImp checkAtmosphere;
        PlanetyImpl checkLife;

        System.out.println("Wybierz planete: ");
        Scanner sc = new Scanner(System.in);
        String planeta = sc.next();

        switch (planeta) {
            case "Jowisz":
                checkAtmosphere = (PlanetyImp) new Jowisz();
                checkLife = (PlanetyImpl) new Jowisz();
                break;

            case "Mars":
                checkAtmosphere = (PlanetyImp) new Mars();
                checkLife = (PlanetyImpl) new Mars();
                break;

            case "Merkury":
                checkAtmosphere = (PlanetyImp) new Merkury();
                checkLife = (PlanetyImpl) new Merkury();
                break;

            case "Neptun":
                checkAtmosphere = (PlanetyImp) new Neptun();
                checkLife = (PlanetyImpl) new Neptun();
                break;

            case "Saturn":
                checkAtmosphere = (PlanetyImp) new Saturn();
                checkLife = (PlanetyImpl) new Saturn();
                break;

            case "Uran":
                checkAtmosphere = (PlanetyImp) new Uran();
                checkLife = (PlanetyImpl) new Uran();
                break;

            case "Wenus":
                checkAtmosphere = (PlanetyImp) new Wenus();
                checkLife = (PlanetyImpl) new Wenus();
                break;

            case "Ziemia":
                checkAtmosphere = (PlanetyImp) new Ziemia();
                checkLife = (PlanetyImpl) new Ziemia();
                break;

            default:

                break;
        }
    }
}
