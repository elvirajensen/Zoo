public class Tiger extends Animal {

    public Tiger(String name, int age){
        super(name, age);
    }

    @Override
    public String sound() {
        return "Rawr!";
    }

    @Override
    public String foodType() {
        return "Meat";
    }

    @Override
    public String feed() {
        return getName() + " has been fed";
    }

    @Override
    public String toString() {
        return "Tiger: " + getName() + ", Age: " + getAge();
    }
}
