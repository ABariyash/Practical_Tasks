public class Runner {

    public static void main(String[] args) {

        TasksForCode tasksForCode = new TasksForCode();
        tasksForCode.reverseStringFirsMethod("Andrey");
        tasksForCode.reverseStringSecondMethod("Andrey");
        tasksForCode.replaceSymbolInString("Andrey", 'd', 'r');
        tasksForCode.removeSpecificSymbolInStringFirsMethod("Andrey", "d");
        tasksForCode.removeSpecificSymbolInStringSecondMethod("Andrey", 4);
        tasksForCode.countHowManyTimesSymbolOccursInString("ANdreyandreyan", "N");
        tasksForCode.printStringWithDelimiter("Andrey", 8, "->");
        tasksForCode.isStringPalindromeFirsMethod("Комок");
        tasksForCode.isStringPalindromeSecondMethod("Комок");
        tasksForCode.isWordAnAnagram("Нора", "Рано");
        tasksForCode.calculateFactorial(5);
        tasksForCode.calculateFactorial(5);
        tasksForCode.changeNegativeNumbersInCollection(TasksForCode.createCollectionOfIntegers());
        tasksForCode.changeEvenAndOddNumbersInCollection(TasksForCode.createCollectionOfIntegers());
        tasksForCode.returnLastNameStartWithA();
    }
}
