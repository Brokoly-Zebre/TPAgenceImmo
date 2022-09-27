import java.text.DecimalFormat;

public class Annonce {
    
private String reference;
private String date;
private String titre;
private double prixM2Habitable;
private BienImmobilier logement;
public static double COEF_NON_HABITABLE = 0.25;




public Annonce(String reference, String date, String titre, double prixM2Habitable, BienImmobilier logement) {
    this.reference = reference;
    this.date = date;
    this.titre = titre;
    this.prixM2Habitable = prixM2Habitable;
    this.logement = logement;
}

public double prix(){

   double result = 0;
    result = logement.surfaceHabitable() * prixM2Habitable + logement.surfaceNonHabitable() * prixM2Habitable * COEF_NON_HABITABLE;
   return result;

}

@Override
public String toString() {
    DecimalFormat numberFormat = new DecimalFormat("#.00");
    return "\nLocalisation : " + rue +" " + codePostal+ " " + ville + 
    "\n \n Description du bien : \n" +
    pieces.toString()  +  
    "\nPour une surface habitable de : " + 
    numberFormat.format(surfaceHabitable())+ 
    " m2 et une surface non habitable de : " + 
    numberFormat.format(surfaceNonHabitable())+" m2.";
}

}
