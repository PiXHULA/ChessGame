public enum BoardSize {
    //OBS! NEEDS TO BE ABLE TO DIVIDE BY 8
    BOARDSIZE(600,600);

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
