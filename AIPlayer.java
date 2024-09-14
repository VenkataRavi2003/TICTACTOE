import java.util.Random;

class AIPlayer extends Player{
    public AIPlayer(String name,char mark){
        this.name = name;
        this.mark = mark;
    }
    public void makeMove(){
        Random r = new Random();
        int row,col;
        do{
            row = r.nextInt(3);
            col = r.nextInt(3);
            
        }while(!isValidMove(row, col));
        
        TicTacToe.placeMark(row, col, mark);
    }
}
