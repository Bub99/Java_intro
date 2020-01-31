import java.util.Scanner;

public class Dog {
    int size;


    public void bark(int times){

        if(size > 60){
            bark(times,"Woof!");
        }else if(size >14){
            bark(times,"ruff");
        }else {
            bark(times,"yip");
        }
    }
    private void bark(int times, String sound){
        for(int i = 0; i< times; i++){
            System.out.println(sound);
        }
    }
}

