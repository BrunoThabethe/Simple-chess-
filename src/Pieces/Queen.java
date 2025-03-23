package Pieces;

import java.awt.Color;
import java.awt.Graphics2D;

public class Queen extends Piece {
    public Queen(int x, int y, Color color) {
        super(x, y, color, "Queen");
    }

    @Override
    public void draw(Graphics2D g2) {
        g2.setColor(color);
        g2.fillOval(x * 100, y * 100, 100, 100); // Draw the Queen as a square (simple example)
    }
}
