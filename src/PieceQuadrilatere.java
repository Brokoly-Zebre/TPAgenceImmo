import javax.naming.spi.DirStateFactory.Result;

public class PieceQuadrilatere extends Piece {

    private int longueur;
    private int largeur;

    public PieceQuadrilatere(TypePiece typePiece, String niveau, int unelongueur, int unelargeur) {
        super(typePiece, niveau);
       this.largeur = unelargeur;
       this.longueur = unelongueur;

    }



    public double surface() {
        double result = 0;
        result = longueur * largeur;
        return result;
    }
    
}


