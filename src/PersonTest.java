public class PersonTest {
    public static void main(String[] args) {
        Person alex = new Person("Alexandru", 20, 175, 10);

//      asta nu mai ie pt ca am folosit chestia de sus
//        alex.name = ;
//        alex.age = 20;
//        alex.height = 175;
//        alex.age++;
//        alex.stamina =10;

        System.out.println(alex.getName() + " are " + alex.getAge() + " de ani.");


        alex.run();
        alex.run();
        alex.run();
        System.out.println(alex.getName() + " are energia " + alex.getStamina());
        alex.sleep();
        System.out.println(alex.getName() + "are energia " + alex.getName());

        if(alex.isSuge()) {
            System.out.println(alex.getName() + " suge pula ");
        }

    }
}
