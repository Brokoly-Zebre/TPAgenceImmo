public abstract class Piece {
    
private TypePiece typePiece;
private String niveau;



public Piece(TypePiece typePiece, String niveau) {
    this.typePiece = typePiece;
    this.niveau = niveau;
}


public abstract double surface();

public String toString(){

    return typePiece + "surface" + "surface" + surface() + "m2\n";


}
    


public static TypePiece getTypePiece() {
    return typePiece;
}



public String getNiveau() {
    return niveau;
}




}
