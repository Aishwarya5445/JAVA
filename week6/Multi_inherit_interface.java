
interface Animal {
    void makeSound();
    }

    interface Pet extends Animal {
    void play();
    }

    interface Swimmable {
    void swim();
    }

    interface Flyable {
    void fly();
    }
    public class Multi_inherit_interface implements Pet, Swimmable, Flyable {
    @Override
    public void makeSound() {
    System.out.println("Quack");
    }
    @Override
    public void play() {
    System.out.println("The duck is playing in the water.");
    }
    @Override
    public void swim() {
    System.out.println("The duck is swimming.");
    }
    @Override
    public void fly() {
    System.out.println("The duck is flying.");
    }
    public static void main(String[] args) {
    Multi_inherit_interface duck = new Multi_inherit_interface();
    System.out.println("--- Calling all behaviors directly ---");
    duck.makeSound(); 
    duck.play(); 
    duck.swim(); 
    duck.fly(); 
    System.out.println("\n--- Using different interface references ---");
    Animal a = duck;
    a.makeSound(); 
    Pet p = duck;
    p.makeSound(); 
    p.play(); 
    Swimmable s = duck;
    s.swim();
    Flyable f = duck;
    f.fly(); 
    System.out.println("\n--- instanceof checks ---");
    System.out.println(duck instanceof Animal); 
    System.out.println(duck instanceof Pet); 
    System.out.println(duck instanceof Swimmable); 
    System.out.println(duck instanceof Flyable); 
    }
    }
