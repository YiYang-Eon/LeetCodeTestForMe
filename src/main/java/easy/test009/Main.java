package easy.test009;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        isPalindrome(12321);
    }

    public static boolean isPalindrome(int x) {
        if (x<0) {
            return false;
        }

        String[] splitStr = String.valueOf(x).split("");
        for (int i = 0; i < splitStr.length /2; i++) {
            int left = i;
            int right = splitStr.length - i -1;
            if (splitStr[left].equals(splitStr[right])){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
