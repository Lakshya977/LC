class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int m = players.length;
        int n = trainers.length;
        int l=0;
        int r=0;
        int a=0;
        while(l<m && r<n){
            if(players[l]<=trainers[r]){
                a+=1;
                l++;
            }
            r++;
        }
        return a;
    }
}