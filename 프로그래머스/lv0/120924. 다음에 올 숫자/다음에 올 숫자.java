class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int flag = 0;  //등차 1, 등비 2
        for(int i=0;i<common.length - 2;i++){
            if(common[i+1] - common[i] == common[i+2] - common[i+1]) flag = 1;
            else flag = 2;
        }
        
        if(flag==1){
            answer = common[common.length-1] + (common[common.length-1]-common[common.length-2]);
        }else{
            answer = common[common.length-1] * (common[common.length-1]/common[common.length-2]);
        }
        return answer;
    }
}