class Solution {
    public int totalMoney(int n) {
         int total = 0;
        for (int day = 0; day < n; day++) {
            int week = day / 7;
            int dayOfWeek = day % 7;
            total += week + dayOfWeek + 1;
        }
        return total;

    }
}