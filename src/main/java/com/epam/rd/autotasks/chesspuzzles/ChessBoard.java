package com.epam.rd.autotasks.chesspuzzles;

import java.util.Collection;

public interface ChessBoard {
    static ChessBoard of(Collection<ChessPiece> pieces) {
        // Implement a concrete method to return an instance of ChessBoardImpl
        return new ChessBoardImpl(pieces);
    }

    String state();
}
