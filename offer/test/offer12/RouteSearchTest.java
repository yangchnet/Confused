package offer12;

import org.junit.Test;

public class RouteSearchTest {
    @Test
    public void main() {
        RouteSearch r = new RouteSearch();
        char[][] board = {{'a', 'b'},
                {'c', 'd'}};
        String str = "abcd";
        assert (!r.exist(board, str));

        char[][] board1 = {
                {'a', 'b', 'c', 'e'},
                {'s', 'f', 'c', 's'},
                {'a', 'd', 'e', 'e'},
        };
        String str1 = "abcced";
        assert (r.exist(board1, str1));

        char[][] board2 = {{'a', 'a'}};
        String str2 = "a";
        assert (r.exist(board2, str2));

        char[][] board3 = {{'a'}};
        String str3 = "a";
        assert (r.exist(board3, str3));

        char[][] board4 = {{'a'}};
        String str4 = "ab";
        assert (!r.exist(board4, str4));

        char[][] board5 = {{'a', 'b'}};
        String str5 = "a";
        assert (r.exist(board5, str5));

        char[][] board6 = {{}};
        String str6 = "a";
        assert (!r.exist(board6, str6));

        char[][] board7 = {{'c', 'a', 'a'},
                           {'a', 'a', 'a'},
                           {'b', 'c', 'd'},
        };
        String str7 = "aab";
        assert (r.exist(board7, str7));

        char[][] board8 = {{'a', 'b', 'c', 'e'},
                           {'s', 'f', 'c', 's'},
                           {'a', 'd', 'e', 'e'},
        };
        String str8 = "abcb";
        assert (!r.exist(board8, str8));

        char[][] board9 = {{'a', 'b', 'c', 'e'},
                {'s', 'f', 'e', 's'},
                {'a', 'd', 'e', 'e'},
        };
        String str9 = "abceseeefs";
        assert (r.exist(board9, str9));
    }

}