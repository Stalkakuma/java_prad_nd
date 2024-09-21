package lt.techin.oop;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        System.out.println(dog.getDescription());
        // The class method getDescription returns a String:
        // "This animal is mostly brown. It has 4 paws and a fur."
        // The method prints String concatenation with object variables.
        // The variables are color=brown, numberOfPaws=4, hasFur=true
        System.out.println(bird.getDescription());
        // The class method getDescription returns a String:
        // "This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly."
        // The method prints String concatenation with object variables.
        // The variables are color=blue, numberOfPaws=2, hasFur=false
        // Additionally the method getDescription overrides Animal classes'
        // getDescription method and adds another line at the end.
    }
}
