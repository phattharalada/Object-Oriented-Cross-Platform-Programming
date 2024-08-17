/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 6652300346
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MovingCircleApp extends JFrame implements KeyListener {

    private int x = 50;
    private int y = 50;
    private final int circleDiameter = 30;

    public MovingCircleApp() {
        // Set the title of the frame
        setTitle("Moving Circle Application");

        // Set the size of the frame
        setSize(400, 400);

        // Specify the layout manager
        setLayout(null);

        // Ensure the application exits when the frame is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the key listener to the frame
        addKeyListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Draw the circle at the current (x, y) position
        g.setColor(Color.BLUE);
        g.fillOval(x, y, circleDiameter, circleDiameter);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used in this example
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Update the position based on the arrow key pressed
        int keyCode = e.getKeyCode();

        switch (keyCode) {
            case 39: //R
                x += 10;
                break;
            case 37: //L
                x -= 10;
                break;
            case 38: //up
                y -= 10;
                break;
            case 40: //down
                y += 10;
                break;
        }
        System.out.println("x = "+x+","+"y = "+y);
        

        // Repaint the frame to reflect the new position
        //repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Not used in this example
    }

    public static void main(String[] args) {
        // Create an instance of the MovingCircleApp class
        MovingCircleApp frame = new MovingCircleApp();

        // Make the frame visible
        frame.setVisible(true);
    }
}
