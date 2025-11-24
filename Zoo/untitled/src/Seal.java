public class Seal extends Animal {

    public Seal(String name, int age){
        super(name, age);
    }

    @Override
    public String sound() {
        return "Ow ow!";
    }

    @Override
    public String foodType() {
        return "Fish";
    }

    @Override
    public String feed() {
        return getName() + " has been fed";
    }

    @Override
    public String toString() {
        return "Seal: " + getName() + ", Age: " + getAge();
    }
}
