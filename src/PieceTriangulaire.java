public class PieceTriangulaire extends Piece {


private int base;
private int hauteur;


public PieceTriangulaire(TypePiece typePiece, String niveau, int uneBase, int uneHauteur) {
    super(typePiece, niveau);
   this.base = uneBase;
   this.hauteur = uneHauteur;
}



public double surface() {
    double result = 0;
    result = 1 / 2 *  base * hauteur;
    return result;
}



    
}
