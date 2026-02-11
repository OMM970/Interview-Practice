import java.util.HashSet;

public class Sudokku {
    public boolean isValidSudoku(char[][] board){

        int n=9;
        HashSet<Character> [] rows=new HashSet[n];
        HashSet<Character> [] cols=new HashSet[n];
        HashSet<Character> [] boxes=new HashSet[n];
        for(int i=0;i<n;i++){
            rows[i]=new HashSet<Character>();
            cols[i]=new HashSet<Character>();
            boxes[i]=new HashSet<Character>();

        }
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                char a=board[r][c];
                if(a == '.'){

                }
                if(rows[r].contains(a)){
                    return false;
                }
                rows[r].add(a);
                int val=(r / 3)*3+c/3;
            }
        }
        return true;
    }

}
