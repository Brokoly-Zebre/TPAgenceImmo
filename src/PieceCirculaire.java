public class PieceCirculaire extends Piece {
    
private int rayon;

public PieceCirculaire(TypePiece typePiece, String niveau, int rayon) {
    super(typePiece, niveau);
    this.rayon = rayon;
}


public double surface() {
    double result = 0;
    result = Math.PI * Math.pow(rayon,2);
    return result;
}




}
