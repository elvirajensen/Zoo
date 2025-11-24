public abstract class Animal {

    private String name;
    private int age;


    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public abstract String sound();
    public abstract String foodType();
    public abstract String feed();
    public abstract String toString();


}
