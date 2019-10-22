package ChessPieces;

public enum ChessPieceColor {
    WHITE("White"),BLACK("Black");
    String color;
    ChessPieceColor(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
