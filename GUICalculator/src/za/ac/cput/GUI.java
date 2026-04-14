package za.ac.cput;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame implements ActionListener {

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
    private JTextField txtNum1;
    private JTextField txtNum2;
    private JTextField txtResult;

    // buttons
    private JButton btnAdd;
    private JButton btnSubtract;
    private JButton btnMultiply;
    private JButton btnDivide;
    private JButton btnClear;

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
        btnClear = new JButton("Clear");

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
        pnlMenu.add(btnClear);
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
        btnClear.addActionListener(this);
        mniAdd.addActionListener(this);
        mniSubtract.addActionListener(this);
        mniMultiply.addActionListener(this);
        mniDivide.addActionListener(this);

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

        // doing it this way so that the text doesnt immediately clear after
        if (e.getSource() == btnClear) {
            txtNum1.setText("");
            txtNum2.setText("");
            txtResult.setText("");
        }
    }

}// end of class
