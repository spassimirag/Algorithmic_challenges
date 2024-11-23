
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


