package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MainFrame extends JFrame
{
    String m_cylinder_volume = "0.0";

    private String m_volume_label_text = "Cylinder volume: ";
    private JLabel m_volume_label = new JLabel(m_volume_label_text + m_cylinder_volume);

    private JButton m_button = new JButton("Calculate");
    private JTextField m_height_field = new JTextField(10);
    private JTextField m_radius_field = new JTextField(10);

    public MainFrame(String title)
    {
        super(title);
        this.setVisible(true);
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set layout manager
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(layout);

        // create swing components
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(new JLabel("Cylinder height: "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        this.add(m_height_field);

        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(new JLabel("Cylinder radius: "), gbc);

        gbc.gridx = 1;
        gbc.gridx = 1;
        this.add(m_radius_field, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        this.add(m_volume_label, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        m_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println(m_height_field.getText());
            }
        });
        this.add(m_button, gbc);

    }
}































