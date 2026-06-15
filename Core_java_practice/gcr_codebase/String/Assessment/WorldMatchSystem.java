import java.util.Scanner;

public class WorldMatchSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String skill1 = sc.nextLine();
        String skill2 = sc.nextLine();
        IsAnagram(skill1,skill2);
    }
    public static void IsAnagram(String skill1,String skill2){
        if(skill1.length()!=skill2.length()){
            System.out.println("Not Anagram");
            return;
        }
        int[] freq = new int[26];
        for(int i=0;i<skill1.length();i++){
            freq[skill1.charAt(i)-'a']++;
            freq[skill2.charAt(i)-'a']--;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}
