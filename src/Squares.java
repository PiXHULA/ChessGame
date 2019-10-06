public enum Squares {



    A1(0,0),A2(50,0),A3(100,0),A4(150,0),
    A5(200,0),A6(250,0),A7(300,0),A8(350,0),

    B1(A1.getCoordX(),50),B2(A2.getCoordX(),50),B3(A3.getCoordX(),50),B4(A4.getCoordX(),50),
    B5(A5.getCoordX(),50),B6(A6.getCoordX(),50),B7(A7.getCoordX(),50),B8(A8.getCoordX(),50),

    C1(A1.getCoordX(),B1.getCoordY() * 2),C2(A2.getCoordX(),B1.getCoordY() * 2),
    C3(A3.getCoordX(),B1.getCoordY() * 2),C4(A4.getCoordX(),B1.getCoordY() * 2),
    C5(A5.getCoordX(),B1.getCoordY() * 2),C6(A6.getCoordX(),B1.getCoordY() * 2),
    C7(A7.getCoordX(),B1.getCoordY() * 2),C8(A8.getCoordX(),B1.getCoordY() * 2),

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
    H7(A7.getCoordX(),B1.getCoordY() * 7),H8(A8.getCoordX(),B1.getCoordY() * 7);


    private int coordX;
    private int coordY;

    Squares(int x, int y){
        this.coordX = x;
        this.coordY = y;
    }

    public int getCoordX() {
        return coordX;
    }

    public int getCoordY() {
        return coordY;
    }
}
