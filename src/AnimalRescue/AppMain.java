package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.setName("Rex");
        rex.setAge((byte) 1);
        System.out.println(rex.getName());
        System.out.println(rex.getAge());
        rex.play();
        rex.setName("Blackie");
        System.out.println(rex.getName());

        Dog freddie = new Dog();
        System.out.println(freddie.getName());
        freddie.setName("Freddie");

        Dog max = new Dog();

        Persian tommy = new Persian();
        tommy.setName("Tommy");
    }
}
