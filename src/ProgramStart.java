public class ProgramStart extends MenuOptions{
    ReadFromKeyboard read = new ReadFromKeyboard();

    public void printMenu(){
        System.out.println("Hello!\n" +
                "Please select an option:\n" +
                "1. Sum\n" +
                "2. Subtraction\n" +
                "3. ...\n" +
                "4. ...\n" +
                "5. ...\n" +
                "6. ...\n" +
                "0. Exit\n"

        );
    }

    public boolean runMenuOption(){
        printMenu();
        int option = read.getInt();
        switch (option){
            case 0:
                System.out.println("Ba bai!");
                return false;
            case 1:
                doSum();
                return true;
            case 2:
                doSubtract();
                return true;

            default:
                System.out.println(Messages.INCORRECT_OPTION);
                return true;
        }
    }

    public void runProgram(){
        boolean repeatProgram;
        do {
             repeatProgram = runMenuOption();
        }while (repeatProgram);
    }


}
