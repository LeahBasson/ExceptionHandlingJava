
package za.ac.cput;

import java.awt.*;
import javax.swing.*;

public class GUI extends JFrame{
    // menus
    private JMenuBar mnuBar;
    private JMenu mnuOperation;
    // you do this so that its easy to access later for event handling.
    private JMenuItem mniAdd;
    private JMenuItem mniSubtract;
    private JMenuItem mniMultiply;
    private JMenuItem mniDivide;
            
    // labels
    private JLabel lblNumOne;
    private JLabel lblNumTwo;
    private JLabel lblResult;
    
    //textboxes
    private JTextField txtNumOne;
    private JTextField txtNumTwo;
    private JTextField txtResult;
    
    // buttons
    private JButton btnAdd;
    private JButton btnSubtract;
    private JButton btnMultiply;
    private JButton btnDivide;
    
    // panels
    private JPanel pnlMenu;
    private JPanel pnlForm;
    private JPanel pnlButtons;
            
    public GUI(){
        super("Menu Demo");
        
        setLayout(new GridLayout(3,1));
        
        // panels
        pnlMenu = new JPanel();
        pnlForm = new JPanel();
        pnlButtons = new JPanel();
        
        pnlMenu.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnlForm.setLayout(new FlowLayout());
        pnlButtons.setLayout(new FlowLayout());
        
        // labels
        lblNumOne = new JLabel("Number 1");
        lblNumTwo = new JLabel("Number 2");
        lblResult = new JLabel("Result");
        
        // text fields
        txtNumOne = new JTextField(5);
        txtNumTwo = new JTextField(5);
        txtResult = new JTextField(5);
        
        // button
        btnAdd = new JButton("Add");
        btnSubtract = new JButton("Subtract");
        btnMultiply = new JButton("Multiply");
        btnDivide = new JButton("Divide");
        
        // menu
        mnuBar = new JMenuBar();
        mnuOperation = new JMenu(("Operation"));
        mniAdd = new JMenuItem("Add");
        mniSubtract = new JMenuItem("Subtract");
        mniMultiply = new JMenuItem("Multiply");
        mniDivide = new JMenuItem("Divide");
        
        mnuOperation.add(mniAdd);
        mnuOperation.add(mniSubtract);
        mnuOperation.add(mniMultiply);
        mnuOperation.add(mniDivide);
       
        mnuBar.add(mnuOperation);
        pnlMenu.add(mnuBar);
        add(pnlMenu);
        
       
     
    }
    

   
    
}// end of class
