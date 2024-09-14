public class LaunchGame {
    public static void main(String[] args) {
        TicTacToe tct = new TicTacToe();
        
         HumanPlayer p1 = new HumanPlayer("Ravi", 'X');
         AIPlayer p2 = new AIPlayer("AI", 'O');
         
         Player cp;
         cp = p1;
         
         while(true){
             System.out.println("\n"+cp.name+" -> turn : ");
             cp.makeMove();
             TicTacToe.displayBoard();
             if(TicTacToe.checkRowWin()|| TicTacToe.checkColWin() || TicTacToe.checkDiagWin()){
                 System.out.println("\n"+cp.name+" -> HAS WON :)");
                 break;
             }else if(TicTacToe.checkDraw()){
                 System.out.println("\nGAME DRAW!!");
             }else{
                 if(cp == p1){
                     cp = p2;
                 }else{
                     cp = p1;
                 }
             }
         }
    }
}
