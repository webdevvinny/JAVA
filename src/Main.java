import java.util.*;

public class Main{
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello: " + name);
        System.out.println("How old are you " + name);
        byte age = scanner.nextByte();
        System.out.println("What do you like to do/interest?");
        scanner.nextLine();
        String interest = scanner.nextLine();

        System.out.println("Okay " + name + ", you are " + age + " years old and you love " + interest);

    }
}

