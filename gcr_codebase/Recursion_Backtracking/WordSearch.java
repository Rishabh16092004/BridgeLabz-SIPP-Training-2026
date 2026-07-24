public class WordSearch {

    public boolean exists(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (backtrack(board, word, 0, i, j, visited))
                    return true;
            }
        }

        return false;
    }

    private boolean backtrack(char[][] board, String word, int idx, int r, int c, boolean[][] visited) {

        if (idx == word.length())
            return true;

        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length)
            return false;

        if (visited[r][c])
            return false;

        if (board[r][c] != word.charAt(idx))
            return false;

        visited[r][c] = true;
        boolean found =
                backtrack(board, word, idx + 1, r + 1, c, visited) ||
                        backtrack(board, word, idx + 1, r - 1, c, visited) ||
                        backtrack(board, word, idx + 1, r, c + 1, visited) ||
                        backtrack(board, word, idx + 1, r, c - 1, visited);

        visited[r][c] = false;
        return found;
    }

    public static void main(String[] args) {
        WordSearch obj = new WordSearch();
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        System.out.println(obj.exists(board, "ABCCED"));
    }
}