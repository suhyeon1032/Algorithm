class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        boolean b = myString.contains(String.valueOf(pat));
    
        return (b == true) ? 1 : 0;
    }
}