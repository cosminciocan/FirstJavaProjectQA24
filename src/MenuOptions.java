public class MenuOptions {
    Calculator calc = new Calculator();
    ReadFromKeyboard read = new ReadFromKeyboard();
    public void doSum(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("Suma este: "+
                calc.sum(first, second));
    }

    public void doSubtract(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("Scaderea este: "+
                calc.substract(first, second));
    }

}
