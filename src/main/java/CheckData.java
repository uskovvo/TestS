import org.apache.commons.lang3.math.NumberUtils;

import java.util.Scanner;

public class CheckData {
    private static String input;
    private static Scanner scanner;

    protected static String inputData(){
        scanner = new Scanner(System.in);
        input = scanner.nextLine();
        if(input.isEmpty()){
            System.out.println("Повторите ввод");
            return inputData();
        }
        return input;
    }

    protected static int isDigit(){
        scanner = new Scanner(System.in);
        input = scanner.nextLine();
        if (!input.isEmpty()) {
            if (NumberUtils.isDigits(input)) {
                int digit = Integer.parseInt(input);
                if (digit >= 0) {
                    return digit;
                }
                System.out.println("Число меньше нуля, повторите ввод");
                return isDigit();
            }
        }
        System.out.println("Повторите ввод");
        return isDigit();
    }

}
