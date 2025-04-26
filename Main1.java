class Animal
        {
            public void Sound()
            {
                System.out.println("the animal make sound:");
            }
        }
    class Bird extends Animal
    {
        public void Sound()
        {
            System.out.println("birds crips");
        }
    }
    class Cat extends Animal
    {
        public void Sound()
        {
            System.out.println("the cat meows");
        }
    }

    public class Main1
{
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Cat cat = new Cat();
        animal.Sound();
        bird.Sound();
        cat.Sound();
    }
}


