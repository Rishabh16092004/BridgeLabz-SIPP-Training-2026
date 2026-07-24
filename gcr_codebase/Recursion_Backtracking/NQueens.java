import java.util.*;

public class NQueens {
    public List<List<String>> placeSensors(int n) {
        List<List<String>> result = new ArrayList<>();
        int[] queenCol = new int[n];
        backtrack(n, 0, queenCol, result);
        return result;
    }

    private void backtrack(int n, int row, int[] queenCol, List<List<String>> result) {

        if (row == n) {
            result.add(buildBoard(n, queenCol));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, queenCol)) {
                queenCol[row] = col;
                backtrack(n, row + 1, queenCol, result);
            }
        }
    }

    private boolean isSafe(int row, int col, int[] queenCol) {

        for (int r = 0; r < row; r++) {
            if (queenCol[r] == col)
                return false;
            if (Math.abs(queenCol[r] - col) == Math.abs(r - row))
                return false;
        }
        return true;
    }

    private List<String> buildBoard(int n, int[] queenCol) {
        List<String> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char[] row = new char[n];
            Arrays.fill(row, '.');
            row[queenCol[i]] = 'Q';
            board.add(new String(row));
        }
        return board;
    }

    public static void main(String[] args) {
        NQueens obj = new NQueens();
        System.out.println(obj.placeSensors(4));
    }
}