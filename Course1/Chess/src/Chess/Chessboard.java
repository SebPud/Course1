package Chess;

public class Chessboard {

    public static void main(String[] args) {

        chessBoard();
        for (Checkers[] a: chessBoard()
             ) {
            System.out.println();
            for (Checkers b: a
                 ) {
                System.out.print(" " + b);

            }

        }

    }

    public static Checkers[][] chessBoard() {
        return new Checkers[][]{

                new Checkers[]{null, null, null, null, null, null, null, null, null},
                new Checkers[]{Checkers.B_PAWN, Checkers.B_PAWN, null, null, null, null, null, Checkers.W_PAWN, null},
                new Checkers[]{null, null, null, null, null, null, null, null, null},
                new Checkers[]{null, null, null, null, null, null, null, null, null},
                new Checkers[]{null, Checkers.B_KING, Checkers.B_PAWN, null, null, Checkers.W_KING, null, null, null},
                new Checkers[]{null, Checkers.B_KNIGHT, null, null, Checkers.W_ROOK, null, Checkers.W_PAWN, null, null},
                new Checkers[]{null, null, null, Checkers.B_ROOK, null, null, null, null, null},
                new Checkers[]{null, Checkers.W_KING, null, null, null, null, null, null, null},

        };
    }
}
