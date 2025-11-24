public class Monkey extends Animal {

    public Monkey(String name, int age){
        super(name, age);
    }

    @Override
    public String sound() {
        return "Ooh ooh ah ah!";
    }

    @Override
    public String foodType() {
        return "Bananas";
    }

    @Override
    public String feed() {
        return getName() + " has been fed";
    }

    @Override
    public String toString() {
        return "Monkey: " + getName() + ", Age: " + getAge();
    }
}
