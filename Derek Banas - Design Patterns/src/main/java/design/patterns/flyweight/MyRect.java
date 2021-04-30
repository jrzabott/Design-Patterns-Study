/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.flyweight;

import java.awt.*;

/**
 *
 * @author drochaju
 */
public class MyRect {

    private Color color;
    private int x1, y1, x2, y2;

    public MyRect(Color color, int x1, int y1, int x2, int y2) {
        this.color = color;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public MyRect(Color color) {
        this.color = color;
    }

    public void draw(Graphics g, int x1, int y1, int x2, int y2) {
        g.setColor(color);
        g.fillRect(x1, y1, x2, y2);
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x1, y1, x2, y2);
    }

}
