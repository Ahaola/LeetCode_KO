package DP;

import java.util.Scanner;

public class dp21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        char [][]board = new char[n][m];
        for (int i = 0; i < n; i++) {
            String row = scanner.nextLine();
            board[i] = row.toCharArray();
        }
        int min = getmin(board);
        System.out.println(min);
    }
    public static int getmin(char [][]board){
        int n = board.length;
        int m = board[0].length;
        int min = 0;
        int []dx = {-1,1,0,0};
        int []dy = {0,0,-1,1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < 4; k++) {
                    int x = i+dx[k];
                    int y = j+dy[k];
                    if(x >=0 && x<n && y>=0 && y<m){
                        if(board[x][y] == board[i][j]){
                            min++;
                            board[x][y] = (board[i][j] == '0')?'1':'0';
                        }
                    }
                }
            }
        }
        return min;
    }
}
