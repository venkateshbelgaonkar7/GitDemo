package com.journal4thsem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SwingDemo extends JFrame
{
    public static void main(String[] args)
    {
        new SwingDemo();
    }

    SwingDemo()
    {
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();
        JLabel l1 = new JLabel("Num1");
        JLabel l2 = new JLabel("Num2");
        JLabel l3 = new JLabel("Result");
        JButton b1 = new JButton("Divide");

        l1.setBounds(100, 100, 80, 50);
        t1.setBounds(200, 100, 80, 50);
        l2.setBounds(100, 180, 80 ,50);
        t2.setBounds(200, 180, 80, 50);
        l3.setBounds(100, 250, 80, 50);
        t3.setBounds(200, 250, 80, 50);
        b1.setBounds(150, 330, 80, 50);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);

        this.getRootPane().setDefaultButton(b1); //to active enter key in button component

        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {

                try
                {

                    float n1 = Integer.parseInt(t1.getText());
                    float n2 = Integer.parseInt(t2.getText());
                    if(n2==0)
                    {
                        throw new ArithmeticException("Cannot divide by zero");
                    }
                    float result  = n1/n2;
                    t3.setText(result+" ");
                }
                catch(Exception e1)
                {
                    JOptionPane.showMessageDialog(b1, e1+" ","Error",JOptionPane.ERROR_MESSAGE);
                }
            }

        });

        setLayout(null);
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}