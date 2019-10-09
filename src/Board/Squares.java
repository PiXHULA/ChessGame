package Board;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public enum Squares {
    //Coordinates for the whole board
    //FIRST ROW SETS THE COORDS FOR THE REST OF THE BOARD

    A1(SquareSize.SQUARESIZE.getSize() - SquareSize.SQUARESIZE.getSize(),
       SquareSize.SQUARESIZE.getSize() - SquareSize.SQUARESIZE.getSize()),
    A2(   SquareSize.SQUARESIZE.getSize(),    SquareSize.SQUARESIZE.getSize() - SquareSize.SQUARESIZE.getSize()),
    A3(SquareSize.SQUARESIZE.getSize() * 2,SquareSize.SQUARESIZE.getSize() - SquareSize.SQUARESIZE.getSize()),
    A4(SquareSize.SQUARESIZE.getSize() * 3,SquareSize.SQUARESIZE.getSize() - SquareSize.SQUARESIZE.getSize()),
    A5(SquareSize.SQUARESIZE.getSize() * 4,SquareSize.SQUARESIZE.getSize() - SquareSize.SQUARESIZE.getSize()),
    A6(SquareSize.SQUARESIZE.getSize() * 5,SquareSize.SQUARESIZE.getSize() - SquareSize.SQUARESIZE.getSize()),
    A7(SquareSize.SQUARESIZE.getSize() * 6,SquareSize.SQUARESIZE.getSize() - SquareSize.SQUARESIZE.getSize()),
    A8(SquareSize.SQUARESIZE.getSize() * 7,SquareSize.SQUARESIZE.getSize() - SquareSize.SQUARESIZE.getSize()),

    B1(A1.getCoordX(),SquareSize.SQUARESIZE.getSize()),
    B2(A2.getCoordX(),SquareSize.SQUARESIZE.getSize()),
    B3(A3.getCoordX(),SquareSize.SQUARESIZE.getSize()),
    B4(A4.getCoordX(),SquareSize.SQUARESIZE.getSize()),
    B5(A5.getCoordX(),SquareSize.SQUARESIZE.getSize()),
    B6(A6.getCoordX(),SquareSize.SQUARESIZE.getSize()),
    B7(A7.getCoordX(),SquareSize.SQUARESIZE.getSize()),
    B8(A8.getCoordX(),SquareSize.SQUARESIZE.getSize()),

    C1(A1.getCoordX(),B1.getCoordY() * 2),
    C2(A2.getCoordX(),B1.getCoordY() * 2),
    C3(A3.getCoordX(),B1.getCoordY() * 2),
    C4(A4.getCoordX(),B1.getCoordY() * 2),
    C5(A5.getCoordX(),B1.getCoordY() * 2),
    C6(A6.getCoordX(),B1.getCoordY() * 2),
    C7(A7.getCoordX(),B1.getCoordY() * 2),
    C8(A8.getCoordX(),B1.getCoordY() * 2),

    D1(A1.getCoordX(),B1.getCoordY() * 3),D2(A2.getCoordX(),B1.getCoordY() * 3),
    D3(A3.getCoordX(),B1.getCoordY() * 3),D4(A4.getCoordX(),B1.getCoordY() * 3),
    D5(A5.getCoordX(),B1.getCoordY() * 3),D6(A6.getCoordX(),B1.getCoordY() * 3),
    D7(A7.getCoordX(),B1.getCoordY() * 3),D8(A8.getCoordX(),B1.getCoordY() * 3),

    E1(A1.getCoordX(),B1.getCoordY() * 4),E2(A2.getCoordX(),B1.getCoordY() * 4),
    E3(A3.getCoordX(),B1.getCoordY() * 4),E4(A4.getCoordX(),B1.getCoordY() * 4),
    E5(A5.getCoordX(),B1.getCoordY() * 4),E6(A6.getCoordX(),B1.getCoordY() * 4),
    E7(A7.getCoordX(),B1.getCoordY() * 4),E8(A8.getCoordX(),B1.getCoordY() * 4),

    F1(A1.getCoordX(),B1.getCoordY() * 5),F2(A2.getCoordX(),B1.getCoordY() * 5),
    F3(A3.getCoordX(),B1.getCoordY() * 5),F4(A4.getCoordX(),B1.getCoordY() * 5),
    F5(A5.getCoordX(),B1.getCoordY() * 5),F6(A6.getCoordX(),B1.getCoordY() * 5),
    F7(A7.getCoordX(),B1.getCoordY() * 5),F8(A8.getCoordX(),B1.getCoordY() * 5),

    G1(A1.getCoordX(),B1.getCoordY() * 6),G2(A2.getCoordX(),B1.getCoordY() * 6),
    G3(A3.getCoordX(),B1.getCoordY() * 6),G4(A4.getCoordX(),B1.getCoordY() * 6),
    G5(A5.getCoordX(),B1.getCoordY() * 6),G6(A6.getCoordX(),B1.getCoordY() * 6),
    G7(A7.getCoordX(),B1.getCoordY() * 6),G8(A8.getCoordX(),B1.getCoordY() * 6),

    H1(A1.getCoordX(),B1.getCoordY() * 7),H2(A2.getCoordX(),B1.getCoordY() * 7),
    H3(A3.getCoordX(),B1.getCoordY() * 7),H4(A4.getCoordX(),B1.getCoordY() * 7),
    H5(A5.getCoordX(),B1.getCoordY() * 7),H6(A6.getCoordX(),B1.getCoordY() * 7),
    H7(A7.getCoordX(),B1.getCoordY() * 7),
    H8(A8.getCoordX(),B1.getCoordY() * 7);


    private int coordX;
    private int coordY;
    List<Squares> BoardList = new LinkedList<>();


    Squares(int x, int y){
        this.coordX = x;
        this.coordY = y;
    }
    void addToList(Squares square){
        BoardList.add(square);
    }

    public int getCoordX() {
        return coordX;
    }

    public int getCoordY() {
        return coordY;
    }
}
