package za.ac.cput;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame implements ActionListener {

    // menus
    private JMenuBar mnuBar;
    private JMenu mnuOperation;
    private JMenu mnuExit;
    private JMenu mnuClear;
    // you do this so that its easy to access later for event handling.
    private JMenuItem mniAdd;
    private JMenuItem mniSubtract;
    private JMenuItem mniMultiply;
    private JMenuItem mniDivide;
    private JMenuItem mniExit;
    private JMenuItem mniClear;

    // labels
    private JLabel lblNumOne;
    private JLabel lblNumTwo;
    private JLabel lblResult;

    //textboxes
    private JTextField txtNum1;
    private JTextField txtNum2;
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

    public GUI() {
        super("Menu Demo");

        setLayout(new GridLayout(3, 1));

        // panels
        pnlMenu = new JPanel();
        pnlForm = new JPanel();
        pnlButtons = new JPanel();

        pnlMenu.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnlForm.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnlButtons.setLayout(new FlowLayout(FlowLayout.LEFT));

        // labels
        lblNumOne = new JLabel("Number 1");
        lblNumTwo = new JLabel("Number 2");
        lblResult = new JLabel("Result");

        // text fields
        txtNum1 = new JTextField(5);
        txtNum2 = new JTextField(5);
        txtResult = new JTextField(5);

        // button
        btnAdd = new JButton("Add");
        btnSubtract = new JButton("Subtract");
        btnMultiply = new JButton("Multiply");
        btnDivide = new JButton("Divide");

        // menu
        mnuBar = new JMenuBar();
        // sets the bar onto the frame
        setJMenuBar(mnuBar);
        mnuOperation = new JMenu(("Operation"));
        mnuClear = new JMenu("Clear");
        mnuExit = new JMenu("Exit");
        mniAdd = new JMenuItem("Add");
        mniSubtract = new JMenuItem("Subtract");
        mniMultiply = new JMenuItem("Multiply");
        mniDivide = new JMenuItem("Divide");
        mniExit = new JMenuItem("Exit");
        mniClear = new JMenuItem("Clear");

        mnuOperation.add(mniAdd);
        mnuOperation.add(mniSubtract);
        mnuOperation.add(mniMultiply);
        mnuOperation.add(mniDivide);
        mnuClear.add(mniClear);
        mnuExit.add(mniExit);

        mnuBar.add(mnuOperation);
        mnuBar.add(mnuClear);
        mnuBar.add(mnuExit);
        //pnlMenu.add(mnuBar);
        add(pnlMenu);

        pnlForm.add(lblNumOne);
        pnlForm.add(txtNum1);
        pnlForm.add(lblNumTwo);
        pnlForm.add(txtNum2);
        pnlForm.add(lblResult);
        pnlForm.add(txtResult);
        add(pnlForm);

        txtResult.setEnabled(false);

        pnlButtons.add(btnAdd);
        pnlButtons.add(btnSubtract);
        pnlButtons.add(btnMultiply);
        pnlButtons.add(btnDivide);
        add(pnlButtons);

        btnAdd.addActionListener(this);
        btnSubtract.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnDivide.addActionListener(this);
        mniClear.addActionListener(this);
        mniAdd.addActionListener(this);
        mniSubtract.addActionListener(this);
        mniMultiply.addActionListener(this);
        mniDivide.addActionListener(this);
        mniExit.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnAdd || e.getSource() == mniAdd) {
            try {
                double num1 = Double.parseDouble(txtNum1.getText());
                double num2 = Double.parseDouble(txtNum2.getText());
                double result = num1 + num2;
                txtResult.setText(Double.toString(result));

            } catch (NumberFormatException a) {
                JOptionPane.showMessageDialog(null, "Please enter valid numbers");
            }
        }

        if (e.getSource() == btnSubtract || e.getSource() == mniSubtract) {
            try {
                double num1 = Double.parseDouble(txtNum1.getText());
                double num2 = Double.parseDouble(txtNum2.getText());
                double result = num1 - num2;
                txtResult.setText(Double.toString(result));

            } catch (NumberFormatException a) {
                JOptionPane.showMessageDialog(null, "Please enter valid numbers");
            }
        }

        if (e.getSource() == btnMultiply || e.getSource() == mniMultiply) {
            try {
                double num1 = Double.parseDouble(txtNum1.getText());
                double num2 = Double.parseDouble(txtNum2.getText());
                double result = num1 * num2;
                txtResult.setText(Double.toString(result));

            } catch (NumberFormatException a) {
                JOptionPane.showMessageDialog(null, "Please enter valid numbers");
            }
        }

        if (e.getSource() == btnDivide || e.getSource() == mniDivide) {
            try {
                int num1 = Integer.parseInt(txtNum1.getText());
                int num2 = Integer.parseInt(txtNum2.getText());
                double result = num1 / num2;
                txtResult.setText(Double.toString(result));

            } catch (ArithmeticException a) {
                JOptionPane.showMessageDialog(null, "Cannot divide by zero");
            } catch (NumberFormatException a) {
                JOptionPane.showMessageDialog(null, "Please enter valid numbers");
            }
        }

        // doing it this way so that the text doesnt immediately clear after
        if (e.getSource() == mniClear) {
                if (txtNum1.getText().equals("") && txtNum2.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "No values to clear");
                }
                txtNum1.setText("");
                txtNum2.setText("");
                txtResult.setText("");
                
        }

        if (e.getSource() == mniExit) {
            dispose();
        }
    }

}// end of class
