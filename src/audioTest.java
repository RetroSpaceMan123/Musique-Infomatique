import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class audioTest {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        //Declares a Scanner
        Scanner scan = new Scanner(System.in);

        //Gets Audio File (WAV)
        File file = new File("songs/Over the Edge.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        //Menu
        String response = "";
        while (!response.equals("Q")){
            System.out.println("P = play, S = stop, R = reset, Q = Quit");
            System.out.println("Enter your choice: ");
            response = scan.next();
            response = response.toUpperCase(Locale.ROOT);
            switch (response){
                case "P": //Play File
                    clip.start();
                    break;
                case  "S": //Stop File
                    clip.stop();
                    break;
                case "R": //Restarts File
                    clip.setMicrosecondPosition(0);
                    break;
                case "Q": //Quits Program
                    clip.close();
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
        System.out.println("Goodbye!");
    }
}
