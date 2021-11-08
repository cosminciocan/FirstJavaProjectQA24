public class LogicalOperation {

    public int getHigherNumber(int first, int second) {
        if (first < second) {
            return second;
        } else {
            return first;
        }
    }

    public String verifyProvidedText(String text, int number) {
        if (text.equals("FastTrack") && number <= 3) {
            return text + number;
        } else if (!text.equals("FastTrack") && number >= 4) {
            return number + text;
        }

        return "Not found!";

    }

    public void countBackwords(int small, int big){
        for (int i = big; i >= small; i--){
            System.out.println(i);
        }
    }

    public float getAverageFromInterval(int start, int max){
        float sum = 0;
        for (int i = start; i <=max; i++){
            sum = i + sum;
        }
        return  sum / (max - start + 1);
    }

    public float getAverageDivisibleBySeven(int start, int max) {
        int x = start;
        float sum = 0;
        int count = 0;
        while (x <= max) {
            if (x % 7 == 0) {
                sum += x; //  sum = sum + x;
                count++;
            }

            x++;
        }
        return sum/count;
    }

}
