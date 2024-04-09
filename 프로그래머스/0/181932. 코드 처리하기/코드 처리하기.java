class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        for(int i = 0; i < code.length(); i++) {
            if(mode == 0) {
                if(code.charAt(i) != '1') { // code[i]가 1이 아닌경우
                    if((i % 2) == 0) answer += code.charAt(i);
                } else mode = (mode+1)%2; // code[i]가 1인 경우
            } else {
                if(code.charAt(i) != '1') { // code[i]가 1이 아닌경우
                    if((i % 2) != 0) answer += code.charAt(i);
                } else mode = (mode+1)%2; // code[i]가 1인 경우
            }
        }
        if(answer == "") answer = "EMPTY";
        
        return answer;
    }
}