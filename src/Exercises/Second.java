package Exercises;

public class Second {
    public static void main(String[] args) {
        String a = "a good   example     of this code";
        System.out.println(reverseWords(a));
    }
    public static String reverseWords(String s) {
        s = s.replaceAll(" +"," ");
        String[] b = s.split(" ");
        s = "";
        for(int i = b.length-1; i>=0; i--){
            s +=" "+b[i];
        }
        return s.trim();
    }
}
