public class ZooManager {

    private Animal [] animals;
    private Employee [] employees;
    private int animalCounter;

    public ZooManager(int maxAnimals, int maxEmployees){
        animals = new Animal[maxAnimals];
        employees = new Employee[maxEmployees];
    }

    public String addAnimal(String name, int age, String type){
        if (animalCounter >= animals.length){
            return "Zoo is full!";
        }
        Animal newAnimal;
        if (type.equals("Seal")){
            newAnimal = new Seal(name, age);
        }else if (type.equals("Tiger")){
            newAnimal = new Tiger(name, age);
        }else if (type.equals("Monkey")){
            newAnimal = new Monkey(name, age);
        }else{
            return "Can't find animal type.";
        }
        animals[animalCounter] = newAnimal;
        animalCounter++;
        return name + " has now moved in!";
    }

    public String addEmployee(String name, String age, String socialSec, String role){
        return "";
    }

    public String [] animalsToString(){
        return blah[];
    }

    public String [] employeesToString(){
        return bleh[];
    }

    public String feedAllAnimals(){
        String result = "";
        for (int i = 0; i < animalCounter; i ++){
            result += animals[i].feed() + "\n";
        }
        return result;
    }

    public String performDailyWork(){
        return "";
    }


}
