public enum BoardSize {
    BOARDSIZE(400,400);

    private int sizeX;
    private int sizeY;
    BoardSize (int x, int y){
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
