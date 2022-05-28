package medium.test005;

public class Main {
    public static void main(String[] args) {
        longestPalindrome("abccb");
    }

    public static String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        if (s.length() == 2 && s.charAt(0) != s.charAt(1)) {
            return String.valueOf(s.charAt(0));
        }
        if (s.length() == 2 && s.charAt(0) == s.charAt(1)) {
            return s;
        }
        int len = s.length();
        while (len != 1) {
            for (int i = 0; i < len; i++) {
                int left = i;
                int right = i + len;
                if (right > s.length()) {
                    break;
                }
                String sub = s.substring(left, right);
                if (isisPalindrome(sub)) {
                    return sub;
                }
            }
            len--;
        }
        return String.valueOf(s.charAt(0));
    }

    private static boolean isisPalindrome(String s) {
        String[] splitStr = s.split("");
        for (int i = 0; i < splitStr.length / 2; i++) {
            int left = i;
            int right = splitStr.length - i - 1;
            if (splitStr[left].equals(splitStr[right])) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
