import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.*;

public class guiTest {
    public static void main(String[] args) {
        //Create a Window
        JFrame jFrame = new JFrame();

        //Create Size of Frame
        jFrame.setSize(800,600);

        //Create a Title for the Frame
        jFrame.setTitle("guiTest");

        //Make Sure the Program Closes on Exit
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Disable the Ability to Resize the Window
        jFrame.setResizable(true);

        //Set Frame to Be Visible
        jFrame.setVisible(true);

        //Create a Display Area for an Image or String or Both
        JLabel jLabel = new JLabel();
        jLabel.setText("Hello! How are you guys doing today? I'm doing fine. Thanks for asking!"); //Creates a Label with Text
        jFrame.add(jLabel); //Make sure this is before the background color

        //Custom Logo for Frame
        ImageIcon icon = new ImageIcon("images/iconLMB.png");
        jFrame.setIconImage(icon.getImage());

        //Image for Label
        jLabel.setIcon(icon);

        //Moving Text Around
        jLabel.setHorizontalTextPosition(JLabel.CENTER);//Centers the Text to the Center of the Label (Options: Left, Center, Right of Image Icon)
        jLabel.setVerticalTextPosition(JLabel.TOP);//Sets Text to be Top, Center, or Bottom of Image

        //Change Color of Text
        jLabel.setForeground(Color.WHITE); //Pass new Color() to get a Custom Color

        //Change Text Font
        jLabel.setFont(new Font("MV Boli", Font.PLAIN, 20)); //Name of Font, Modifier, Size

        //Set the Margin Between Text and Image
        jLabel.setIconTextGap(25);

        //Set a Background Color for Label
        jLabel.setBackground(Color.BLUE);//Label Takes as Much Space as Possible
        jLabel.setOpaque(true); //Displays Background

        //Creates a Background Color for Window
        jFrame.getContentPane().setBackground(Color.BLACK); //put new Color into () to make a custom color

    }
}
