package q1_b_romanintonum;
import java.util.Scanner;
public class RomanToInt {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Enter a Roman numeral (or 'exit' to quit): ");
                String input = scanner.nextLine().toUpperCase();

                if ("EXIT".equals(input)) {
                    System.out.println("Exiting the program.");
                    break;
                }

                int result = romanToInteger(input);
                System.out.println("Integer value: " + result);
            }

            scanner.close();
        }

        public static int romanToInteger(String s) {
            int result = 0;

            for (int i = 0; i < s.length(); i++) {
                char currentChar = s.charAt(i);
                int currentValue = getRomanValue(currentChar);

                if (i < s.length() - 1) {
                    char nextChar = s.charAt(i + 1);
                    int nextValue = getRomanValue(nextChar);

                    if (currentValue < nextValue) {
                        result -= currentValue;
                    } else {
                        result += currentValue;
                    }
                } else {
                    result += currentValue;
                }
            }

            return result;
        }

        public static int getRomanValue(char c) {
            switch (c) {
                case 'I':
                    return 1;
                case 'V':
                    return 5;
                case 'X':
                    return 10;
                case 'L':
                    return 50;
                case 'C':
                    return 100;
                case 'D':
                    return 500;
                case 'M':
                    return 1000;
                default:
                    return 0;
            }
        }
    }

