/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.flyweight;

import java.util.HashMap;
import java.awt.Color;

/**
 *
 * @author drochaju
 */
public class RectFactory {

    private static final HashMap<Color, MyRect> rectsByColor = new HashMap<>();

    public static MyRect getRect(Color color) {
        MyRect rect = (MyRect) rectsByColor.get(color);

        if (rect == null) {
            rect = new MyRect(color);
            rectsByColor.put(color, rect);
        }

        return rect;
    }
}
