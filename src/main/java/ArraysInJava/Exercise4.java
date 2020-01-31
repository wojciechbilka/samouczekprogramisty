package ArraysInJava;

public class Exercise4 {
    private enum Figure{
        W_KING, W_QUEEN, W_ROOK, W_BISHOP, W_KNIGHT, W_PAWN, B_KING, B_QUEEN, B_ROOK, B_BISHOP, B_KNIGHT, B_PAWN
    }
    private Figure[][] board;

    public Exercise4() {
        board = new Figure[][] {{Figure.W_ROOK,   Figure.W_KNIGHT,  Figure.W_BISHOP,  Figure.W_KING,   Figure.W_QUEEN,   Figure.W_BISHOP,  Figure.W_KNIGHT,  Figure.W_ROOK},
                                {Figure.W_PAWN,   Figure.W_PAWN,    Figure.W_PAWN,    Figure.W_PAWN,   Figure.W_PAWN,    Figure.W_PAWN,    Figure.W_PAWN,    Figure.W_PAWN},
                                {null,            null,             null,             null,            null,             null,             null,             null},
                                {null,            null,             null,             null,            null,             null,             null,             null},
                                {null,            null,             null,             null,            null,             null,             null,             null},
                                {null,            null,             null,             null,            null,             null,             null,             null},
                                {Figure.B_PAWN,   Figure.B_PAWN,    Figure.B_PAWN,    Figure.B_PAWN,   Figure.B_PAWN,   Figure.B_PAWN,     Figure.B_PAWN,    Figure.B_PAWN},
                                {Figure.B_ROOK,   Figure.B_KNIGHT,  Figure.B_BISHOP,  Figure.B_KING,   Figure.B_QUEEN,  Figure.B_BISHOP,   Figure.B_KNIGHT,  Figure.B_ROOK}};
    }
    public Exercise4(Figure[][] board) {
        this.board = board;
    }

    public static Exercise4 get5thGameFinalState() {
        Exercise4 state = new Exercise4(new Figure[][] {
                {null, null, Figure.W_ROOK, null, null, null, Figure.W_KING, null},
                {null, null, null, null, null, Figure.W_PAWN, null, null},
                {null, null, null, null, null, null, Figure.W_PAWN, null},
                {null, Figure.W_ROOK, null, null, null, null, null, Figure.W_PAWN},
                {Figure.W_PAWN, null, Figure.W_QUEEN, Figure.B_PAWN, Figure.W_PAWN, null, null, Figure.B_PAWN},
                {Figure.B_PAWN, Figure.W_PAWN, Figure.B_PAWN, null, Figure.B_PAWN, Figure.W_BISHOP, Figure.B_PAWN, Figure.B_KING},
                {null, Figure.B_QUEEN, null, null, null, Figure.B_PAWN, null, null},
                {Figure.B_ROOK, Figure.B_BISHOP, Figure.B_ROOK, null, null, null, null, null}});
        return state;
    }
}
