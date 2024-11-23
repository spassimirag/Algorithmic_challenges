
public class Two_sum {

    public static void checkPalindrome(String s) {
        String rvrsd = "";
        for (int i = 0; i < s.length(); i++) {
            rvrsd = s.charAt(i) + rvrsd;
        }
        if (s.equalsIgnoreCase(rvrsd)) {
           System.out.println("Word is a palindrome!");
        }
        else System.out.println("Word is not a palindrome!");
    }

    // with boolean
    public static boolean checkPalindrome1(String s) {
        String rvrsd = "";
        for (int i = 0; i < s.length(); i++) {
            rvrsd = s.charAt(i) + rvrsd;
        }
        return s.equalsIgnoreCase(rvrsd);

    }

    // with regex
    public static boolean isPalindrome(String s) {
        String normalized = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = normalized.length() - 1;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }


public static String reverseString(String str) {
        char[] newArray = str.toCharArray();
        int left = 0;
        int right = newArray.length - 1;

        while (left < right) {
            char temp = newArray[left];
            newArray[left] = newArray[right];
            newArray[right] = temp;
            left++;
            right--;

        }

        return new String(newArray);
    }
}


