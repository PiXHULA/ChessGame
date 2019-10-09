package Board;

public enum SquareSize {
    SQUARESIZE(BoardSize.BOARDSIZE.getSizeX() / 8);

    private int size;

    SquareSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
