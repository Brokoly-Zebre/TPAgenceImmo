public class PieceTrapezoidale extends Piece  {
    
  
    private int base;
    private int hauteur;
    private int Base;



      public PieceTrapezoidale(TypePiece typePiece, String niveau, int unebase, int uneHauteur, int uneBase) {
        super(typePiece, niveau);
        this.base = unebase;
        this.Base = uneBase;
        this.hauteur = uneHauteur;
    }




    public double surface() {
        double result = 0;
        result = 1 / 2 * hauteur *(Base + base);
        return result;
    }
    



}
