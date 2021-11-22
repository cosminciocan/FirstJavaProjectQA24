import AnimalRescue.Dog;

import java.util.ArrayList;
import java.util.List;

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


    public int[] populateArray(int max){
        int[] myArr = new int[max];
        for (int i = 0; i < max; i++){
            myArr[i] = i+1;
        }
        return myArr;
    }

    public void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    public void printArray(String[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void printArray(Dog[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i].getName());
        }
    }

    public float getAverageValueFromArray(int[] array){
        float sum = 0;

        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        return(sum/array.length);
    }

    public boolean isValueInArray(int[] array, int value){
        for (int i = 0; i < array.length; i++){
            if (array[i] == value){
                return true;
            }
        }
        return false;
    }

    public int[] getArrayWithoutNumber(int[] array, int number){
        if (isValueInArray(array, number)) {
            int[] secondArray = new int[array.length - 1];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (array[i] != number) {
                    secondArray[j] = array[i];
                    j++;
                }
            }
            return secondArray;
        }
        return array;
    }

    public List<Integer> getPopulatedList(int max){
        List<Integer> myList = new ArrayList<>();
        for (int i = 1; i <= max; i++){
            myList.add(i);
        }
        return myList;
    }

    public void printListFromNumber(List<Integer> myList, int number){
        for (int i = number; i <= myList.size(); i++){
            System.out.println(myList.get(i-1));
        }
    }
}
