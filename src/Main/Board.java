package Main;

import Pieces.King;
import Pieces.Queen;
import Pieces.Rook;
import Pieces.Knight;
import Pieces.Bishop;
import Pieces.Pawn;
import Pieces.Piece;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public class Board {
    final int MAX_COL = 8;
    final int MAX_ROW = 8;
    public static final int SQUARE_SIZE = 100;
    public static final int HALF_SQUARE_SIZE = SQUARE_SIZE / 2;

    // Store pieces on the board
    private List<Piece> pieces = new ArrayList<>();

    public Board() {
        // Add white pieces
        pieces.add(new Rook(0, 0, Color.WHITE));
        pieces.add(new Knight(1, 0, Color.WHITE));
        pieces.add(new Bishop(2, 0, Color.WHITE));
        pieces.add(new Queen(3, 0, Color.WHITE));
        pieces.add(new King(4, 0, Color.WHITE));
        pieces.add(new Bishop(5, 0, Color.WHITE));
        pieces.add(new Knight(6, 0, Color.WHITE));
        pieces.add(new Rook(7, 0, Color.WHITE));

        for (int i = 0; i < MAX_COL; i++) {
            pieces.add(new Pawn(i, 1, Color.WHITE));
        }

        // Add black pieces
        pieces.add(new Rook(0, 7, Color.BLACK));
        pieces.add(new Knight(1, 7, Color.BLACK));
        pieces.add(new Bishop(2, 7, Color.BLACK));
        pieces.add(new Queen(3, 7, Color.BLACK));
        pieces.add(new King(4, 7, Color.BLACK));
        pieces.add(new Bishop(5, 7, Color.BLACK));
        pieces.add(new Knight(6, 7, Color.BLACK));
        pieces.add(new Rook(7, 7, Color.BLACK));

        for (int i = 0; i < MAX_COL; i++) {
            pieces.add(new Pawn(i, 6, Color.BLACK));
        }
    }

    public void draw(Graphics2D g2) {
        int c = 0;

        // Draw the board squares
        for (int row = 0; row < MAX_ROW; row++) {
            for (int col = 0; col < MAX_COL; col++) {
                if (c == 0) {
                    g2.setColor(new Color(210, 165, 125)); // Light square
                    c = 1;
                } else {
                    g2.setColor(new Color(175, 115, 70)); // Dark square
                    c = 0;
                }
                g2.fillRect(col * SQUARE_SIZE, row * SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);
            }
            c = (c == 0) ? 1 : 0; // Alternate starting color for next row
        }

        // Draw the pieces
        for (Piece piece : pieces) {
            piece.draw(g2);
        }
    }
}
