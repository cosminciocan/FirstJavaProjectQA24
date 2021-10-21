public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        short myFirstShortInJavaLikeEveer = 2;

        short mySecondShort;
        mySecondShort = 2;

        int myInt = mySecondShort + 2;
        System.out.println(myInt);

        long mySecondInt = 76675675567563L;
        long result = myInt + 1231231231123L;
        float myFloat = 3.3F;
        double myDouble = myFloat + myInt;
        System.out.println(myDouble + " " + myFloat);

        System.out.println(2+2+ 21-2*(2+2));
        System.out.println("Hello");
        System.out.println("MyInt este: " + myInt);

        String myString = "rezultatul concatenarii: ";
        System.out.println(myString + (myInt + 2));

        byte age = 40;
        String streetName = "Ionescu";
        short streetNo = 30;
        String girlName = "Ioana";

        String story =
                girlName + " are " + age + ", si merge pe strada " + streetName + ",\n" +
                        "numarul " + streetNo + ", pentru a cumpara 3 kg de mere.\n " +
                        "Cu cele 3 kg de mere, pe care " + girlName + " le-a cumparat de pe\n " +
                        "strada " + streetName + ", ea va face 2 kg de prajitura.\n" +
                        "Din cele 2 kg de prajitura, 1 kg il va duce lui Ionut, care \n" +
                        "si el are " + age + " ani.\n" +
                        "Ionut va fi foarte fericit.\n " +
                        "The end.";

        System.out.println(story);

    }


}


