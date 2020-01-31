public class Person {
           private String name;
    private int age;
    private int height;
    private int stamina;

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getStamina() {
        return stamina;
    }

    public Person(String name, int age, int height, int stamina) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.stamina = stamina;
    }

    public void run(){
                stamina--;
            }
            public void sleep(){
                stamina += 12;
            }
            public boolean isSuge(){
//                if(age >= 18){return true;}return false;
                // return age >= 18 ? true : false; se simplifica asa pt ca returneaza boolean
                return age >= 18;

            }

    public int getAge() {
        return age;
    }

    public String cumTeKeama(){
                return name;

            }
    }

