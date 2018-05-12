
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Driver {
    public static void createAndShowGUI()
    {
        Grid testBoard = new Grid();
        
        // creates some obstacles
        Character obs1 = new Obstacle();
        Character obs2 = new Obstacle();
        Character obs3 = new Obstacle();
        Character obs4 = new Obstacle();
        Character obs5 = new Obstacle();
        Character obs6 = new Obstacle();
        Character obs7 = new Obstacle();
        Character obs8 = new Obstacle();
        
        Collectible hpBox1 = new HealthBox();
        Collectible hpBox2 = new HealthBox();
        
        Collectible ammoBox1 = new AmmoBox();
        Collectible ammoBox2 = new AmmoBox();
        
        // creates some Heroes
        Hero robot = new Robot();
        Hero wizard = new Wizard();
        Hero samurai = new Samurai();
        
        // shows the key and sets it to one string
        
        String disp1 = "Empty Space =  .      ";
        String disp2 = "Robot =  #      ";
        String disp3 = "Wizard =  $      ";
        String disp4 = "Samurai =  @      ";
        String disp5 = "Obstacle =  \u0394      ";
        String disp6 = "Health Box =  \u25A1      ";
        String disp7 = "Ammo Box =  \u25A6";
        
        String bottomDisp = disp1 + disp2 + disp3 + disp4 + disp5 + disp6 + disp7;
        
        // adds characters to the board
        // obstacles
        testBoard.addChar(obs1);
        testBoard.addChar(obs2);
        testBoard.addChar(obs3);
        testBoard.addChar(obs4);
        testBoard.addChar(obs5);
        testBoard.addChar(obs6);
        testBoard.addChar(obs7);
        testBoard.addChar(obs8);
        
        // adds health boxes
        testBoard.addChar(hpBox1);
        testBoard.addChar(hpBox2);
        
        // adds ammo boxes
        testBoard.addChar(ammoBox1);
        testBoard.addChar(ammoBox2);
        
        // adds heroes
        testBoard.addChar(robot);
        testBoard.addChar(wizard);
        testBoard.addChar(samurai);
        
        // sets the game board to a string called text
        String text = testBoard.toString();
        
        //Create and set up the window.
        JFrame frame = new JFrame("WARGAME");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // creates the bottom textBox (aka Label)
        JLabel bottomLabel = new JLabel(bottomDisp, SwingConstants.CENTER);
        bottomLabel.setPreferredSize(new Dimension(680, 100));
        
        // testing new text Areas
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setText(text + "\n");
        textArea.setFont(new Font("monospaced", Font.PLAIN, 32));
        frame.getContentPane().add(textArea);
        
        // creating a split pane
        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, textArea, bottomLabel);
        splitPane.setOneTouchExpandable(false);
        splitPane.setDividerLocation(400);
        frame.getContentPane().add(splitPane);
        
        // display the window
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        createAndShowGUI();;
    }
    
    public static void oldMain(String[] args)
    {
        // creates board
        Grid testBoard = new Grid();
        
        // creates some obstacles
        Character obs1 = new Obstacle();
        Character obs2 = new Obstacle();
        Character obs3 = new Obstacle();
        Character obs4 = new Obstacle();
        Character obs5 = new Obstacle();
        Character obs6 = new Obstacle();
        Character obs7 = new Obstacle();
        Character obs8 = new Obstacle();
        
        Collectible hpBox1 = new HealthBox();
        Collectible hpBox2 = new HealthBox();
        
        Collectible ammoBox1 = new AmmoBox();
        Collectible ammoBox2 = new AmmoBox();
        
        // creates some Heroes
        Hero robot = new Robot();
        Hero wizard = new Wizard();
        Hero samurai = new Samurai();
        
        // shows the key
        System.out.println("Empty Space = .");
        System.out.println("Robot = #");
        System.out.println("Wizard = $");
        System.out.println("Samurai = @");
        System.out.println("Obstacle = \u0394");
        System.out.println("Health Box = \u25A1");
        System.out.println("Ammo Box = \u25A6");
        System.out.println("___________________");
        
        // adds characters to the board
        // obstacles
        testBoard.addChar(obs1);
        testBoard.addChar(obs2);
        testBoard.addChar(obs3);
        testBoard.addChar(obs4);
        testBoard.addChar(obs5);
        testBoard.addChar(obs6);
        testBoard.addChar(obs7);
        testBoard.addChar(obs8);
        
        testBoard.addChar(hpBox1);
        testBoard.addChar(hpBox2);
        
        testBoard.addChar(ammoBox1);
        testBoard.addChar(ammoBox2);
        
        // heroes
        testBoard.addChar(robot);
        testBoard.addChar(wizard);
        testBoard.addChar(samurai);
        
        //testBoard.updateCords();
        
        // prints out the current board
        System.out.println(testBoard.toString());
        
        System.out.println(robot.getName() + "'s X: " + robot.getX());
        System.out.println(robot.getName() + "'s Y: " + robot.getY());
        
        System.out.println(wizard.getName() + "'s X: " + wizard.getX());
        System.out.println(wizard.getName() + "'s Y: " + wizard.getY());
        
        System.out.println(samurai.getName() + "'s X: " + samurai.getX());
        System.out.println(samurai.getName() + "'s Y: " + samurai.getY());
        
        System.out.println("Distance between " + robot.getName() + " and " + wizard.getName() + ": " + robot.getDistance(wizard));
        System.out.println("Distance between " + robot.getName() + " and " + samurai.getName() + ": " + robot.getDistance(samurai));
        System.out.println("Distance between " + wizard.getName() + " and " + samurai.getName() + ": " + wizard.getDistance(samurai));
        
        System.out.println("HP of " + robot.getName() + ": " + robot.getHP());
        
        wizard.attack(robot);
        
        System.out.println("HP of " + robot.getName() + ": " + robot.getHP());
    }
}
