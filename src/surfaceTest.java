import static org.junit.Assert.assertEquals;

public class surfaceTest {
    
    @Test
    public void PieceCirculaireTest(){
            Piece maPiece = new PieceCirculaire(null, null, 2);
            assertEquals(12.56, maPiece.surface(), 1e-2);
          
        
    }



    
}
