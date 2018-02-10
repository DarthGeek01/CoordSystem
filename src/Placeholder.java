import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Placeholder {
    static int currentAngle = 0;
    static FileWriter outputStreamDist;
    static FileWriter outputStreamRot;

    public static void setUp() {
        File dist = new File("dist.txt");
        File rot = new File("rot.txt");

        try {
            dist.createNewFile();
            rot.createNewFile();
        } catch (IOException e) {System.out.println("EXPLETIVE");}

        try {
            outputStreamDist = new FileWriter("dist.txt");
            outputStreamRot = new FileWriter("rot.txt");
        } catch (IOException e) {System.out.println("SHIT");} //good practice
    }

    public static void setDown() {
        try {
            outputStreamDist.close();
            outputStreamRot.close();
        } catch (IOException e) {}
    }

    public static void moveForward(int distance) {
        try {
            outputStreamDist.write(Integer.toString(distance) + "\n");
        } catch (IOException e) {System.out.println("FUCK");}
    }

    public static void rotate(int degrees) {
        try {
            outputStreamRot.write(Integer.toString(degrees) + "\n");
        } catch (IOException e) {System.out.println("DAMN son");}
    }
}
