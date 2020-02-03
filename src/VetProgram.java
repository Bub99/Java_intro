public class VetProgram {
    public static void main(String[] args) {

        Bear gigi = new Bear();
        Lion snoop = new Lion();
        Chicken kfc = new Chicken();
        VeterinarulPrajit bubu = new VeterinarulPrajit();

        bubu.makeShot(snoop);
        bubu.makeShot(kfc);
        bubu.makeShot(gigi);


    }
}
