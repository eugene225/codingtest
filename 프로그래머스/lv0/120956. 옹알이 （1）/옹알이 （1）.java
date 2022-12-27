class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] original = {"aya","ye","woo","ma"};
        String[] repeat = {"ayaaya", "yeye", "woowoo", "mama"};
        
        for(String bab : babbling){
            
            for(String rbab : repeat){
                bab = bab.replace(rbab, "X");
            }
            
            for(String obab : original){
                bab = bab.replace(obab,"?");   
            }
            
            int flag = 0;
            for(int i=0;i<bab.length(); i++){
                if(!bab.subSequence(i, i+1).equals("?")){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) answer++;
        }
        return answer;
    }
}