class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int left=points[0][1];
        int arrows=1;
        for(int[] num:points)
        {
            if(num[0]>left)
            {
                arrows++;
                left=num[1];
            }
            
      }
      return arrows;
    }

}