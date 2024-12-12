public class Main {
    public static void main(String[] args) {

        //String lastString = "Geeks";
        // String rvrsd = Two_sum.reverseString(lastString);
        // System.out.println("Reversed string + " + rvrsd);


        String string = "Test";
        String string1 = "Test";
        // System.out.println(string.charAt(2));
        // System.out.println(string1.concat(string));
        //System.out.println(string.contains(string1));
        // System.out.println((string.contentEquals(string1)));
        // System.out.print(string.indexOf("e"));

        String testing = "Spasimira";
        Strings.checkPalindrome(testing);
        Strings.countVowsAndCons(testing);
        Strings.firstNonRepeatingChar(testing);
        System.out.println(testing.substring(3, 6));

        String sentence = "Java development rocks, seriously!";
        String[] strings = sentence.split(",");
        for (String s : strings) {
            System.out.println(s);
        }

        String date = "2024-12-06";
        String[] dates = date.split("-");
        for (String s : dates) {
            System.out.println(s);
        }

        String multiple = "Today is 25/11/2024. It's really cold! Honestly, stay home.";
        String[] replace = multiple.split("[ /.,'!\\s]+");
        for (String s : replace) {
            System.out.println(s);
        }

        String counting = "Initiating sentence for counting purposes.";
        String[] countingWords = counting.split(" ");
        int counter = 0;
        for (String s : countingWords) {
            counter++;
        }
        System.out.println(counter);

        System.out.println(counting.trim());

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.returnSmallest(nums));
        Arrays.removeDuplicates(nums);
        Arrays.reverseArray(nums);
    }
}

