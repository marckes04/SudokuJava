
package Model;


public class Sudoku {

private int sudoku [][];

public Sudoku(){
    int sudo [][] ={
        {0,0,0,6,0,0,0,0,0},    
        {0,0,0,0,0,3,0,0,0}, 
        {0,1,0,0,0,0,8,0,0}, 
        {0,0,0,0,0,0,0,0,0}, 
        {0,0,0,0,0,0,0,0,0}, 
        {0,0,0,0,0,0,0,8,0}, 
        {0,0,0,0,0,0,0,0,0}, 
        {0,0,0,0,0,0,0,0,8}, 
        {7,0,0,0,0,0,0,0,0},
    };
     sudoku = sudo;
    }
    
public boolean resolveSudoku(){
    for(int i = 0; i < sudoku.length; i++)
    {
        for(int j = 0; j < sudoku[0].length;j++)
        {
            if(sudoku[i][j]== 0){
                for (int val = 1; val <= 9 ; val++)
                {
                    if(validateRow(i,val) && validateColumn(j,val) && validateSquare(i,j,val))
                    {
                        sudoku[i][j] = val;
                        if(resolveSudoku()) return true;
                        sudoku[i][j]=0;
                    }
                } return false;
            }
        }
    } return true;
}

public boolean validateSquare(int i , int j, int val)
{
    int posI = subCurrentSquare(i);
    int posJ = subCurrentSquare(j);
    
    for(int k = posI-3; k< posI; k++)
    {
        for(int l = posJ-3; l< posJ; l++)
        {
            if(sudoku[k][l]== val)
            {
                return false;
            }
        }
    }
    return true;
}

public int subCurrentSquare(int pos)
{
    if(pos <= 2) return 3;
    else if(pos<=5) return 6;
    else return 9;
}

public boolean validateRow(int i, int val)
{
 for(int j = 0; j< sudoku[i].length; j++)
 {
     if(sudoku[i][j] == val)
     {
         return false;
     }
 }   
 
 return true;
}

public boolean validateColumn(int j, int val)
{
    for(int i = 0 ; i < sudoku.length; i++){
        if(sudoku[i][j]== val)
        {
            return false;
        }
   }
    
    return true;
}

public void showSudoku()
{
  resolveSudoku();
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                System.out.print(sudoku[i][j]);
                if (!(j == sudoku[0].length - 1)) {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }

}

public int[][] getSudoku(){
return sudoku;    
}


public void setSudoku(int[][] sudoku)
{
    this.sudoku = sudoku;
}


}

