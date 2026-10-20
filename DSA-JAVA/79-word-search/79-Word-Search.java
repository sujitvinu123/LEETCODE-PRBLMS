
class Solution {
    char[][] board;
    boolean[][] v;
    String word;

    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.word = word;

        int r = board.length;
        int c = board[0].length;
        v = new boolean[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (dfs(i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean dfs(int r, int c, int index) {
        if (r < 0 || c < 0 ||
            r >= board.length || c >= board[0].length ||
            v[r][c] ||
            board[r][c] != word.charAt(index)) {
            return false;
        }

        if (index == word.length() - 1) {
            return true;
        }

        v[r][c] = true;

        boolean found =
            dfs(r - 1, c, index + 1) ||
            dfs(r + 1, c, index + 1) ||
            dfs(r, c - 1, index + 1) ||
            dfs(r, c + 1, index + 1);

        v[r][c] = false;
        return found;
    }
}
