import javax.swing.*;
import java.awt.*;


public class ShapeWindowSetup {
    public static JFrame fr = new JFrame("Shape Transformer");
    public static int rate = 25; //25ms is the sweet spot.
    public static int canvasHeight = 500; //500x500px is the default.
    public static int canvasWidth = 500;

    public static void main(String[] args) throws InterruptedException {
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(canvasWidth, canvasHeight);
        ShapeTransform background = new ShapeTransform();
        fr.add(background);
        fr.setVisible(true);
        fr.setResizable(false);


        while(true){
            Thread.sleep(rate);
            fr.repaint();


        }

    }
}
