import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        
        for(int i = 0; i < a.length(); i++){
            char tmp = a.charAt(i);
            
            if((65 <= tmp) && (tmp <= 90)) { // 문자가 대문자인 경우 65 <= tmp <= 90
                answer += a.valueOf(tmp).toLowerCase();
            } else if((97 <= tmp) && (tmp <= 122)) { // 문자가 소문자인 경우 97 <= tmp <= 122
                answer += a.valueOf(tmp).toUpperCase();
            } else {
                answer += (char)tmp;
            }
        }
        System.out.println(answer);
    }
}