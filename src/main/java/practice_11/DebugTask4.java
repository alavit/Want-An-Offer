package practice_11;

public class DebugTask4 {
    public static void main(String[] args) {
        try {
            System.out.println(isPalindrome(null));
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
