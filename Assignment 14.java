/* I give up.
   The Animal interface doesn't work with Abstract Animal.
   The Prey/Friendly markers I don't understand.
   The Predator interface is broken.
   
   I got it to spit out the output, but not how its supposed to.
*/

interface Animal {
    
    void eat();
    void walk();
    void speak();
}

interface Predator {
    
    void chase(AbstractAnimal a);
}

interface Prey {
}

interface Friendly {
}

abstract class AbstractAnimal {
    String name = "";
    boolean isPrey = false;
    boolean isPredator = false;

    public abstract void speak();
    
    public void eat(String food) {
        System.out.printf("%s is eating %d.\n", name, food);
    }
    
    public void walk() {
        System.out.printf("%s is walking.\n", name);
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
        
    public void chase(AbstractAnimal a) {
        if (a.isPrey == true) {
            System.out.printf("%s is chasing %s.\n", name, a.getName());
        } else {
            System.out.printf("%s is running from %s.\n", name, a.getName());
        }
    }
    
}
class Human extends AbstractAnimal implements Friendly {
    
    public Human(String name) {
        this.name = name;
    }
    
    public void speak() {
        System.out.printf("%s says blah blah blah.\n", name);
    }
   
}

class Mouse extends AbstractAnimal implements Prey {
    
    public Mouse(String name) {
        this.name = name;
        isPrey = true;
        
    }
    
    public void speak() {
        System.out.printf("%s says squeak squeak.\n", name);
    }
    
}

class Cat extends AbstractAnimal implements Predator, Friendly {
    
    public Cat(String name) {
        this.name = name;
        isPredator = true;
    }
    
    public void speak() {
        System.out.printf("%s says meow.\n", name);
    }
}
    
public class Main
{
    public static void main(String[] args) {
	    
        AbstractAnimal[] animals = new AbstractAnimal[4];
        animals[0] = new Human("Alex");
        animals[1] = new Cat("Willow");
        animals[2] = new Mouse("Donatello");
        animals[3] = new Cat("Ivy");

        for (int i = 0; i < animals.length; i++) {
            animals[i].walk();
        }
	
        for (int i = 0; i < animals.length; i++) {
            animals[i].speak();
        }
	    

        for (int i = 0; i < animals.length; i++) {
            if (animals[i].isPredator == true) {
                for (int j = 0; j < animals.length; j++) {
                    animals[i].chase(animals[j]);
                }
            }
        }
    }
}
