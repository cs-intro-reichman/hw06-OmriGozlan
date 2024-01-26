import java.awt.*;

/**
 * Demonstrates the greyscale morphing service of Instush.java.
 * The program receives two command-line arguments: the name of a PPM file
 * that represents the source and the number of morphing steps (an int).
 * For example:
 * java Editor3 thor.ppm 300
 * The editor will create a greyscale version of the source image and will
 * morph the source image to the created greyscale target
 */
public class Editor4 {

    public static void main (String[] args) {
        String filename = args[0];
        int steps = Integer.parseInt(args[1]);
        filename = "images/" + filename;
        Color[][] source = Runigram.read(filename);
        Color[][] greyscaleTarget = Runigram.grayScaled(source);
        Runigram.morph(source, greyscaleTarget, steps);
    }
}