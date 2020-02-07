package com.chelsea.game;


import java.awt.*;
import java.awt.font.TextLayout;
import java.awt.geom.Rectangle2D;

public class DrawUtils {
    private DrawUtils() {} // you can't create a version of this class, it's just a static version

    public static int getMessageWidth(String message, Font font, Graphics2D g) {
        g.setFont(font);
        Rectangle2D bounds = g.getFontMetrics().getStringBounds(message, g);
        return (int) bounds.getWidth();
    }

    public static int getMessageHeight(String message, Font font, Graphics2D g) {
        // java build padding to the fonts in height. ex, 28 px font will give you 30px
        //use textLayout to solve this issue
        g.setFont(font);
        if (message.length() == 0) {
            return 0;
        }

        TextLayout tl = new TextLayout(message, font, g.getFontRenderContext());
        return (int) tl.getBounds().getHeight();
    }

}
