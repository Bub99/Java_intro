public class Person {
            String name;
            int age;
            int height;
            int stamina;

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

