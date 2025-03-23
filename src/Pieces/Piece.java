package Pieces;

import java.awt.Color;
import java.awt.Graphics2D;

public abstract class Piece {
    protected int x, y;  // Position of the piece
    protected Color color; // Piece color
    protected String type; // Piece type (e.g., King, Queen)

    public Piece(int x, int y, Color color, String type) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.type = type;
    }

    // Abstract method for drawing the piece (implemented in subclasses)
    public abstract void draw(Graphics2D g2);
}
