package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
        Rotwailer rex = new Rotwailer();
        rex.setName("Rex");
        rex.setAge((byte) 1);
        System.out.println(rex.getName());
        System.out.println(rex.getAge());
        rex.play();
        rex.setName("Blackie");
        System.out.println(rex.getName());

        Rotwailer freddie = new Rotwailer();
        System.out.println(freddie.getName());
        freddie.setName("Freddie");

        Rotwailer max = new Rotwailer();

        Persian tommy = new Persian();
        tommy.setName("Tommy");
    }
}
