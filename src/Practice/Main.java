package Practice;

public class Main {
    public static void main(String[] args) {

        Dog dog=new Dog();
        dog.setAnimalName("Snoopy");
        dog.setAnimalAge(1);
        dog.makeSound();

        Cat cat=new Cat();
        cat.makeSound();
        cat.setAnimalName("Catty");
        cat.setAnimalAge(2);

        System.out.println("Name of the dog is: "+ dog.getAnimalName() + " and Age of the dog is: " + dog.getAnimalAge() + " Years");
        System.out.println("Name of the Practice.Cat is: "+ cat.getAnimalName() + " and Age of the cat is: " + cat.getAnimalAge()+ " Years");

    }
}