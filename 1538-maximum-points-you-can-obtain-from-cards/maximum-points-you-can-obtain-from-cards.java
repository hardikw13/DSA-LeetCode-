class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum =0;
        int rsum =0;
        int maxsum = 0;
        for(int i =0;i<=k-1;i++){
            lsum+=cardPoints[i];
            maxsum = lsum;
        }
            int rightind = cardPoints.length-1;
            for(int j = k-1;j>=0;j--){
                lsum = lsum -cardPoints[j];
                rsum = rsum + cardPoints[rightind];
                rightind--;
                maxsum =Math.max(maxsum,lsum+rsum);
            }
            
        
        return maxsum;
        
    }
}