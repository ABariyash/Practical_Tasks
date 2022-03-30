import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        }
        return numbers;
    }

    public List<Integer> changeNegativeNumbersInCollection(List<Integer> collection) {
        return collection.stream().map(x -> {if (x < 0) {x = x * -1;}return x;}).collect(Collectors.toList());
    }

    public List<Integer> changeEvenAndOddNumbersInCollection(List<Integer> collection) {
        return collection.stream().map(x -> {if (x % 2 == 0) {x = x * 100;} else {x = x - 100;}return x;})
                        .collect(Collectors.toList());
    }

    public List<String> returnLastNameStartWithA(String... lastName) {
        Stream<String> stream = Arrays.stream(lastName).sequential();
        return stream.filter(name -> name.startsWith("A")).collect(Collectors.toList());
    }

}
