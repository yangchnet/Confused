package offer12;

public class RouteSearch {

    public boolean exist(char[][] board, String word) {
        if (board.length == 0) return false;
        boolean[][] visited = new boolean[board.length][board[0].length];
        boolean found = false;

        for(int row = 0; row < board.length; row++){
            for(int column = 0; column < board[0].length; column++){
                visited = new boolean[board.length][board[0].length];  // 更新visited矩阵
                if (word.charAt(0) == board[row][column]) { //当前字符成功匹配
                    if(word.length() == 1){  //只有一个字符
                        found = true;   //找到了
                    }
                    //当前字符与第一个字符相同，从此处开始搜索
                    //内部需要回溯，否则可能漏掉正确解
                    visited[row][column] = true;
                    int j = 1, r = row, c = column;
                    if(j == word.length()){  //如果已经匹配的长度等于字符串长度
                        return found;
                    }
                    //朝上下左右四个方向搜索
                    if ((r - 1) >= 0 && board[r - 1][c] == word.charAt(j) && !visited[r - 1][c]) {  //上
                        found = route(board, word, visited, r - 1, c, j + 1);
                        if(found) return found;
                    }
                    if ((r + 1) < board.length && board[r + 1][c] == word.charAt(j) && !visited[r + 1][c]) { //下
                        found = route(board, word, visited, r + 1, c, j + 1);
                        if(found) return found;
                    }
                    if ((c - 1) >= 0 && board[r][c - 1] == word.charAt(j) && !visited[r][c - 1]) {  //左
                        found = route(board, word, visited, r, c - 1, j + 1);
                        if(found) return found;
                    }
                    if ((c + 1) < board[0].length && board[r][c + 1] == word.charAt(j) && !visited[r][c + 1]) {  //右
                        found = route(board, word, visited, r, c + 1, j + 1);
                        if(found) return found;
                    }
                }
            }
        }
        return found;
    }

    public boolean route(char[][] board, String word, boolean[][] visited, int r, int c, int j) {
        /*
         * @Des: 回溯计算路径
         * @Para:
         *      board: 给定的矩阵
         *      word: 要求搜索的字符串
         *      visisted：访问矩阵
         *      r: 当前行
         *      c: 当前列
         *      j：当前字符位置
         * @Return:
         *      是否可行
         **/
        visited[r][c] = true;
        if (j == word.length()) {
            return true;
        }
        if ((r - 1) >= 0 && board[r - 1][c] == word.charAt(j) && !visited[r - 1][c]) {  //上
            return route(board, word, visited, r - 1, c, j + 1);
        }
        if ((r + 1) < board.length && board[r + 1][c] == word.charAt(j) && !visited[r + 1][c]) { //下
            return route(board, word, visited, r + 1, c, j + 1);
        }
        if ((c - 1) >= 0 && board[r][c - 1] == word.charAt(j) && !visited[r][c - 1]) {  //左
            return route(board, word, visited, r, c - 1, j + 1);
        }
        if ((c + 1) < board[0].length && board[r][c + 1] == word.charAt(j) && !visited[r][c + 1]) {  //右
            return route(board, word, visited, r, c + 1, j + 1);
        }
        return false;
    }
}

