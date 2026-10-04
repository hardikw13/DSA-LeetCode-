class Solution {
    public int largestAltitude(int[] gain) {

        int[] altitude = new int[gain.length+1];
        altitude[0] = 0;
        int maxi =altitude[0];
        for(int i=0;i<gain.length;i++){
            altitude[i+1] = gain[i] + altitude[i];
            maxi = Math.max(maxi,altitude[i+1]);
            }
            return maxi;

}
}