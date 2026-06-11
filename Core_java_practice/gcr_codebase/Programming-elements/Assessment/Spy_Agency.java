// A spy agency encodes messages. Reverse a secret message, check if
// it is a palindrome, count vowels/consonants, and verify if two
// intercepts are anagrams. Extend: find the first non-repeating
// character in a surveillance log.

public class Spy_Agency {
    public static void main(String[] args) {
        String s = "racecar";
        String t = "carrace";
        Reverse(s);
        IsPalindrome(s);
        countVowelsConsonants(s);
        IsAnagram(s, t);
    }

    public static void Reverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        System.out.println("Reverse string : " + rev);
    }

    public static void IsPalindrome(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        if (s.equals(rev)) {
            System.out.println("Given message is Palindrome");
        } else {
            System.out.println("Given message is not a palindrome");
        }
    }

    public static void countVowelsConsonants(String s) {
        int vowel = 0;
        int consonants = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                vowel++;
            } else {
                consonants++;
            }
        }

        System.out.println("Vowels : " + vowel + ", Consonants : " + consonants);
    }

    public static boolean IsAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for (int n : freq) {
            if (n != 0) {
                return false;
            }
        }
        return true;
    }
}