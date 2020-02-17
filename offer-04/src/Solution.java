class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
//        int m = matrix[0].length;
        int i = matrix.length-1, j = 0;  //定位到左下角, i是行，j是列
        while(i >= 0 && j < matrix[0].length){
            if(matrix[i][j] > target){  //大于目标值，往上
                i--;
            }else if(matrix[i][j] < target){  //小于目标值，往右
                j++;
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        int[][] matrix = {  {1,   4,  7, 11, 15},
//                            {2,   5,  8, 12, 19},
//                            {3,   6,  9, 16, 22},
//                            {10, 13, 14, 17, 24},
//                            {18, 21, 23, 26, 30}
//                            };
        int[][] matrix = {};
        Solution s = new Solution();
        s.findNumberIn2DArray(matrix, 5);
    }
}
