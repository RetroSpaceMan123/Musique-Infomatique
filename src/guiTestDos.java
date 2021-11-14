import javax.swing.*;
import java.awt.*;

public class guiTestDos {
    public static void main(String[] args) {
       //Labels for the J-Panels
        JLabel blueLabel = new JLabel();
        blueLabel.setText("Hello, I'm Blue");

        JLabel redLabel = new JLabel();
        redLabel.setText("Hello, I'm Red");

        JLabel greenLabel = new JLabel();
        greenLabel.setText("Hello, I'm Green");

        //J-Panel is used to section off parts of a J-Frame for other components
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0, 0, 400, 300); //(int x, int y, int width, int height)
        redPanel.add(redLabel); //Anything that can be added to a J-Panel can be added to a J-Frame

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(400,0,400,300);
        bluePanel.add(blueLabel); //Components are added from Top Middle to Bottom Middle

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0,300,800,300);
        greenPanel.add(greenLabel);

        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLayout(null); //Layout Manager; set to null right now in order to manually place j-panels using coordinates
        jFrame.setSize(800,600);
        jFrame.setVisible(true);
        jFrame.setTitle("guiTestDos");
        //Add components
        jFrame.add(redPanel);
        jFrame.add(bluePanel);
        jFrame.add(greenPanel);
    }
}
