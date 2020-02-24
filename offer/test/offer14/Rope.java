package offer14;

public class Rope {

    //回溯法
//    private int n;  //绳子长度为n
//
//    private static int max;
//    private int[] k;
//
//    public int cuttingRope(int n) {
//        for(int m = 2; m <= n; m++){
//            k = new int[m];
//            cut(m, n, 0, k);
//        }
//        return max;
//    }
//
//    public void cut(int m, int n, int ki, int[] k){
//        if(ki == m-1){
//            k[ki] = n;
//            int c = cal(m);
//            if(max < c) max = c;
//            return;
//        }
//        for(int i = 1; i <= n-(m-ki)+1; i++){  //至少要分m段，因此要留一定的长度
//            k[ki] = i;
//            cut(m, n-i, ki+1, k);
//        }
//    }
//
//    public int cal(int m){
//        int a = 1;
//        for(int i = 0; i < m; i++){
//            a = a * k[i];
//        }
//        return a;
//    }

    //动态规划法

    int maxM = 1;
    public int cuttingRope(int n) {
        int[] dp = new int[n+1];
        for(int i = 1; i < (n+1)/2;i++){  //第一段多长
            //count(n) = max(count(n-1)*1, count(n-2)*2,...)
            for(int j = i; j < n; j++){  //剩下的怎么分
                dp[j] = Math.max(dp[j], dp[j-i] * i);
            }
        }
        return dp[n];
    }


}
