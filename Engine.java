import java.util.Random;
public class Engine{
   public static class Game{
      private Board board;
      private Solver my_solver;

      public Game(int board_size){
         Random rand = new Random();
         this.board = new Board(board_size, board_size);
         // set solver original board state
         this.my_solver = new Solver(this.board);
         // make move
         this.board.print_board();
         int successful_swaps = 0;
         //*
         for(int i = 0; i < 104; i++){
            switch(rand.nextInt() % 4){
               case 0:
                  if(this.board.swap(new Move(Move.Direction.UP))){
                     successful_swaps++;
                     break;
                  }
               case 1:
                  if(this.board.swap(new Move(Move.Direction.DOWN))){
                     successful_swaps++;
                     break;
                  }
                  break;
               case 2:
                  if(this.board.swap(new Move(Move.Direction.LEFT))){
                     successful_swaps++;
                     break;
                  }
               case 3:
                  if(this.board.swap(new Move(Move.Direction.RIGHT))){
                     successful_swaps++;
                     break;
                  }
                  break;
            }
         }
         System.out.printf("Swap count: %d\n", successful_swaps);
         //*/
         this.play();
      }

      public void play(){

         this.board.print_board();
         /*
         this.board.swap(new Move(Move.Direction.UP));
         this.board.swap(new Move(Move.Direction.UP));
         this.board.swap(new Move(Move.Direction.UP));
         this.board.swap(new Move(Move.Direction.UP));
         this.board.swap(new Move(Move.Direction.UP));
         this.board.swap(new Move(Move.Direction.UP));
         this.board.swap(new Move(Move.Direction.UP));
         this.board.swap(new Move(Move.Direction.UP));
         this.board.swap(new Move(Move.Direction.UP));
         this.board.swap(new Move(Move.Direction.UP));
         this.board.swap(new Move(Move.Direction.UP));
         this.board.swap(new Move(Move.Direction.UP));
         this.board.swap(new Move(Move.Direction.UP));
         this.board.swap(new Move(Move.Direction.UP));
         this.board.swap(new Move(Move.Direction.UP));
         this.board.swap(new Move(Move.Direction.UP));
         this.board.swap(new Move(Move.Direction.UP));
         this.board.swap(new Move(Move.Direction.UP));
         this.board.swap(new Move(Move.Direction.LEFT));
         this.board.swap(new Move(Move.Direction.LEFT));
         this.board.swap(new Move(Move.Direction.LEFT));
         this.board.swap(new Move(Move.Direction.LEFT));
         this.board.swap(new Move(Move.Direction.LEFT));
         this.board.swap(new Move(Move.Direction.LEFT));
         this.board.swap(new Move(Move.Direction.LEFT));
         this.board.swap(new Move(Move.Direction.LEFT));
         this.board.swap(new Move(Move.Direction.LEFT));
         this.board.swap(new Move(Move.Direction.LEFT));
         this.board.swap(new Move(Move.Direction.LEFT));
         this.board.swap(new Move(Move.Direction.LEFT));
         this.board.swap(new Move(Move.Direction.DOWN));
         this.board.swap(new Move(Move.Direction.DOWN));
         this.board.swap(new Move(Move.Direction.LEFT));
         this.board.swap(new Move(Move.Direction.LEFT));
         this.board.swap(new Move(Move.Direction.UP));
         this.board.swap(new Move(Move.Direction.RIGHT));
         //*/

         // TODO test solver
         System.out.printf("begin solve\n");
         MoveList solution = this.my_solver.find_solution(this.board);
            this.board.print_board();
            System.out.printf("\n");
         while(!solution.is_empty()){
            this.board.swap(solution.pop());
            this.board.print_board();
            System.out.printf("\n");
         }
         System.out.printf("Solved\n");
         this.board.print_board();
         


         return;
      }
      public Board game_state(){
         return null;
      }
   }

   public static void main(String[] args){
      Game my_game = new Game(4);

      return;
   }
}
