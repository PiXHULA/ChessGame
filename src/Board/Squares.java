package Board;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public enum Squares {
    //Coordinates for the whole board
    //FIRST ROW SETS THE COORDS FOR THE REST OF THE BOARD

    A1(SquareSize.SQUARESIZE.getSize() - SquareSize.SQUARESIZE.getSize(),
       SquareSize.SQUARESIZE.getSize() - SquareSize.SQUARESIZE.getSize(), "White"),
    A2(   SquareSize.SQUARESIZE.getSize(),    SquareSize.SQUARESIZE.getSize() - SquareSize.SQUARESIZE.getSize(),"Black"),
    A3(SquareSize.SQUARESIZE.getSize() * 2,SquareSize.SQUARESIZE.getSize() - SquareSize.SQUARESIZE.getSize(), "White"),
    A4(SquareSize.SQUARESIZE.getSize() * 3,SquareSize.SQUARESIZE.getSize() - SquareSize.SQUARESIZE.getSize(),"Black"),
    A5(SquareSize.SQUARESIZE.getSize() * 4,SquareSize.SQUARESIZE.getSize() - SquareSize.SQUARESIZE.getSize(), "White"),
    A6(SquareSize.SQUARESIZE.getSize() * 5,SquareSize.SQUARESIZE.getSize() - SquareSize.SQUARESIZE.getSize(),"Black"),
    A7(SquareSize.SQUARESIZE.getSize() * 6,SquareSize.SQUARESIZE.getSize() - SquareSize.SQUARESIZE.getSize(), "White"),
    A8(SquareSize.SQUARESIZE.getSize() * 7,SquareSize.SQUARESIZE.getSize() - SquareSize.SQUARESIZE.getSize(),"Black"),

    B1(A1.getCoordX(),SquareSize.SQUARESIZE.getSize(),"Black"),
    B2(A2.getCoordX(),SquareSize.SQUARESIZE.getSize(), "White"),
    B3(A3.getCoordX(),SquareSize.SQUARESIZE.getSize(),"Black"),
    B4(A4.getCoordX(),SquareSize.SQUARESIZE.getSize(), "White"),
    B5(A5.getCoordX(),SquareSize.SQUARESIZE.getSize(),"Black"),
    B6(A6.getCoordX(),SquareSize.SQUARESIZE.getSize(), "White"),
    B7(A7.getCoordX(),SquareSize.SQUARESIZE.getSize(),"Black"),
    B8(A8.getCoordX(),SquareSize.SQUARESIZE.getSize(), "White"),

    C1(A1.getCoordX(),B1.getCoordY() * 2, "White"),
    C2(A2.getCoordX(),B1.getCoordY() * 2,"Black"),
    C3(A3.getCoordX(),B1.getCoordY() * 2, "White"),
    C4(A4.getCoordX(),B1.getCoordY() * 2,"Black"),
    C5(A5.getCoordX(),B1.getCoordY() * 2, "White"),
    C6(A6.getCoordX(),B1.getCoordY() * 2,"Black"),
    C7(A7.getCoordX(),B1.getCoordY() * 2, "White"),
    C8(A8.getCoordX(),B1.getCoordY() * 2,"Black"),

    D1(A1.getCoordX(),B1.getCoordY() * 3,"Black"),
    D2(A2.getCoordX(),B1.getCoordY() * 3, "White"),
    D3(A3.getCoordX(),B1.getCoordY() * 3,"Black"),
    D4(A4.getCoordX(),B1.getCoordY() * 3, "White"),
    D5(A5.getCoordX(),B1.getCoordY() * 3,"Black"),
    D6(A6.getCoordX(),B1.getCoordY() * 3, "White"),
    D7(A7.getCoordX(),B1.getCoordY() * 3,"Black"),
    D8(A8.getCoordX(),B1.getCoordY() * 3, "White"),

    E1(A1.getCoordX(),B1.getCoordY() * 4, "White"),
    E2(A2.getCoordX(),B1.getCoordY() * 4,"Black"),
    E3(A3.getCoordX(),B1.getCoordY() * 4, "White"),
    E4(A4.getCoordX(),B1.getCoordY() * 4,"Black"),
    E5(A5.getCoordX(),B1.getCoordY() * 4, "White"),
    E6(A6.getCoordX(),B1.getCoordY() * 4,"Black"),
    E7(A7.getCoordX(),B1.getCoordY() * 4, "White"),
    E8(A8.getCoordX(),B1.getCoordY() * 4,"Black"),

    F1(A1.getCoordX(),B1.getCoordY() * 5,"Black"),
    F2(A2.getCoordX(),B1.getCoordY() * 5, "White"),
    F3(A3.getCoordX(),B1.getCoordY() * 5,"Black"),
    F4(A4.getCoordX(),B1.getCoordY() * 5, "White"),
    F5(A5.getCoordX(),B1.getCoordY() * 5,"Black"),
    F6(A6.getCoordX(),B1.getCoordY() * 5, "White"),
    F7(A7.getCoordX(),B1.getCoordY() * 5,"Black"),
    F8(A8.getCoordX(),B1.getCoordY() * 5, "White"),

    G1(A1.getCoordX(),B1.getCoordY() * 6, "White"),
    G2(A2.getCoordX(),B1.getCoordY() * 6,"Black"),
    G3(A3.getCoordX(),B1.getCoordY() * 6, "White"),
    G4(A4.getCoordX(),B1.getCoordY() * 6,"Black"),
    G5(A5.getCoordX(),B1.getCoordY() * 6, "White"),
    G6(A6.getCoordX(),B1.getCoordY() * 6,"Black"),
    G7(A7.getCoordX(),B1.getCoordY() * 6, "White"),
    G8(A8.getCoordX(),B1.getCoordY() * 6,"Black"),

    H1(A1.getCoordX(),B1.getCoordY() * 7,"Black"),
    H2(A2.getCoordX(),B1.getCoordY() * 7, "White"),
    H3(A3.getCoordX(),B1.getCoordY() * 7,"Black"),
    H4(A4.getCoordX(),B1.getCoordY() * 7, "White"),
    H5(A5.getCoordX(),B1.getCoordY() * 7,"Black"),
    H6(A6.getCoordX(),B1.getCoordY() * 7, "White"),
    H7(A7.getCoordX(),B1.getCoordY() * 7,"Black"),
    H8(A8.getCoordX(),B1.getCoordY() * 7, "White");


    private int coordX;
    private int coordY;
    private String color;
    List<Squares> BoardList = new LinkedList<>();


    Squares(int x, int y, String color){
        this.coordX = x;
        this.coordY = y;
        this.color = color;
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

    public String getColor() {
        return color;
    }
}
