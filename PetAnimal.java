class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
    
    public void showSuperMakeSound() {
        super.makeSound(); // calling the overridden method in the superclass
    }
}

public class PetAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Output: The animal makes a sound.
        
        Cat cat = new Cat();
        cat.makeSound(); // Output: The cat meows.
        cat.showSuperMakeSound(); // Output: The animal makes a sound.
    }
}