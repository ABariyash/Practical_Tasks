import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TasksForCode {

    public String reverseStringFirsMethod(String str) {
        return new StringBuffer(str).reverse().toString();
    }

    public String reverseStringSecondMethod(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return result;
    }

    public String replaceSymbolInString(String str, char oldSymbol, char newSymbol) {
        return str.replace(oldSymbol, newSymbol);
    }

    public String removeSpecificSymbolInStringFirsMethod(String str, String symbol) {
        return str.replace(symbol, "");
    }

    public String removeSpecificSymbolInStringSecondMethod(String str, int numberSymbol) {
        return str.substring(0, numberSymbol) + str.substring(numberSymbol + 1);
    }

    public int countHowManyTimesSymbolOccursInString(String str, String symbol) {
        String newStr = str.toLowerCase();
        char newSymbol = symbol.toLowerCase().charAt(0);
        int count = 0;
        for (int i = 0; i < newStr.length(); i++)
            if (newStr.charAt(i) == newSymbol)
                count++;
        System.out.println(count);
        return count;
    }

    public void printStringWithDelimiter(String str, int number, String delimiter) {
        if (number > 0) {
            System.out.print(str);
            for (int i = 1; i < number; i++) {
                System.out.print(delimiter + str);
            }
        }
    }

    public boolean isStringPalindromeFirsMethod(String str) {
        String newStr = str.toLowerCase();
        return newStr.equals(new StringBuffer(newStr).reverse().toString());
    }

    public boolean isStringPalindromeSecondMethod(String str) {
        String newStr = str.toLowerCase();
        for (int i = 0; i < newStr.length() - 1; i++) {
            if (newStr.charAt(i) != newStr.charAt(newStr.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public boolean isWordAnAnagram(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()
                || firstWord.toLowerCase().equals(secondWord.toLowerCase())) {
            return false;
        }
        char[] arrFirsWord = firstWord.toLowerCase().toCharArray();
        Arrays.sort(arrFirsWord);
        char[] arrSecondWord = secondWord.toLowerCase().toCharArray();
        Arrays.sort(arrSecondWord);
        if (Arrays.equals(arrFirsWord, arrSecondWord)) {
            return true;
        }
        return false;
    }

    public long calculateNumberFibonacci(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    public long calculateFactorial(int number) {
        if (number <= 1) {
            return 1;
        }
        return number * calculateFactorial(number - 1);
    }

    public static List<Integer> createCollectionOfIntegers() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 101) - 50);
            System.out.println(numbers.get(i) + " <>");
        }
        return numbers;
    }

    public List<Integer> changeNegativeNumbersInCollection(List<Integer> collection) {
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i) < 0) {
                collection.set(i, collection.get(i) * -1);
            }
        }
        return collection;
    }

    public List<Integer> changeEvenAndOddNumbersInCollection(List<Integer> collection) {
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i) % 2 == 0) {
                collection.set(i, collection.get(i) * 100);
            } else {
                collection.set(i, collection.get(i) - 100);
            }
        }
        return collection;
    }

    public List<String> returnLastNameStartWithA() {
        List<String> lastName = new LinkedList<>();
        lastName.add("Bariyash");
        lastName.add("Sparrow");
        lastName.add("Agar");
        lastName.add("Abdullah");
        List<String> list = new LinkedList<>();
        for (int i = 0; i < lastName.size(); i++) {
            if (lastName.get(i).startsWith("A")) {
                list.add(lastName.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        return list;
    }

}
