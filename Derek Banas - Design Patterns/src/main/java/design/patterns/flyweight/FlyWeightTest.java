/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.flyweight;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import java.util.Random;
import java.awt.event.*;

/**
 *
 * @author drochaju
 */
public class FlyWeightTest extends JFrame {

    JButton startDrawing;

    int windowWidth = 800;
    int windowHeight = 600;

    Color[] shapeColor = {Color.orange, Color.red, Color.yellow, Color.blue, Color.pink, Color.cyan, Color.magenta, Color.black, Color.gray};

    public FlyWeightTest() {

        this.setSize(windowWidth, windowHeight);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flyweight Test");

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());

        final JPanel drawingPanel = new JPanel();

        startDrawing = new JButton("Draw Stuff");

        contentPane.add(drawingPanel, BorderLayout.CENTER);
        contentPane.add(startDrawing, BorderLayout.SOUTH);

        startDrawing.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Graphics g = drawingPanel.getGraphics();

                long startTime;
                long endTime;

                startTime = System.currentTimeMillis();
                for (int i = 0; i < 1000000; i++) {
                    MyRect rect = RectFactory.getRect(getRandColor());
                    rect.draw(g, getRandX(), getRandY(), getRandX(), getRandY());
                }
                endTime = System.currentTimeMillis();
                System.out.println("1. That took " + (endTime - startTime));

                startTime = System.currentTimeMillis();
                for (int i = 0; i < 1000000; i++) {

                    g.setColor(getRandColor());
                    int x1, x2, y1, y2;
                    x1 = getRandX();
                    x2 = getRandX();
                    y1 = getRandY();
                    y2 = getRandY();
                    g.fillRect(x1, y1, x2, y2);
                }
                endTime = System.currentTimeMillis();
                System.out.println("2. That took " + (endTime - startTime));

                startTime = System.currentTimeMillis();
                for (int i = 0; i < 1000000; i++) {

                   MyRect rect = new MyRect(getRandColor(), getRandX(), getRandY(), getRandX(), getRandY());
                   rect.draw(g);
                }
                endTime = System.currentTimeMillis();
                System.out.println("3. That took " + (endTime - startTime));
            }

        });

        this.add(contentPane);
        this.setVisible(true);
    }

    private Color getRandColor() {
        Random r = new Random();

        int randInt = r.nextInt(9);
        return shapeColor[randInt];

    }

    private int getRandX() {
        return (int) (Math.random() * windowWidth);
    }

    private int getRandY() {
        return (int) (Math.random() * windowHeight);
    }

    public static void main(String[] args) {
        new FlyWeightTest();
    }

}
