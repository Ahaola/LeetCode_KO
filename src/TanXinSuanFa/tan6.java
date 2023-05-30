package TanXinSuanFa;

/**
 * 加油站  https://leetcode.cn/problems/gas-station/
 */
public class tan6 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curSum = 0;
        int totalSum = 0;
        int score = 0;
        for (int i = 0; i < gas.length; i++) {
            curSum += gas[i] - cost[i];
            totalSum += gas[i] - cost[i];
            if(curSum < 0){
                score = i+1;
                curSum = 0;
            }
        }
        if(totalSum < 0){
            //说明无论如何都跑不完一圈
            return -1;
        }
        return score;
    }
}
