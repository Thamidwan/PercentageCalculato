/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication50;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

/**
 *
 * @author GOD IS GOOD
 */
public class Tester  extends JFrame{
    
    private JPanel headingPnl;
    private JPanel enterPnl;
    private JPanel tipAmountPnl;
    private JPanel leavePnl;
    private  JPanel centerPnl;
    
    
    private JLabel headingLbl;
    private JLabel enterLbl;
    private JLabel tipAmountLbl;
    private JLabel leaveLbl;
    
    private JSlider tipSlid;
    
    private JTextField enterTxtFl;
    private JTextField calcuTxtFl;
    
    private JButton calciBtn;
    
    public void Gui(){
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 600);
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        enterPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        tipAmountPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        leavePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        centerPnl = new JPanel(new GridLayout(2, 1));
        
        headingLbl = new JLabel("Javascript Slider Calculator");
        headingLbl.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
        enterLbl = new JLabel("Enter The bill amount for your meal");
        tipAmountLbl = new JLabel("Tip amount :25%");
        leaveLbl = new JLabel("Tip To leave :6.25$");
        
        enterTxtFl = new JTextField(20);
        calcuTxtFl = new JTextField(10);
        
        tipSlid = new JSlider(1, 30);
        
        calciBtn = new JButton("Submit");
        calciBtn.addActionListener(new subB());
        
        enterPnl.add(enterLbl);
        enterPnl.add(enterTxtFl);
        headingPnl.add(headingLbl);
        tipAmountPnl.add(tipAmountLbl);
        tipAmountPnl.add(tipSlid);
        
        
        leavePnl.add(leaveLbl);
        leavePnl.add(calcuTxtFl);
        leavePnl.add(calciBtn);
        centerPnl.add(enterPnl);
        centerPnl.add(tipAmountPnl);
        
        add(headingPnl,BorderLayout.NORTH);
        add(centerPnl,BorderLayout.CENTER);
        add(leavePnl,BorderLayout.SOUTH);
        
        pack();
        setVisible(true);
    }
    
    private class subB implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
           int  num = Integer.parseInt(enterTxtFl.getText());
           int num2 = tipSlid.getValue();
           
           int total = num * num2;
           Double tum = (double) total;
           Double tl = 0.25*tum;
           
           calcuTxtFl.setText(""+tl);
           
        }
    }
    
}
