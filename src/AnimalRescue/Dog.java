package AnimalRescue;

public abstract class Dog extends Animal {


    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }


    public void speak(){
        System.out.println("Woof woof!");
    }

    public abstract void wavingTail();


}
