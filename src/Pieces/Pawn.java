package Pieces;

// Created by Vince Cloutier on May 6, 2023.
public class Pawn extends Piece {

    public Pawn(int x, int y, boolean isAi) {
        super(x, y, isAi);
    }

    public boolean isValidPath(int finalX, int finalY) {
        return false;
    }

}