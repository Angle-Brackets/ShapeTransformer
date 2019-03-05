import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class ShapeTransform extends JPanel {
    public static Random random = new Random();
    public static int red = random.nextInt(255);
    public static int green = random.nextInt(255);
    public static int blue = random.nextInt(255);


    public void paintComponent(Graphics g) {

        super.paintComponents(g);

        try {
            Thread.sleep(ShapeWindowSetup.rate);
            System.out.println(red + ", " + green + " ," + blue);
            red = Math.min(Math.max(red + random.nextInt(3) - 1, 0), 255);
            green = Math.min(Math.max(green + random.nextInt(3) - 1, 0), 255);
            blue = Math.min(Math.max(blue + random.nextInt(3) - 1, 0), 255);
            ShapeWindowSetup.fr.setBackground(new Color(red, green, blue));
            //g.setColor(Color.BLACK);
            //g.fillRect(200,200,50,50);





        } catch (InterruptedException e) {
            System.out.println("Exception Occured in paintComponent Color Generation");
        }

    }

}
