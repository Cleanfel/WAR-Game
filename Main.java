import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class Main {
    
    /*public static void createAndShowGUI()
    {
        // testing formatted text labels
        Grid testBoard = new Grid();
        String text = testBoard.toString();
        
        //Create and set up the window.
        JFrame frame = new JFrame("WARGAME");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel topLabel = new JLabel(text, SwingConstants.CENTER);
        topLabel.setPreferredSize(new Dimension(640, 480)); 
        
        JLabel bottomLabel = new JLabel("BOTTOM", SwingConstants.CENTER);
        
        // creating a split pane
        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, topLabel, bottomLabel);
        splitPane.setOneTouchExpandable(false);
        splitPane.setDividerLocation(360);
        frame.getContentPane().add(splitPane);
        
        // display the window
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                createAndShowGUI();
            }
        });
    }*/

    public static void main(String[] args)
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
        System.out.println("Hero 1 = @");
        System.out.println("Hero 2 = $");
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
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an X distance and then a Y distance that you would like the robot to move.\n");
        int xDist = scan.nextInt();
        int yDist = scan.nextInt();
        robot.move(xDist, yDist);
        testBoard.updateCords();
        System.out.println(testBoard.toString());
        
        System.out.println(robot.getName() + "'s X: " + robot.getX());
        System.out.println(robot.getName() + "'s Y: " + robot.getY());
    }
}