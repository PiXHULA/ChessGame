package Board;

public enum SquareSize {
    SQUARESIZE(BoardSize.BOARDSIZE.getSizeX() / 8, BoardSize.BOARDSIZE.getSizeY() / 8);

    private int sizeX;
    private int sizeY;

    SquareSize(int x, int y) {
        this.sizeX = x;
        this.sizeY = y;
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }
}
