/**
 * Java 1. HomeWork 2
 *
 @ autor Shchukina Olga
 @ version 07.11.2021
*/
class Lesson2HomeWork {
    
    public static void main(String[] args) {
        within10and20(1, -20);
        within10and20(5, 15);
        within10and20(12, 0);
        isPositiveOrNegative(4);
        isPositiveOrNegative(0);
        isPositiveOrNegative(-4);
        isNegative(7);
        isNegative(-18);
        printWordNTimes ("text", 4);
        leapYear(1988);
        
    }
    
    static boolean within10and20(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum <= 20) return true;
        else return false;
    }
    
    static void isPositiveOrNegative(int a) {
        if (a >= 0) System.out.println("Positiv");
        else System.out.println("Negativ");
    }
    
    static boolean isNegative(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }
    
    static void printWordNTimes(String word, int time) {
        for (int i = 0; i < time; i++) {
            System.out.println(word);
        }
    }
    
    static boolean leapYear(int y) {
        if ((y % 4 == 0) || !(y % 100 == 0) && (y % 400 == 0)) {
            return true;
        }
        return false; 
        }
    }






