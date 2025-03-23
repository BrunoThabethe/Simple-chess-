package Pieces;

import java.awt.Color;
import java.awt.Graphics2D;

public class King extends Piece {
    public King(int x, int y, Color color) {
        super(x, y, color, "King");
    }

    @Override
    public void draw(Graphics2D g2) {
        g2.setColor(color);
        g2.fillOval(x * 100, y * 100, 100, 100); // Draw the King as a simple circle
    }
}
