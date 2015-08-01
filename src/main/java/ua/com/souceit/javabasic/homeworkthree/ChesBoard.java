package ua.com.souceit.javabasic.homeworkthree;

/**
 * Created by user on 25.07.2015.
 */
public class ChesBoard {
    char [][]board;

    public ChesBoard(int x) {
        this.board=new char[x][x];
    }
    public void createBord(int x){
                for (int i=0; i<=x; i++)
                {
                    for (int j=0; j<=x; j++)
                    {
                        if((i+j)%2==0)
                        {
                            board[i][j]='B';
                            System.out.println(board[i][j]);
                        }
                        else
                        {
                            board[i][j]='W';
                            System.out.println(board[i][j]);
                        }
                    }
            }
        }
    }

