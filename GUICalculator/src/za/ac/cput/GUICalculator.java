
package za.ac.cput;

import javax.swing.JFrame;

public class GUICalculator {

    
    public static void main(String[] args) {
        GUI myApp = new GUI();

        // Method to enable you to close frame
        myApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Size of frame
        myApp.setSize(500, 300);

        // Frame is invisible by default, method to make it visible.
        myApp.setVisible(true); 
    }// end of main
    
}// end of class
