import java.util.Random;
import java.util.LinkedList;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

public class Main{
   public static void main(String[] args){
      // TODO
      //File image = new File("custom.jpg");
      Game game = new Game(4);
      //game.play();
      Window window = new Window(game);
      window.play();
      return;
   }
}
